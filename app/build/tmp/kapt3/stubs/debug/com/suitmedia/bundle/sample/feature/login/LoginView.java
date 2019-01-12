package com.suitmedia.bundle.sample.feature.login;

import java.lang.System;

/**
 * * Created by dodydmw19 on 7/18/18.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/suitmedia/bundle/sample/feature/login/LoginView;", "Lcom/suitmedia/bundle/sample/base/presenter/MvpView;", "onLoginFailed", "", "message", "", "onLoginSuccess", "app_debug"})
public abstract interface LoginView extends com.suitmedia.bundle.sample.base.presenter.MvpView {
    
    public abstract void onLoginSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.String message);
    
    public abstract void onLoginFailed(@org.jetbrains.annotations.Nullable()
    java.lang.String message);
}