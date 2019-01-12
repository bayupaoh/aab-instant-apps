package com.suitmedia.bundle.sample.helper.socialauth.google;

import java.lang.System;

/**
 * * Created by dodydmw19 on 12/14/18.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \'2\u00020\u0001:\u0001\'B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u0017H\u0002J\u001e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$J\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020%J\u0006\u0010&\u001a\u00020\u0010R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/suitmedia/bundle/sample/helper/socialauth/google/GoogleSignInHelper;", "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;", "mContext", "Landroid/support/v4/app/FragmentActivity;", "serverClientId", "", "mListener", "Lcom/suitmedia/bundle/sample/helper/socialauth/google/GoogleListener;", "(Landroid/support/v4/app/FragmentActivity;ILcom/suitmedia/bundle/sample/helper/socialauth/google/GoogleListener;)V", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "mGoogleApiClient", "Lcom/google/android/gms/common/api/GoogleApiClient;", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "asyncGoogle", "", "account", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "buildGoogleApiClient", "gso", "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;", "buildSignInOptions", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onConnectionFailed", "connectionResult", "Lcom/google/android/gms/common/ConnectionResult;", "parseToGoogleUser", "Lcom/suitmedia/bundle/sample/helper/socialauth/google/GoogleAuthUser;", "performSignIn", "activity", "Landroid/app/Activity;", "Landroid/support/v4/app/Fragment;", "performSignOut", "Companion", "app_debug"})
public final class GoogleSignInHelper implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    private com.google.android.gms.common.api.GoogleApiClient mGoogleApiClient;
    private com.google.android.gms.auth.api.signin.GoogleSignInClient mGoogleSignInClient;
    private com.google.firebase.auth.FirebaseAuth mAuth;
    private final android.support.v4.app.FragmentActivity mContext = null;
    private final com.suitmedia.bundle.sample.helper.socialauth.google.GoogleListener mListener = null;
    private static final int RC_SIGN_IN = 100;
    public static final com.suitmedia.bundle.sample.helper.socialauth.google.GoogleSignInHelper.Companion Companion = null;
    
    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions buildSignInOptions(java.lang.String serverClientId) {
        return null;
    }
    
    private final void buildGoogleApiClient(com.google.android.gms.auth.api.signin.GoogleSignInOptions gso) {
    }
    
    public final void performSignIn(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void performSignIn(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment activity) {
    }
    
    public final void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.NotNull()
    android.content.Intent data) {
    }
    
    private final void asyncGoogle(com.google.android.gms.auth.api.signin.GoogleSignInAccount account) {
    }
    
    private final com.suitmedia.bundle.sample.helper.socialauth.google.GoogleAuthUser parseToGoogleUser(com.google.android.gms.auth.api.signin.GoogleSignInAccount account) {
        return null;
    }
    
    @java.lang.Override()
    public void onConnectionFailed(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.common.ConnectionResult connectionResult) {
    }
    
    public final void performSignOut() {
    }
    
    public GoogleSignInHelper(@org.jetbrains.annotations.Nullable()
    android.support.v4.app.FragmentActivity mContext, int serverClientId, @org.jetbrains.annotations.Nullable()
    com.suitmedia.bundle.sample.helper.socialauth.google.GoogleListener mListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/suitmedia/bundle/sample/helper/socialauth/google/GoogleSignInHelper$Companion;", "", "()V", "RC_SIGN_IN", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}