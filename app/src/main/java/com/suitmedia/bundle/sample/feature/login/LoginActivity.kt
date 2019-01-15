package com.suitmedia.bundle.sample.feature.login

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import com.suitmedia.bundle.sample.R
import com.suitmedia.bundle.sample.base.ui.BaseActivity
import com.suitmedia.bundle.sample.helper.socialauth.facebook.FacebookHelper
import com.suitmedia.bundle.sample.helper.socialauth.facebook.FacebookListener
import com.suitmedia.bundle.sample.helper.socialauth.twitter.TwitterListener
import com.suitmedia.bundle.sample.helper.socialauth.google.GoogleListener
import com.suitmedia.bundle.sample.helper.socialauth.google.GoogleSignInHelper
import com.suitmedia.bundle.sample.helper.socialauth.twitter.TwitterHelper
import com.suitmedia.bundle.sample.helper.CommonUtils
import kotlinx.android.synthetic.main.activity_login.*
import com.google.android.play.core.splitinstall.*
import com.suitmedia.bundle.sample.base.ui.BaseActivityWithDynamicFeature
import com.suitmedia.bundle.sample.helper.CommonConstant


/**
 * Created by dodydmw19 on 7/18/18.
 */

class LoginActivity : BaseActivityWithDynamicFeature(), LoginView, GoogleListener, FacebookListener, TwitterListener {


    private var loginPresenter: LoginPresenter? = null

    private var mGoogleHelper: GoogleSignInHelper? = null
    private var mTwitterHelper: TwitterHelper? = null
    private var mFbHelper: FacebookHelper? = null


    override val resourceLayout: Int = R.layout.activity_login


    override fun onViewReady(savedInstanceState: Bundle?) {
        initSplitInstallManager(this)
        setupPresenter()
        setupSocialLogin()
        actionClicked()
    }

    private fun setupPresenter() {
        loginPresenter = LoginPresenter()
        loginPresenter?.attachView(this)
    }

    private fun setupSocialLogin() {
        // Google  initialization
        mGoogleHelper = GoogleSignInHelper(this, R.string.default_web_client_id, this)

        // twitter initialization
        mTwitterHelper = TwitterHelper(
                R.string.twitter_api_key,
                R.string.twitter_secret_key,
                this,
                this)

        // fb initialization
        mFbHelper = FacebookHelper(this, getString(R.string.facebook_request_field))

        signOut()
    }

    private fun signOut() {
        mGoogleHelper?.performSignOut()
        mFbHelper?.performSignOut()
    }

    override fun onLoginSuccess(message: String?) {

    }

    override fun onLoginFailed(message: String?) {
        message?.let {
            showToast(message.toString())
        }
    }

    override fun onGoogleAuthSignIn(authToken: String?, userId: String?) {
        // send token & user_id to server
        loginPresenter?.login()
    }

    override fun onGoogleAuthSignInFailed(errorMessage: String?) {
        showToast(errorMessage.toString())
    }

    override fun onFbSignInFail(errorMessage: String?) {
        showToast(errorMessage.toString())
    }

    override fun onFbSignInSuccess(authToken: String?, userId: String?) {
        // send token & user_id to server
        loginPresenter?.login()
    }

    override fun onTwitterError(errorMessage: String?) {
        showToast(errorMessage.toString())
    }

    override fun onTwitterSignIn(authToken: String?, secret: String?, userId: String?) {
        // send token & user_id to server
        loginPresenter?.login()
    }

    private fun actionClicked() {
        relGoogle.setOnClickListener {
            mGoogleHelper?.performSignIn(this)
        }

        relFacebook.setOnClickListener {
            mFbHelper?.performSignIn(this)
        }

        relTwitter.setOnClickListener {
            if (CommonUtils.checkTwitterApp(this)) {
                mTwitterHelper?.performSignIn()
            } else {
                showToast(getString(R.string.txt_twitter_not_installed))
            }
        }

        tvSkip.setOnClickListener {
            loadAndLaunchModule("member")
        }
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
            mGoogleHelper?.onActivityResult(requestCode, resultCode, data)
            mTwitterHelper?.onActivityResult(requestCode, resultCode, data)
            mFbHelper?.onActivityResult(requestCode, resultCode, data)
        }
    }


    override fun onResume() {
        super.onResume()
        splitInstallManager?.registerListener(listener)
    }

    override fun onPause() {
        super.onPause()
        splitInstallManager?.unregisterListener(listener)
    }

    private fun loadAndLaunchModule(name: String) {
        splitInstallManager?.installedModules?.contains(name)?.let {
            if (it) {
                onSuccessfulLoad()
                return
            } else {
                // Create request to install a feature module by name.
                val request = SplitInstallRequest.newBuilder()
                        .addModule(name)
                        .build()

                // Load and install the requested feature module.
                splitInstallManager?.startInstall(request)
            }
        }


    }

    private fun onSuccessfulLoad() {
        val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse(CommonConstant.INTENT_MEMBER_URL))
        intent.addCategory(Intent.CATEGORY_DEFAULT)
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        if (this.applicationContext != null) {
            intent.`package` = applicationContext.packageName
        }
        startActivity(intent)
    }

    override fun onDownloadModule(name: String, state: SplitInstallSessionState) {
        Log.i(packageName, "Downloading module : $name")
    }

    override fun onRequiresUserConfirmation(name: String, state: SplitInstallSessionState) {
        startIntentSender(state.resolutionIntent()?.intentSender, null, 0, 0, 0)
    }

    override fun onInstalled(name: String, state: SplitInstallSessionState) {
        loadAndLaunchModule(name)
    }

    override fun onInstalling(name: String, state: SplitInstallSessionState) {
        Log.i(packageName, "Installing module : $name")
    }

    override fun onFailed(name: String, state: SplitInstallSessionState) {
        Log.e(packageName, "Error Code : ${state.errorCode()}")
        showToast("Download Module Failed $name")
    }
}