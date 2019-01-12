package com.suitmedia.bundle.sample.helper

import android.content.Context
import com.google.android.play.core.splitinstall.SplitInstallManager
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus

abstract class DynamicFeatureHelper {

     var splitInstallManager: SplitInstallManager ?= null

     val listener = SplitInstallStateUpdatedListener { state ->
        val multiInstall = state.moduleNames().size > 1
        state.moduleNames().forEach { name ->
            when (state.status()) {
                SplitInstallSessionStatus.DOWNLOADING -> onDownloadModule()
                SplitInstallSessionStatus.REQUIRES_USER_CONFIRMATION -> onRequiresUserConfirmation()
                SplitInstallSessionStatus.INSTALLED -> onInstalled()
                SplitInstallSessionStatus.INSTALLING -> onInstalling()
                SplitInstallSessionStatus.FAILED -> onFailed()
            }
        }
    }

    fun initSplitInstallManager(context: Context){
        splitInstallManager = SplitInstallManagerFactory.create(context)
    }

    abstract fun onDownloadModule()
    abstract fun onRequiresUserConfirmation()
    abstract fun onInstalled()
    abstract fun onInstalling()
    abstract fun onFailed()
}