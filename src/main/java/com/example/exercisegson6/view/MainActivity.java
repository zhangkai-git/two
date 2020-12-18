package com.example.exercisegson6.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exercisegson6.Bean;
import com.example.exercisegson6.R;
import com.example.exercisegson6.base.BaseActivity;
import com.example.exercisegson6.contract.MainContract;
import com.example.exercisegson6.presenter.MainPresenterImpl;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<MainPresenterImpl> implements MainContract.IMainView {

    private RecyclerView rv;
    private ArrayList<Bean.NewsBean> list;
    private MyAdapter myAdapter;

    @Override
    protected void initData() {
        Presenter.getData();
    }

    @Override
    protected void initView() {
        rv = findViewById(R.id.rv_recycler);

        rv.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();
        myAdapter = new MyAdapter(this, list);

        rv.setAdapter(myAdapter);
    }

    @Override
    protected MainPresenterImpl getPresenter() {
        return new MainPresenterImpl(this);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void getData(Bean bean) {
        List<Bean.NewsBean> news = bean.getNews();
        list.addAll(news);
        myAdapter.notifyDataSetChanged();
    }
}