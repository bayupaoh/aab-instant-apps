package com.suitmedia.bundle.sample.base.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010 \u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H$J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\rH\u0016J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0016J\u001e\u0010$\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110&H\u0016J\u001e\u0010$\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110&H\u0016J\u001e\u0010\'\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110&H\u0016J\"\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u001c2\b\u0010,\u001a\u0004\u0018\u00010\u001cJ)\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020*2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010/\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0002\u00100J\u0010\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\rH\u0016J\u0010\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020#H\u0016J\u0010\u00103\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0004R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\rX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u00064"}, d2 = {"Lcom/suitmedia/bundle/sample/base/ui/BaseFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/suitmedia/bundle/sample/base/presenter/MvpView;", "()V", "mBaseActivity", "Lcom/suitmedia/bundle/sample/base/ui/BaseActivity;", "mCommonLoadingDialog", "Lcom/suitmedia/bundle/sample/helper/CommonLoadingDialog;", "mContext", "Landroid/content/Context;", "mInflater", "Landroid/view/LayoutInflater;", "resourceLayout", "", "getResourceLayout", "()I", "clearRecyclerView", "", "recyclerView", "Lcom/suitmedia/bundle/sample/base/ui/recyclerview/BaseRecyclerView;", "finishLoad", "recycler", "hideLoading", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "container", "Landroid/view/ViewGroup;", "onViewReady", "showAlertDialog", "message", "", "showConfirmationDialog", "confirmCallback", "Lkotlin/Function0;", "showConfirmationSingleDialog", "showEmptyState", "value", "", "list", "emptyView", "showLoading", "isBackPressedCancelable", "currentPage", "(ZLjava/lang/String;Ljava/lang/Integer;)V", "showLoadingWithText", "msg", "showToast", "app_debug"})
public abstract class BaseFragment extends android.support.v4.app.Fragment implements com.suitmedia.bundle.sample.base.presenter.MvpView {
    private android.content.Context mContext;
    private com.suitmedia.bundle.sample.base.ui.BaseActivity mBaseActivity;
    private android.view.LayoutInflater mInflater;
    private com.suitmedia.bundle.sample.helper.CommonLoadingDialog mCommonLoadingDialog;
    private java.util.HashMap _$_findViewCache;
    
    protected abstract int getResourceLayout();
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected abstract void onViewReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    protected final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showLoading(boolean isBackPressedCancelable, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer currentPage) {
    }
    
    @java.lang.Override()
    public void showLoadingWithText(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void showLoadingWithText(int msg) {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void showConfirmationDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> confirmCallback) {
    }
    
    @java.lang.Override()
    public void showConfirmationSingleDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> confirmCallback) {
    }
    
    @java.lang.Override()
    public void showConfirmationDialog(int message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> confirmCallback) {
    }
    
    @java.lang.Override()
    public void showAlertDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void showAlertDialog(int message) {
    }
    
    public final void finishLoad(@org.jetbrains.annotations.Nullable()
    com.suitmedia.bundle.sample.base.ui.recyclerview.BaseRecyclerView recycler) {
    }
    
    public final void showEmptyState(boolean value, @org.jetbrains.annotations.Nullable()
    android.view.View list, @org.jetbrains.annotations.Nullable()
    android.view.View emptyView) {
    }
    
    public final void clearRecyclerView(@org.jetbrains.annotations.Nullable()
    com.suitmedia.bundle.sample.base.ui.recyclerview.BaseRecyclerView recyclerView) {
    }
    
    public BaseFragment() {
        super();
    }
}