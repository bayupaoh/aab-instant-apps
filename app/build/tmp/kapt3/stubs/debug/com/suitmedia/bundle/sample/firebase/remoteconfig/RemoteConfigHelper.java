package com.suitmedia.bundle.sample.firebase.remoteconfig;

import java.lang.System;

/**
 * *
 * *  Field Params :
 * *  force_message -> for message content force update
 * *  info_message -> for message content info update (can deny)
 * *  minumum_force_android -> latest versionCode for force update
 * *  minimum_info_android -> latest versionCode for info update
 * *
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/suitmedia/bundle/sample/firebase/remoteconfig/RemoteConfigHelper;", "", "()V", "mFirebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "initialize", "", "activity", "Landroid/app/Activity;", "showDialogUpdates", "Companion", "app_debug"})
public final class RemoteConfigHelper {
    private com.google.firebase.remoteconfig.FirebaseRemoteConfig mFirebaseRemoteConfig;
    private static com.suitmedia.bundle.sample.firebase.remoteconfig.RemoteConfigHelper sHelper;
    public static final com.suitmedia.bundle.sample.firebase.remoteconfig.RemoteConfigHelper.Companion Companion = null;
    
    public final void initialize(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    private final void showDialogUpdates(android.app.Activity activity) {
    }
    
    public RemoteConfigHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/suitmedia/bundle/sample/firebase/remoteconfig/RemoteConfigHelper$Companion;", "", "()V", "sHelper", "Lcom/suitmedia/bundle/sample/firebase/remoteconfig/RemoteConfigHelper;", "instance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.suitmedia.bundle.sample.firebase.remoteconfig.RemoteConfigHelper instance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}