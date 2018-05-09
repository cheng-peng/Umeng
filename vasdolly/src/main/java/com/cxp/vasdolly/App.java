package com.cxp.vasdolly;

import android.app.Application;

import com.leon.channel.helper.ChannelReaderUtil;
import com.umeng.commonsdk.UMConfigure;

/**
 * 文 件 名: App
 * 创 建 人: CXP
 * 创建日期: 2018-05-09 22:10
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        String channel= ChannelReaderUtil.getChannel(getApplicationContext());
        /**
         * 初始化common库
         * 参数1:上下文，不能为空
         * 参数2:【友盟+】 AppKey
         * 参数3:【友盟+】 Channel
         * 参数4:设备类型，UMConfigure.DEVICE_TYPE_PHONE为手机、UMConfigure.DEVICE_TYPE_BOX为盒子，默认为手机
         * 参数5:Push推送业务的secret   没有传null
         */
        UMConfigure.init(this, "5af3007fb27b0a73d400019f", channel,UMConfigure.DEVICE_TYPE_PHONE, null);
    }
}
