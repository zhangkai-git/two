package com.example.exercisegson6.utils.net;

public interface INetWorkInterface {
    public <P> void get(String url, INetCallBack<P> callBack);
}
