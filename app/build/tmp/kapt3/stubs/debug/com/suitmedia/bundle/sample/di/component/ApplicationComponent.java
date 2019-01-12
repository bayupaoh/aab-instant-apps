package com.suitmedia.bundle.sample.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/suitmedia/bundle/sample/di/component/ApplicationComponent;", "", "inject", "", "loginPresenter", "Lcom/suitmedia/bundle/sample/feature/login/LoginPresenter;", "app_debug"})
@dagger.Component(modules = {com.suitmedia.bundle.sample.di.module.APIServiceModule.class})
@com.suitmedia.bundle.sample.di.scope.SuitCoreApplicationScope()
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.suitmedia.bundle.sample.feature.login.LoginPresenter loginPresenter);
}