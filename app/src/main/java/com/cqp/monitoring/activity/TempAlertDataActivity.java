package com.cqp.monitoring.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.cqp.monitoring.BaseActivity;
import com.cqp.monitoring.R;


/**
 * 临时的数据提醒界面，先给领导看Demo
 * @author kasen
 * @email kronosno13@gmail.com
 * @created 2017/5/15 上午10:20
 */
public class TempAlertDataActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
        ImageView imageView = new ImageView(this);
        imageView.setBackground(getResources().getDrawable(R.drawable.alert_data));
        ((LinearLayout)mContextView).addView(imageView);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void widgetClick(View v) {

    }
}
