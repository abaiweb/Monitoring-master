package com.cqp.monitoring;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 *
 * @author kasen
 * @email kronosno13@gmail.com
 * @created 2017/5/12 上午9:25
 */

public abstract class BaseFragment extends Fragment implements View.OnClickListener{

    /** 当前Activity渲染的视图View **/
    private View mContextView = null;
    /** Activity的Context **/
    public Context mContext;
    /** 是否输出日志信息 **/
    private boolean isDebug;
    private String APP_NAME;
    protected final String TAG = this.getClass().getSimpleName();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        mContextView = inflater.inflate(getLayoutId(), container, false);
        initView(mContextView);
        setOnClick();
        initData();
        return mContextView;
    }


    /**
     * [初始化Bundle参数]
     *
     * @param parms
     */
    abstract void initParms(Bundle parms);


    abstract void setOnClick();

    /**
     * [绑定布局]
     *
     * @return
     */
    abstract int getLayoutId();

    /**
     * [重写： 1.是否沉浸状态栏 2.是否全屏 3.是否禁止旋转屏幕]
     */
    // public abstract void setActivityPre();

    /**
     * [初始化控件]
     *
     */
    abstract void initView(View mContextView);

    /**
     * [初始化数据]
     *
     */
    abstract void initData();

    /** View点击 **/
    abstract void widgetClick(View v);


    /**
     * [防止快速点击]
     *
     * @return
     */
    private boolean fastClick() {
        long lastClick = 0;
        if (System.currentTimeMillis() - lastClick <= 1000) {
            return false;
        }
        lastClick = System.currentTimeMillis();
        return true;
    }

    @Override
    public void onClick(View v) {
        if (fastClick())
            widgetClick(v);
    }

    @SuppressWarnings("unchecked")
    public <T extends View> T $(View view, int resId) {
        return (T) view.findViewById(resId);
    }

    /**
     * [日志输出]
     *
     * @param msg
     */
    protected void $Log(String msg) {
        if (isDebug) {
            Log.d(APP_NAME, msg);
        }
    }



}
