package com.suitmedia.bundle.sample.base.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H\'J\b\u0010\t\u001a\u00020\u0004H\'J\b\u0010\n\u001a\u00020\u0004H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/suitmedia/bundle/sample/base/presenter/BasePresenter;", "V", "Landroid/arch/lifecycle/LifecycleObserver;", "attachView", "", "view", "(Ljava/lang/Object;)V", "detachView", "onDestroy", "onPause", "onStart", "app_debug"})
public abstract interface BasePresenter<V extends java.lang.Object> extends android.arch.lifecycle.LifecycleObserver {
    
    @android.arch.lifecycle.OnLifecycleEvent(value = android.arch.lifecycle.Lifecycle.Event.ON_START)
    public abstract void onStart();
    
    @android.arch.lifecycle.OnLifecycleEvent(value = android.arch.lifecycle.Lifecycle.Event.ON_PAUSE)
    public abstract void onPause();
    
    @android.arch.lifecycle.OnLifecycleEvent(value = android.arch.lifecycle.Lifecycle.Event.ON_DESTROY)
    public abstract void onDestroy();
    
    public abstract void attachView(V view);
    
    public abstract void detachView();
}