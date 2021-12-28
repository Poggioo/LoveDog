package com.homework.lovedog.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0004J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0004\u00a8\u0006\f"}, d2 = {"Lcom/homework/lovedog/base/BasePresenter;", "", "()V", "callbackRspFailure", "", "rsp", "Lcom/homework/lovedog/base/BaseRsp;", "view", "Lcom/homework/lovedog/base/IBaseView;", "requestError", "throwable", "", "app_debug"})
public abstract class BasePresenter {
    
    protected final void callbackRspFailure(@org.jetbrains.annotations.Nullable()
    com.homework.lovedog.base.BaseRsp rsp, @org.jetbrains.annotations.Nullable()
    com.homework.lovedog.base.IBaseView view) {
    }
    
    protected final void requestError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable, @org.jetbrains.annotations.Nullable()
    com.homework.lovedog.base.IBaseView view) {
    }
    
    public BasePresenter() {
        super();
    }
}