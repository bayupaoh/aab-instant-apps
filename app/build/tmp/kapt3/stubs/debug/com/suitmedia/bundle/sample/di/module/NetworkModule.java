package com.suitmedia.bundle.sample.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/suitmedia/bundle/sample/di/module/NetworkModule;", "", "()V", "cache", "Lokhttp3/Cache;", "file", "Ljava/io/File;", "context", "Landroid/content/Context;", "getOkHttpClient", "Lokhttp3/OkHttpClient;", "lI", "Lokhttp3/logging/HttpLoggingInterceptor;", "okHttpClient", "app_debug"})
@dagger.Module(includes = {com.suitmedia.bundle.sample.di.module.ContextModule.class})
public final class NetworkModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.suitmedia.bundle.sample.di.scope.SuitCoreApplicationScope()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor lI() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.suitmedia.bundle.sample.di.scope.SuitCoreApplicationScope()
    @dagger.Provides()
    public final okhttp3.Cache cache(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.suitmedia.bundle.sample.di.scope.SuitCoreApplicationScope()
    @dagger.Provides()
    public final java.io.File file(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.suitmedia.bundle.sample.di.scope.SuitCoreApplicationScope()
    @dagger.Provides()
    public final okhttp3.OkHttpClient okHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.Cache cache) {
        return null;
    }
    
    private final okhttp3.OkHttpClient getOkHttpClient(okhttp3.Cache cache) {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
}