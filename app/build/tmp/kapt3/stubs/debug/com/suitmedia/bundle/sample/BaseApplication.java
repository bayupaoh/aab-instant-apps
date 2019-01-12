package com.suitmedia.bundle.sample;

import java.lang.System;

/**
 * * Created by DODYDMW19 on 1/30/2018.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/suitmedia/bundle/sample/BaseApplication;", "Landroid/support/multidex/MultiDexApplication;", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "onCreate", "Companion", "app_debug"})
public final class BaseApplication extends android.support.multidex.MultiDexApplication {
    @org.jetbrains.annotations.NotNull()
    public static com.suitmedia.bundle.sample.di.component.ApplicationComponent applicationComponent;
    public static final com.suitmedia.bundle.sample.BaseApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    public BaseApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/suitmedia/bundle/sample/BaseApplication$Companion;", "", "()V", "applicationComponent", "Lcom/suitmedia/bundle/sample/di/component/ApplicationComponent;", "getApplicationComponent", "()Lcom/suitmedia/bundle/sample/di/component/ApplicationComponent;", "setApplicationComponent", "(Lcom/suitmedia/bundle/sample/di/component/ApplicationComponent;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.suitmedia.bundle.sample.di.component.ApplicationComponent getApplicationComponent() {
            return null;
        }
        
        public final void setApplicationComponent(@org.jetbrains.annotations.NotNull()
        com.suitmedia.bundle.sample.di.component.ApplicationComponent p0) {
        }
        
        private Companion() {
            super();
        }
    }
}