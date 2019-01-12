package com.suitmedia.bundle.sample.helper;

import java.lang.System;

/**
 * * Created by DODYDMW19 on 6/6/2016.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/suitmedia/bundle/sample/helper/AppStatus;", "", "()V", "Companion", "app_debug"})
public final class AppStatus {
    private static android.net.ConnectivityManager connectivityManager;
    private static boolean connected;
    public static final com.suitmedia.bundle.sample.helper.AppStatus.Companion Companion = null;
    
    public AppStatus() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/suitmedia/bundle/sample/helper/AppStatus$Companion;", "", "()V", "connected", "", "connectivityManager", "Landroid/net/ConnectivityManager;", "isOnline", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        public final boolean isOnline(@org.jetbrains.annotations.Nullable()
        android.content.Context context) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}