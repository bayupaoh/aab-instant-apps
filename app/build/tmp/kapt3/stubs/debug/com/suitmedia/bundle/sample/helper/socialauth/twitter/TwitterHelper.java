package com.suitmedia.bundle.sample.helper.socialauth.twitter;

import java.lang.System;

/**
 * * Created by dodydmw19 on 12/14/18.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\rR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/suitmedia/bundle/sample/helper/socialauth/twitter/TwitterHelper;", "", "twitterApiKey", "", "twitterSecreteKey", "mListener", "Lcom/suitmedia/bundle/sample/helper/socialauth/twitter/TwitterListener;", "mActivity", "Landroid/app/Activity;", "(IILcom/suitmedia/bundle/sample/helper/socialauth/twitter/TwitterListener;Landroid/app/Activity;)V", "mAuthClient", "Lcom/twitter/sdk/android/core/identity/TwitterAuthClient;", "getUserData", "", "session", "Lcom/twitter/sdk/android/core/TwitterSession;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "performSignIn", "app_debug"})
public final class TwitterHelper {
    private final com.twitter.sdk.android.core.identity.TwitterAuthClient mAuthClient = null;
    private final com.suitmedia.bundle.sample.helper.socialauth.twitter.TwitterListener mListener = null;
    private final android.app.Activity mActivity = null;
    
    /**
     * * Perform twitter sign in. Call this method when user clicks on "Login with Twitter" button.
     */
    public final void performSignIn() {
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
    
    /**
     * * Load twitter user profile.
     */
    private final void getUserData(com.twitter.sdk.android.core.TwitterSession session) {
    }
    
    public TwitterHelper(@android.support.annotation.StringRes()
    int twitterApiKey, @android.support.annotation.StringRes()
    int twitterSecreteKey, @org.jetbrains.annotations.Nullable()
    com.suitmedia.bundle.sample.helper.socialauth.twitter.TwitterListener mListener, @org.jetbrains.annotations.Nullable()
    android.app.Activity mActivity) {
        super();
    }
}