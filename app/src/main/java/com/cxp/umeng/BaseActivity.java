package com.cxp.umeng;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.umeng.analytics.MobclickAgent;

/**
 * 文 件 名: BaseActivity
 * 创 建 人: CXP
 * 创建日期: 2018-04-03 16:31
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //添加友盟
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //添加友盟
        MobclickAgent.onPause(this);
    }

}
