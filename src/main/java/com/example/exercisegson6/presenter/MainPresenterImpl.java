package com.example.exercisegson6.presenter;

import android.util.Log;

import com.example.exercisegson6.Bean;
import com.example.exercisegson6.base.BasePresenter;
import com.example.exercisegson6.contract.MainContract;
import com.example.exercisegson6.model.MainModelImpl;
import com.example.exercisegson6.utils.net.INetCallBack;

public class MainPresenterImpl extends BasePresenter<MainContract.IMainView> implements MainContract.IMainPresenter {
    private MainContract.IMainModel iMainModel;

    public MainPresenterImpl(MainContract.IMainView mainView) {
        this.iMainModel = new MainModelImpl(this);
    }

    @Override
    public void getData() {
        iMainModel.getLoginData("exam2003/anewslist.json", new INetCallBack<Bean>() {
            @Override
            public void onSuccess(Bean bean) {
                iView.getData(bean);
            }

            @Override
            public void onFail(String error) {
                Log.e("TAG", "错误" + error);
            }
        });
    }
}
