package com.suitmedia.bundle.sample.base.ui.adapter.viewholder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/suitmedia/bundle/sample/base/ui/adapter/viewholder/BaseItemViewHolder;", "Data", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "baseContext", "Landroid/content/Context;", "getBaseContext", "()Landroid/content/Context;", "setBaseContext", "(Landroid/content/Context;)V", "bind", "", "data", "(Ljava/lang/Object;)V", "app_debug"})
public abstract class BaseItemViewHolder<Data extends java.lang.Object> extends android.support.v7.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.Nullable()
    private android.content.Context baseContext;
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getBaseContext() {
        return null;
    }
    
    public final void setBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    public abstract void bind(@org.jetbrains.annotations.Nullable()
    Data data);
    
    public BaseItemViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null);
    }
}