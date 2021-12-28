package com.homework.lovedog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00142\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/homework/lovedog/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/homework/lovedog/view/IMainView;", "()V", "adapter", "Lcom/homework/lovedog/adapter/MainDogListAdapter;", "dogList", "", "Lcom/homework/lovedog/bean/DogList;", "mMainPresenter", "Lcom/homework/lovedog/presenter/MainPresenter;", "mViewBinding", "Lcom/homework/lovedog/databinding/ActivityMainBinding;", "getActivity", "Landroid/app/Activity;", "getContext", "Landroid/content/Context;", "getViewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "serverErr", "message", "", "showDogList", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.homework.lovedog.view.IMainView {
    private com.homework.lovedog.databinding.ActivityMainBinding mViewBinding;
    private com.homework.lovedog.presenter.MainPresenter mMainPresenter;
    private com.homework.lovedog.adapter.MainDogListAdapter adapter;
    private final java.util.List<com.homework.lovedog.bean.DogList> dogList = null;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Activity getActivity() {
        return null;
    }
    
    @java.lang.Override()
    public void serverErr(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LifecycleOwner getViewLifecycleOwner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public void showDogList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.homework.lovedog.bean.DogList> dogList) {
    }
    
    public MainActivity() {
        super();
    }
}