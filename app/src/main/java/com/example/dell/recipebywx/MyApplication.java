package com.example.dell.recipebywx;

import android.app.Application;

import com.mob.MobSDK;

import org.xutils.x;

/**
 * Created by dell on 2019/1/5.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        MobSDK.init(this);
    }
}
