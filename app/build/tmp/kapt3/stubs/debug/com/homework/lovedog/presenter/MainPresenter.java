package com.homework.lovedog.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/homework/lovedog/presenter/MainPresenter;", "Lcom/homework/lovedog/base/BasePresenter;", "Lcom/homework/lovedog/presenter/IMainPresenter;", "view", "Lcom/homework/lovedog/view/IMainView;", "(Lcom/homework/lovedog/view/IMainView;)V", "model", "Lcom/homework/lovedog/model/MainModel;", "getModel", "()Lcom/homework/lovedog/model/MainModel;", "page", "", "getPage", "()I", "setPage", "(I)V", "pageSize", "getPageSize", "setPageSize", "getView", "()Lcom/homework/lovedog/view/IMainView;", "queryDogList", "", "allFresh", "", "app_debug"})
public final class MainPresenter extends com.homework.lovedog.base.BasePresenter implements com.homework.lovedog.presenter.IMainPresenter {
    @org.jetbrains.annotations.NotNull()
    private final com.homework.lovedog.model.MainModel model = null;
    private int page = 1;
    private int pageSize = 30;
    @org.jetbrains.annotations.NotNull()
    private final com.homework.lovedog.view.IMainView view = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.homework.lovedog.model.MainModel getModel() {
        return null;
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    public final int getPageSize() {
        return 0;
    }
    
    public final void setPageSize(int p0) {
    }
    
    @java.lang.Override()
    public void queryDogList(boolean allFresh) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.homework.lovedog.view.IMainView getView() {
        return null;
    }
    
    public MainPresenter(@org.jetbrains.annotations.NotNull()
    com.homework.lovedog.view.IMainView view) {
        super();
    }
}