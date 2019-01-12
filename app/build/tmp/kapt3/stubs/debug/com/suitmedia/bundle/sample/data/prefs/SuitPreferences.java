package com.suitmedia.bundle.sample.data.prefs;

import java.lang.System;

/**
 * * Created by dodydmw19 on 7/18/18.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\b\u0016\u0018\u0000 -2\u00020\u0001:\u0002-.B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0013J)\u0010\u0014\u001a\u0004\u0018\u0001H\u0015\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0017\u00a2\u0006\u0002\u0010\u0018J*\u0010\u0019\u001a\n\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\u001a\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0017J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001d\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010!J\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010#J\u001d\u0010$\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010%J!\u0010&\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\'\u001a\u0002H\u0015\u00a2\u0006\u0002\u0010(J$\u0010)\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u0002H\u0015\u0018\u00010\u001aJ\u0018\u0010+\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\bJ\u0010\u0010,\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u00a8\u0006/"}, d2 = {"Lcom/suitmedia/bundle/sample/data/prefs/SuitPreferences;", "", "()V", "clearSession", "", "deleteValue", "", "key", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getBoolean", "getFloat", "", "(Ljava/lang/String;)Ljava/lang/Float;", "getInt", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "getLong", "", "(Ljava/lang/String;)Ljava/lang/Long;", "getObject", "T", "classType", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getObjectsList", "", "getString", "isKeyExists", "saveBoolean", "value", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "saveFloat", "(Ljava/lang/String;Ljava/lang/Float;)V", "saveInt", "(Ljava/lang/String;Ljava/lang/Integer;)V", "saveLong", "(Ljava/lang/String;Ljava/lang/Long;)V", "saveObject", "object", "(Ljava/lang/String;Ljava/lang/Object;)V", "saveObjectsList", "objectList", "saveString", "toKey", "Companion", "SecurePreferencesException", "app_debug"})
public class SuitPreferences {
    private static final java.lang.String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static final java.lang.String KEY_TRANSFORMATION = "AES/ECB/PKCS5Padding";
    private static final java.lang.String SECRET_KEY_HASH_TRANSFORMATION = "SHA-256";
    private static final java.lang.String CHARSET = "UTF-8";
    private static boolean encryptKeys;
    private static javax.crypto.Cipher writer;
    private static javax.crypto.Cipher reader;
    private static javax.crypto.Cipher keyWriter;
    private static com.suitmedia.bundle.sample.data.prefs.SuitPreferences instance;
    private static android.content.SharedPreferences mSharedPreferences;
    public static final com.suitmedia.bundle.sample.data.prefs.SuitPreferences.Companion Companion = null;
    
    public final void saveInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Integer value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void saveBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void saveFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Float value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void saveLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Long value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void saveString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final <T extends java.lang.Object>void saveObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key, T object) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T getObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> classType) {
        return null;
    }
    
    public final <T extends java.lang.Object>void saveObjectsList(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> objectList) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.util.List<T> getObjectsList(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> classType) {
        return null;
    }
    
    public final void clearSession() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean deleteValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    private final boolean isKeyExists(java.lang.String key) {
        return false;
    }
    
    private final java.lang.String toKey(java.lang.String key) {
        return null;
    }
    
    public SuitPreferences() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/suitmedia/bundle/sample/data/prefs/SuitPreferences$SecurePreferencesException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "e", "", "(Ljava/lang/Throwable;)V", "app_debug"})
    public static final class SecurePreferencesException extends java.lang.RuntimeException {
        
        public SecurePreferencesException(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable e) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0004J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0004J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rH\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J \u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0004H\u0004J\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010&\u001a\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/suitmedia/bundle/sample/data/prefs/SuitPreferences$Companion;", "", "()V", "CHARSET", "", "KEY_TRANSFORMATION", "SECRET_KEY_HASH_TRANSFORMATION", "TRANSFORMATION", "encryptKeys", "", "instance", "Lcom/suitmedia/bundle/sample/data/prefs/SuitPreferences;", "keyWriter", "Ljavax/crypto/Cipher;", "mSharedPreferences", "Landroid/content/SharedPreferences;", "reader", "writer", "convert", "", "cipher", "bs", "createKeyBytes", "key", "decrypt", "securedEncodedValue", "encrypt", "value", "getIv", "Ljavax/crypto/spec/IvParameterSpec;", "getSecretKey", "Ljavax/crypto/spec/SecretKeySpec;", "init", "", "context", "Landroid/content/Context;", "secureKey", "initCiphers", "validateInitialization", "app_debug"})
    public static final class Companion {
        
        @android.annotation.SuppressLint(value = {"GetInstance"})
        public final void init(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String secureKey, boolean encryptKeys) throws com.suitmedia.bundle.sample.data.prefs.SuitPreferences.SecurePreferencesException {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.suitmedia.bundle.sample.data.prefs.SuitPreferences instance() {
            return null;
        }
        
        private final void validateInitialization() {
        }
        
        protected final void initCiphers(@org.jetbrains.annotations.NotNull()
        java.lang.String secureKey) throws java.io.UnsupportedEncodingException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        }
        
        private final javax.crypto.spec.IvParameterSpec getIv() {
            return null;
        }
        
        private final javax.crypto.spec.SecretKeySpec getSecretKey(java.lang.String key) throws java.io.UnsupportedEncodingException, java.security.NoSuchAlgorithmException {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        protected final byte[] createKeyBytes(@org.jetbrains.annotations.Nullable()
        java.lang.String key) throws java.io.UnsupportedEncodingException, java.security.NoSuchAlgorithmException {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        protected final java.lang.String encrypt(@org.jetbrains.annotations.NotNull()
        java.lang.String value, @org.jetbrains.annotations.NotNull()
        javax.crypto.Cipher writer) throws com.suitmedia.bundle.sample.data.prefs.SuitPreferences.SecurePreferencesException {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        protected final java.lang.String decrypt(@org.jetbrains.annotations.NotNull()
        java.lang.String securedEncodedValue) {
            return null;
        }
        
        private final byte[] convert(javax.crypto.Cipher cipher, byte[] bs) throws com.suitmedia.bundle.sample.data.prefs.SuitPreferences.SecurePreferencesException {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}