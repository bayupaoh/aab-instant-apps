package com.suitmedia.bundle.sample.helper.socialauth.twitter;

import java.lang.System;

/**
 * * Created by dodydmw19 on 7/16/18.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J&\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/suitmedia/bundle/sample/helper/socialauth/twitter/TwitterListener;", "", "onTwitterError", "", "errorMessage", "", "onTwitterSignIn", "authToken", "secret", "userId", "app_debug"})
public abstract interface TwitterListener {
    
    public abstract void onTwitterError(@org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage);
    
    public abstract void onTwitterSignIn(@org.jetbrains.annotations.Nullable()
    java.lang.String authToken, @org.jetbrains.annotations.Nullable()
    java.lang.String secret, @org.jetbrains.annotations.Nullable()
    java.lang.String userId);
}