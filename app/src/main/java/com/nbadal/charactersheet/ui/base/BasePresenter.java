package com.nbadal.charactersheet.ui.base;

public abstract class BasePresenter<T extends BaseView> {
    private T view;

    public void attach(T view) {
        this.view = view;
    }

    public void detach() {
        this.view = null;
    }

    protected T getView() {
        return view;
    }
}
