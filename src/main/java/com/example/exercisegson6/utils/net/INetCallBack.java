package com.example.exercisegson6.utils.net;

public interface INetCallBack<P> {
    public void onSuccess(P p);

    public void onFail(String error);
}
