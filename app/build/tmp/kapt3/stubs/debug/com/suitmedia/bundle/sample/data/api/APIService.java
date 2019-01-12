package com.suitmedia.bundle.sample.data.api;

import java.lang.System;

/**
 * * Created by DODYDMW19 on 8/3/2017.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'\u00a8\u0006\t"}, d2 = {"Lcom/suitmedia/bundle/sample/data/api/APIService;", "", "getMembers", "Lio/reactivex/Flowable;", "Lcom/suitmedia/bundle/sample/data/api/wrapper/Results;", "Lcom/suitmedia/bundle/sample/data/api/model/User;", "perPage", "", "page", "app_debug"})
public abstract interface APIService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users")
    public abstract io.reactivex.Flowable<com.suitmedia.bundle.sample.data.api.wrapper.Results<com.suitmedia.bundle.sample.data.api.model.User>> getMembers(@retrofit2.http.Query(value = "per_page")
    int perPage, @retrofit2.http.Query(value = "page")
    int page);
}