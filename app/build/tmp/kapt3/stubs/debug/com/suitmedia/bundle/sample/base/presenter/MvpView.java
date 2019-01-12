package com.suitmedia.bundle.sample.base.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\u001e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J/\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006H&\u00a2\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0006H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0007H&\u00a8\u0006\u0013"}, d2 = {"Lcom/suitmedia/bundle/sample/base/presenter/MvpView;", "", "hideLoading", "", "showAlertDialog", "message", "", "", "showConfirmationDialog", "confirmCallback", "Lkotlin/Function0;", "showConfirmationSingleDialog", "showLoading", "isBackPressedCancelable", "", "currentPage", "(ZLjava/lang/String;Ljava/lang/Integer;)V", "showLoadingWithText", "msg", "app_debug"})
public abstract interface MvpView {
    
    public abstract void showLoading(boolean isBackPressedCancelable, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer currentPage);
    
    public abstract void showLoadingWithText(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void showLoadingWithText(@android.support.annotation.StringRes()
    int msg);
    
    public abstract void hideLoading();
    
    public abstract void showConfirmationDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> confirmCallback);
    
    public abstract void showConfirmationSingleDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> confirmCallback);
    
    public abstract void showConfirmationDialog(@android.support.annotation.StringRes()
    int message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> confirmCallback);
    
    public abstract void showAlertDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void showAlertDialog(@android.support.annotation.StringRes()
    int message);
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}