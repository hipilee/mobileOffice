package com.jiaying.generallibrary.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * activity基类
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initVariables();
        initView();
        loadData();
    }


    public abstract  void initView();
    public abstract  void loadData();
    public abstract  void initVariables();
}
