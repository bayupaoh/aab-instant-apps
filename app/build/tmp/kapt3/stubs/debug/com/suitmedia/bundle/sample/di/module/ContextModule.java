package com.suitmedia.bundle.sample.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0002\u001a\u00020\u0003H\u0007R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/suitmedia/bundle/sample/di/module/ContextModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appContext", "kotlin.jvm.PlatformType", "app_debug"})
@dagger.Module()
public final class ContextModule {
    private final android.content.Context appContext = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.suitmedia.bundle.sample.di.scope.SuitCoreApplicationScope()
    @dagger.Provides()
    public final android.content.Context context() {
        return null;
    }
    
    public ContextModule(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}