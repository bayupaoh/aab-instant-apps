package com.suitmedia.bundle.sample.firebase.analytics;

import java.lang.System;

/**
 * * Created by DODYDMW19 on 10/19/2017.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/suitmedia/bundle/sample/firebase/analytics/FireBaseHelper;", "", "()V", "mFirebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "initialize", "", "context", "Landroid/content/Context;", "sendEvent", "eventName", "", "data", "Landroid/os/Bundle;", "sendScreen", "screenName", "act", "Landroid/app/Activity;", "Companion", "app_debug"})
public final class FireBaseHelper {
    private com.google.firebase.analytics.FirebaseAnalytics mFirebaseAnalytics;
    private static com.suitmedia.bundle.sample.firebase.analytics.FireBaseHelper sHelper;
    public static final com.suitmedia.bundle.sample.firebase.analytics.FireBaseHelper.Companion Companion = null;
    
    public final void initialize(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    public final void sendScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String screenName, @org.jetbrains.annotations.Nullable()
    android.app.Activity act) {
    }
    
    public final void sendEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String eventName, @org.jetbrains.annotations.NotNull()
    android.os.Bundle data) {
    }
    
    public FireBaseHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/suitmedia/bundle/sample/firebase/analytics/FireBaseHelper$Companion;", "", "()V", "sHelper", "Lcom/suitmedia/bundle/sample/firebase/analytics/FireBaseHelper;", "instance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.suitmedia.bundle.sample.firebase.analytics.FireBaseHelper instance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}