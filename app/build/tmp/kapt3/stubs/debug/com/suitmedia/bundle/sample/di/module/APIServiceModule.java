package com.suitmedia.bundle.sample.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0007J\b\u0010\u0010\u001a\u00020\u000eH\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/suitmedia/bundle/sample/di/module/APIServiceModule;", "", "()V", "apiService", "Lcom/suitmedia/bundle/sample/data/api/APIService;", "retrofit", "Lretrofit2/Retrofit;", "gSon", "Lcom/google/gson/Gson;", "provideBaseUrlHolder", "Lcom/suitmedia/bundle/sample/data/api/model/BaseUrlHolder;", "okHttpClient", "Lokhttp3/OkHttpClient;", "rxJava2CallAdapterFactory", "Lretrofit2/adapter/rxjava2/RxJava2CallAdapterFactory;", "baseUrlHolder", "rxJavaCallAdapter", "app_debug"})
@dagger.Module(includes = {com.suitmedia.bundle.sample.di.module.NetworkModule.class})
public final class APIServiceModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.suitmedia.bundle.sample.di.scope.SuitCoreApplicationScope()
    @dagger.Provides()
    public final com.suitmedia.bundle.sample.data.api.APIService apiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.suitmedia.bundle.sample.di.scope.SuitCoreApplicationScope()
    @dagger.Provides()
    public final retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory rxJavaCallAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.suitmedia.bundle.sample.di.scope.SuitCoreApplicationScope()
    @dagger.Provides()
    public final com.google.gson.Gson gSon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.suitmedia.bundle.sample.di.scope.SuitCoreApplicationScope()
    @dagger.Provides()
    public final retrofit2.Retrofit retrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory rxJava2CallAdapterFactory, @org.jetbrains.annotations.Nullable()
    com.suitmedia.bundle.sample.data.api.model.BaseUrlHolder baseUrlHolder) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Provides()
    @com.suitmedia.bundle.sample.di.scope.SuitCoreApplicationScope()
    public final com.suitmedia.bundle.sample.data.api.model.BaseUrlHolder provideBaseUrlHolder() {
        return null;
    }
    
    public APIServiceModule() {
        super();
    }
}