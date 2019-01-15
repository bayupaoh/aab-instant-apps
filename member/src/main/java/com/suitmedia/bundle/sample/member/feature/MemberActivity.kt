package com.suitmedia.bundle.sample.feature

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.play.core.splitinstall.SplitInstallManager
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest
import com.google.android.play.core.splitinstall.SplitInstallSessionState
import com.google.android.play.core.tasks.OnFailureListener
import com.google.android.play.core.tasks.OnSuccessListener
import com.jcodecraeer.xrecyclerview.XRecyclerView
import com.suitmedia.bundle.sample.base.ui.BaseActivity
import com.suitmedia.bundle.sample.base.ui.BaseActivityWithDynamicFeature
import com.suitmedia.bundle.sample.data.api.model.User
import com.suitmedia.bundle.sample.helper.CommonConstant
import com.suitmedia.bundle.sample.member.R
import com.suitmedia.bundle.sample.member.feature.MemberAdapter
import com.suitmedia.bundle.sample.member.feature.MemberItemView
import com.suitmedia.bundle.sample.member.feature.MemberPresenter
import com.suitmedia.bundle.sample.member.feature.MemberView
import com.suitmedia.bundle.sample.R as Rbase
import kotlinx.android.synthetic.main.activity_member.*
import kotlinx.android.synthetic.main.layout_empty_member_shimmer.*

/**
 * Created by DODYDMW19 on 1/30/2018.
 */

class MemberActivity : BaseActivityWithDynamicFeature(),
        MemberView,
        XRecyclerView.LoadingListener,
        MemberItemView.OnActionListener {



    private var memberPresenter: MemberPresenter? = null
    private var currentPage: Int = 1
    private var adapter: MemberAdapter? = null


    override val resourceLayout: Int = R.layout.activity_member

    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, MemberActivity::class.java)
        }
    }

    override fun onViewReady(savedInstanceState: Bundle?) {
        setupToolbarWithTitle(mToolbar, getString(Rbase.string.app_name), false)
        initSplitInstallManager(this)
        setupPresenter()
        actionClicked()
    }

    override fun onPause() {
        super.onPause()
        if (shimmerContainer != null && shimmerContainer.isShimmerStarted) {
            shimmerContainer.stopShimmer()
        }
        splitInstallManager?.unregisterListener(listener)
    }

    override fun onDestroy() {
        super.onDestroy()
        clearRecyclerView(memberList)
    }

    private fun setupPresenter() {
        memberPresenter = MemberPresenter(this, shimmerContainer)
        memberPresenter?.attachView(this)
//        memberPresenter?.getMemberCache()
        memberPresenter?.getMember(currentPage)
    }

    private fun initProduct() {
        adapter = MemberAdapter()
        adapter?.setOnActionListener(this)

        memberList.setUpAsList()

        memberList.adapter = adapter
        memberList.setPullRefreshEnabled(true)
        memberList.setLoadingMoreEnabled(true)
        memberList.setLoadingListener(this)
    }

    private fun setData(data: List<User>?) {
        if (currentPage == 1) {
            adapter.let {
                adapter?.clear()
            }
        }
        adapter?.add(data!!)
        showEmptyState(false, memberList, emptyState)
    }

    override fun onMemberCacheLoaded(members: List<User>?) {
        members.let {
            if (currentPage == 1) {
                initProduct()
            }
            //shimmer.visibility = View.GONE
            if (members?.isNotEmpty()!!) setData(members)
        }
        finishLoad(memberList)
    }

    override fun onMemberLoaded(members: List<User>?) {
        members.let {
            if (currentPage == 1) {
                initProduct()
            }
            if (members?.isNotEmpty()!!) setData(members)
        }
        finishLoad(memberList)
    }

    override fun onMemberEmpty() {
        showEmptyState(true, memberList, emptyState)
    }

    override fun onFailed(message: String?) {
        finishLoad(memberList)
        showEmptyState(true, memberList, emptyState)
        showToast(message!!)
    }

    override fun onLoadMore() {
        currentPage++
        memberPresenter?.getMember(currentPage)
    }

    override fun onRefresh() {
        currentPage = 1
        memberPresenter?.getMember(currentPage)
    }

    override fun onClicked(view: MemberItemView?) {
        view?.let { it ->
            showToast(it.getData().firstName!!)
        }
    }

    private fun actionClicked() {
        tvFragmentSample.setOnClickListener {
            loadAndLaunchModule("fragmentsample")
        }
    }



    override fun onResume() {
        super.onResume()
        splitInstallManager?.registerListener(listener)
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
                Uri.parse(CommonConstant.INTENT_FRAGMENT_SAMPLE_URL))
        intent.addCategory(Intent.CATEGORY_DEFAULT)
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
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