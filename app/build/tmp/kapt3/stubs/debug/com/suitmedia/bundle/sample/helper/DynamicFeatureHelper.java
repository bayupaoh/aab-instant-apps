package com.suitmedia.bundle.sample.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u000eH&J\b\u0010\u0012\u001a\u00020\u000eH&J\b\u0010\u0013\u001a\u00020\u000eH&J\b\u0010\u0014\u001a\u00020\u000eH&J\b\u0010\u0015\u001a\u00020\u000eH&R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/suitmedia/bundle/sample/helper/DynamicFeatureHelper;", "", "()V", "listener", "Lcom/google/android/play/core/splitinstall/SplitInstallStateUpdatedListener;", "getListener", "()Lcom/google/android/play/core/splitinstall/SplitInstallStateUpdatedListener;", "splitInstallManager", "Lcom/google/android/play/core/splitinstall/SplitInstallManager;", "getSplitInstallManager", "()Lcom/google/android/play/core/splitinstall/SplitInstallManager;", "setSplitInstallManager", "(Lcom/google/android/play/core/splitinstall/SplitInstallManager;)V", "initSplitInstallManager", "", "context", "Landroid/content/Context;", "onDownloadModule", "onFailed", "onInstalled", "onInstalling", "onRequiresUserConfirmation", "app_debug"})
public abstract class DynamicFeatureHelper {
    @org.jetbrains.annotations.Nullable()
    private com.google.android.play.core.splitinstall.SplitInstallManager splitInstallManager;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener listener = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.play.core.splitinstall.SplitInstallManager getSplitInstallManager() {
        return null;
    }
    
    public final void setSplitInstallManager(@org.jetbrains.annotations.Nullable()
    com.google.android.play.core.splitinstall.SplitInstallManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener getListener() {
        return null;
    }
    
    public final void initSplitInstallManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public abstract void onDownloadModule();
    
    public abstract void onRequiresUserConfirmation();
    
    public abstract void onInstalled();
    
    public abstract void onInstalling();
    
    public abstract void onFailed();
    
    public DynamicFeatureHelper() {
        super();
    }
}