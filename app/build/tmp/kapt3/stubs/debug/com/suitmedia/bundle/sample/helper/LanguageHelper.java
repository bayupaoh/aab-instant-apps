package com.suitmedia.bundle.sample.helper;

import java.lang.System;

/**
 * * Created by DODYDMW19 on 12/20/2017.
 */
@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0003J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u00a8\u0006\u0011"}, d2 = {"Lcom/suitmedia/bundle/sample/helper/LanguageHelper;", "", "()V", "getSystemLocale", "Ljava/util/Locale;", "config", "Landroid/content/res/Configuration;", "getSystemLocaleLegacy", "setLanguage", "", "context", "Landroid/content/Context;", "languageCode", "", "setSystemLocale", "locale", "setSystemLocaleLegacy", "app_debug"})
public final class LanguageHelper {
    public static final com.suitmedia.bundle.sample.helper.LanguageHelper INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"DEPRECATION"})
    public final java.util.Locale getSystemLocaleLegacy(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration config) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    public final java.util.Locale getSystemLocale(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration config) {
        return null;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final void setSystemLocaleLegacy(android.content.res.Configuration config, java.util.Locale locale) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    private final void setSystemLocale(android.content.res.Configuration config, java.util.Locale locale) {
    }
    
    public final void setLanguage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
    }
    
    private LanguageHelper() {
        super();
    }
}