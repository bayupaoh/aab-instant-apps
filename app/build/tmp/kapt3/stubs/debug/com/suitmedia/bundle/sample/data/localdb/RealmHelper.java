package com.suitmedia.bundle.sample.data.localdb;

import java.lang.System;

/**
 * * Created by dodydmw19 on 7/25/18.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000bJ%\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0010J)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0012J\u001b\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0015\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nJ\u0013\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/suitmedia/bundle/sample/data/localdb/RealmHelper;", "T", "Lio/realm/RealmObject;", "", "()V", "deleteData", "", "data", "(Lio/realm/RealmObject;)V", "getData", "", "(Lio/realm/RealmObject;)Ljava/util/List;", "id", "", "paramName", "", "(ILjava/lang/String;Lio/realm/RealmObject;)Lio/realm/RealmObject;", "getDataListQuery", "(ILjava/lang/String;Lio/realm/RealmObject;)Ljava/util/List;", "getDataSorted", "getSingleData", "(Lio/realm/RealmObject;)Lio/realm/RealmObject;", "saveList", "saveObject", "app_debug"})
public final class RealmHelper<T extends io.realm.RealmObject> {
    
    public final void saveObject(@org.jetbrains.annotations.NotNull()
    T data) {
    }
    
    public final void saveList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String paramName, @org.jetbrains.annotations.NotNull()
    T data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<T> getData(@org.jetbrains.annotations.NotNull()
    T data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<T> getDataSorted(@org.jetbrains.annotations.NotNull()
    T data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getSingleData(@org.jetbrains.annotations.NotNull()
    T data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getDataListQuery(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String paramName, @org.jetbrains.annotations.NotNull()
    T data) {
        return null;
    }
    
    public final void deleteData(@org.jetbrains.annotations.NotNull()
    T data) {
    }
    
    public RealmHelper() {
        super();
    }
}