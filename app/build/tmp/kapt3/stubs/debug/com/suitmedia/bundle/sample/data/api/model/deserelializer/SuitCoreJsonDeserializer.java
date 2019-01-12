package com.suitmedia.bundle.sample.data.api.model.deserelializer;

import java.lang.System;

/**
 * * Created by DODYDMW19 on 9/7/2017.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/suitmedia/bundle/sample/data/api/model/deserelializer/SuitCoreJsonDeserializer;", "T", "Lcom/google/gson/JsonDeserializer;", "()V", "getBooleanOrFalseFromJson", "", "json", "Lcom/google/gson/JsonElement;", "getDoubleOrZeroFromJson", "", "getIntOrZeroFromJson", "", "getLongOrZeroFromJson", "", "getStringOrNullFromJson", "", "app_debug"})
public abstract class SuitCoreJsonDeserializer<T extends java.lang.Object> implements com.google.gson.JsonDeserializer<T> {
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringOrNullFromJson(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonElement json) {
        return null;
    }
    
    public final int getIntOrZeroFromJson(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonElement json) {
        return 0;
    }
    
    public final long getLongOrZeroFromJson(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonElement json) {
        return 0L;
    }
    
    public final double getDoubleOrZeroFromJson(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonElement json) {
        return 0.0;
    }
    
    public final boolean getBooleanOrFalseFromJson(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonElement json) {
        return false;
    }
    
    public SuitCoreJsonDeserializer() {
        super();
    }
}