package com.suitmedia.bundle.sample.feature.login;

import java.lang.System;

/**
 * * Created by dodydmw19 on 7/18/18.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\"\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u0010#\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010\u00172\b\u0010%\u001a\u0004\u0018\u00010\u0017H\u0016J\u001c\u0010&\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010\u00172\b\u0010%\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\'\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010(\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010)\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010*\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010,\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010-\u001a\u00020\u0014H\u0014J\u0018\u0010.\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010/\u001a\u00020\u0014H\u0014J\b\u00100\u001a\u00020\u0014H\u0002J\u0012\u00101\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u0017H\u0016J&\u00102\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010\u00172\b\u00103\u001a\u0004\u0018\u00010\u00172\b\u0010%\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u00104\u001a\u00020\u00142\b\u00105\u001a\u0004\u0018\u000106H\u0014J\b\u00107\u001a\u00020\u0014H\u0002J\b\u00108\u001a\u00020\u0014H\u0002J\b\u00109\u001a\u00020\u0014H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006:"}, d2 = {"Lcom/suitmedia/bundle/sample/feature/login/LoginActivity;", "Lcom/suitmedia/bundle/sample/base/ui/BaseActivityWithDynamicFeature;", "Lcom/suitmedia/bundle/sample/feature/login/LoginView;", "Lcom/suitmedia/bundle/sample/helper/socialauth/google/GoogleListener;", "Lcom/suitmedia/bundle/sample/helper/socialauth/facebook/FacebookListener;", "Lcom/suitmedia/bundle/sample/helper/socialauth/twitter/TwitterListener;", "()V", "loginPresenter", "Lcom/suitmedia/bundle/sample/feature/login/LoginPresenter;", "mFbHelper", "Lcom/suitmedia/bundle/sample/helper/socialauth/facebook/FacebookHelper;", "mGoogleHelper", "Lcom/suitmedia/bundle/sample/helper/socialauth/google/GoogleSignInHelper;", "mTwitterHelper", "Lcom/suitmedia/bundle/sample/helper/socialauth/twitter/TwitterHelper;", "resourceLayout", "", "getResourceLayout", "()I", "actionClicked", "", "loadAndLaunchModule", "name", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDownloadModule", "state", "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;", "onFailed", "onFbSignInFail", "errorMessage", "onFbSignInSuccess", "authToken", "userId", "onGoogleAuthSignIn", "onGoogleAuthSignInFailed", "onInstalled", "onInstalling", "onLoginFailed", "message", "onLoginSuccess", "onPause", "onRequiresUserConfirmation", "onResume", "onSuccessfulLoad", "onTwitterError", "onTwitterSignIn", "secret", "onViewReady", "savedInstanceState", "Landroid/os/Bundle;", "setupPresenter", "setupSocialLogin", "signOut", "app_debug"})
public final class LoginActivity extends com.suitmedia.bundle.sample.base.ui.BaseActivityWithDynamicFeature implements com.suitmedia.bundle.sample.feature.login.LoginView, com.suitmedia.bundle.sample.helper.socialauth.google.GoogleListener, com.suitmedia.bundle.sample.helper.socialauth.facebook.FacebookListener, com.suitmedia.bundle.sample.helper.socialauth.twitter.TwitterListener {
    private com.suitmedia.bundle.sample.feature.login.LoginPresenter loginPresenter;
    private com.suitmedia.bundle.sample.helper.socialauth.google.GoogleSignInHelper mGoogleHelper;
    private com.suitmedia.bundle.sample.helper.socialauth.twitter.TwitterHelper mTwitterHelper;
    private com.suitmedia.bundle.sample.helper.socialauth.facebook.FacebookHelper mFbHelper;
    private final int resourceLayout = 2131427356;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getResourceLayout() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onViewReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupPresenter() {
    }
    
    private final void setupSocialLogin() {
    }
    
    private final void signOut() {
    }
    
    @java.lang.Override()
    public void onLoginSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onLoginFailed(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void onGoogleAuthSignIn(@org.jetbrains.annotations.Nullable()
    java.lang.String authToken, @org.jetbrains.annotations.Nullable()
    java.lang.String userId) {
    }
    
    @java.lang.Override()
    public void onGoogleAuthSignInFailed(@org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage) {
    }
    
    @java.lang.Override()
    public void onFbSignInFail(@org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage) {
    }
    
    @java.lang.Override()
    public void onFbSignInSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.String authToken, @org.jetbrains.annotations.Nullable()
    java.lang.String userId) {
    }
    
    @java.lang.Override()
    public void onTwitterError(@org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage) {
    }
    
    @java.lang.Override()
    public void onTwitterSignIn(@org.jetbrains.annotations.Nullable()
    java.lang.String authToken, @org.jetbrains.annotations.Nullable()
    java.lang.String secret, @org.jetbrains.annotations.Nullable()
    java.lang.String userId) {
    }
    
    private final void actionClicked() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final void loadAndLaunchModule(java.lang.String name) {
    }
    
    private final void onSuccessfulLoad() {
    }
    
    @java.lang.Override()
    public void onDownloadModule(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.google.android.play.core.splitinstall.SplitInstallSessionState state) {
    }
    
    @java.lang.Override()
    public void onRequiresUserConfirmation(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.google.android.play.core.splitinstall.SplitInstallSessionState state) {
    }
    
    @java.lang.Override()
    public void onInstalled(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.google.android.play.core.splitinstall.SplitInstallSessionState state) {
    }
    
    @java.lang.Override()
    public void onInstalling(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.google.android.play.core.splitinstall.SplitInstallSessionState state) {
    }
    
    @java.lang.Override()
    public void onFailed(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.google.android.play.core.splitinstall.SplitInstallSessionState state) {
    }
    
    public LoginActivity() {
        super();
    }
}