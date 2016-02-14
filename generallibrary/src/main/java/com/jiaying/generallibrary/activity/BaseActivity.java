package com.jiaying.generallibrary.activity;


import android.app.Activity;
import android.os.Bundle;

/**
 * activity基类
 */
public abstract class BaseActivity extends Activity {

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
