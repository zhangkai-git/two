package com.example.exercisegson6.base;

public class BasePresenter<P extends BaseView> {
    public P iView;

    public void attachView(P p) {
        iView = p;
    }
}
