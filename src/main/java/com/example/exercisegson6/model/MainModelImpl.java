package com.example.exercisegson6.model;


import com.example.exercisegson6.contract.MainContract;
import com.example.exercisegson6.utils.net.INetCallBack;
import com.example.exercisegson6.utils.net.RetrofitUtils;

public class MainModelImpl implements MainContract.IMainModel {
    private MainContract.IMainPresenter presenter;

    public MainModelImpl(MainContract.IMainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <P> void getLoginData(String url, INetCallBack<P> callBack) {
        RetrofitUtils.getInstance().get(url, callBack);
    }
}
