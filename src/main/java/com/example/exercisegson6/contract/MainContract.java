package com.example.exercisegson6.contract;

import com.example.exercisegson6.Bean;
import com.example.exercisegson6.base.BaseView;
import com.example.exercisegson6.utils.net.INetCallBack;

public class MainContract {
    public interface IMainModel {
        <P> void getLoginData(String url, INetCallBack<P> callBack);
    }

    public interface IMainView extends BaseView {
        void getData(Bean bean);
    }

    public interface IMainPresenter {
        void getData();
    }
}
