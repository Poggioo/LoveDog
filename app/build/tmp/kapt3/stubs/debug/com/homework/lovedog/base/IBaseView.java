package com.homework.lovedog.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/homework/lovedog/base/IBaseView;", "", "getActivity", "Landroid/app/Activity;", "getContext", "Landroid/content/Context;", "getViewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "serverErr", "", "message", "", "app_debug"})
public abstract interface IBaseView {
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.app.Activity getActivity();
    
    public abstract void serverErr(@org.jetbrains.annotations.Nullable()
    java.lang.String message);
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.lifecycle.LifecycleOwner getViewLifecycleOwner();
    
    @org.jetbrains.annotations.Nullable()
    public abstract android.content.Context getContext();
}