package com.suitmedia.bundle.sample.helper.socialauth.facebook;

import java.lang.System;

/**
 * * Created by dodydmw19 on 12/14/18.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\fR\u0013\u0010\u0007\u001a\u00020\b8G\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/suitmedia/bundle/sample/helper/socialauth/facebook/FacebookHelper;", "", "mListener", "Lcom/suitmedia/bundle/sample/helper/socialauth/facebook/FacebookListener;", "mFieldString", "", "(Lcom/suitmedia/bundle/sample/helper/socialauth/facebook/FacebookListener;Ljava/lang/String;)V", "callbackManager", "Lcom/facebook/CallbackManager;", "getCallbackManager", "()Lcom/facebook/CallbackManager;", "getUserProfile", "", "loginResult", "Lcom/facebook/login/LoginResult;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "parseResponse", "Lcom/suitmedia/bundle/sample/helper/socialauth/facebook/FacebookUser;", "object", "Lorg/json/JSONObject;", "performSignIn", "activity", "Landroid/app/Activity;", "fragment", "Landroid/support/v4/app/Fragment;", "performSignOut", "app_debug"})
public final class FacebookHelper {
    
    /**
     * * Get the [CallbackManager] for managing callbacks.
     *     *
     *     * @return [CallbackManager]
     */
    @org.jetbrains.annotations.NotNull()
    private final com.facebook.CallbackManager callbackManager = null;
    private final com.suitmedia.bundle.sample.helper.socialauth.facebook.FacebookListener mListener = null;
    private final java.lang.String mFieldString = null;
    
    @org.jetbrains.annotations.NotNull()
    @android.support.annotation.CheckResult()
    public final com.facebook.CallbackManager getCallbackManager() {
        return null;
    }
    
    /**
     * * Get user facebook profile.
     *     *
     *     * @param loginResult login result with user credentials.
     */
    private final void getUserProfile(com.facebook.login.LoginResult loginResult) {
    }
    
    /**
     * * Parse the response received into [FacebookUser] object.
     *     *
     *     * @param object response received.
     *     * @return [FacebookUser] with required fields.
     *     * @throws JSONException
     */
    private final com.suitmedia.bundle.sample.helper.socialauth.facebook.FacebookUser parseResponse(org.json.JSONObject object) throws org.json.JSONException {
        return null;
    }
    
    /**
     * * Perform facebook sign in.
     *     *
     *     *
     *     * NOTE: If you are signing from the fragment than you should call [.performSignIn].
     *     *
     *     *
     *     * This method should generally call when user clicks on "Sign in with Facebook" button.
     *     *
     *     * @param activity instance of the caller activity.
     */
    public final void performSignIn(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * * Perform facebook login. This method should be called when you are signing in from
     *     * fragment.
     *     *
     *     *
     *     * This method should generally call when user clicks on "Sign in with Facebook" button.
     *     *
     *     * @param fragment caller fragment.
     */
    public final void performSignIn(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment) {
    }
    
    /**
     * * This method handles onActivityResult callbacks from fragment or activity.
     *     *
     *     * @param requestCode request code received.
     *     * @param resultCode  result code received.
     *     * @param data        Data intent.
     */
    public final void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.NotNull()
    android.content.Intent data) {
    }
    
    public final void performSignOut() {
    }
    
    public FacebookHelper(@org.jetbrains.annotations.Nullable()
    com.suitmedia.bundle.sample.helper.socialauth.facebook.FacebookListener mListener, @org.jetbrains.annotations.Nullable()
    java.lang.String mFieldString) {
        super();
    }
}