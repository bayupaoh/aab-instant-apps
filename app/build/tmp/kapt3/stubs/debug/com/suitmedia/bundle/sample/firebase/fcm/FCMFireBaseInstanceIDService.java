package com.suitmedia.bundle.sample.firebase.fcm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/suitmedia/bundle/sample/firebase/fcm/FCMFireBaseInstanceIDService;", "Lcom/google/firebase/iid/FirebaseInstanceIdService;", "()V", "onTokenRefresh", "", "Companion", "app_debug"})
public final class FCMFireBaseInstanceIDService extends com.google.firebase.iid.FirebaseInstanceIdService {
    private static final java.lang.String TAG = "MyFirebaseIIDService";
    public static final com.suitmedia.bundle.sample.firebase.fcm.FCMFireBaseInstanceIDService.Companion Companion = null;
    
    /**
     * * Called if InstanceID token is updated. This may occur if the security of
     *     * the previous token had been compromised. Note that this is called when the InstanceID token
     *     * is initially generated so this is where you would retrieve the token.
     */
    @java.lang.Override()
    public void onTokenRefresh() {
    }
    
    public FCMFireBaseInstanceIDService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/suitmedia/bundle/sample/firebase/fcm/FCMFireBaseInstanceIDService$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}