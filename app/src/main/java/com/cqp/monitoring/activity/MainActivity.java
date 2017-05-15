package com.cqp.monitoring.activity;

import android.os.Bundle;
import android.view.View;

import com.cqp.monitoring.BaseActivity;
import com.cqp.monitoring.R;

/**
 * 主界面
 * @author kasen
 * @email kronosno13@gmail.com
 * @created 2017/5/12 上午11:04
 */

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(TempMapActivity.class);
    }

    @Override
    protected void initParms(Bundle parms) {

    }

    @Override
    protected void setOnClick() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(View mContextView) {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void widgetClick(View v) {

    }
}
