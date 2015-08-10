package com.kenoki.app.myparseapp.app;

import android.app.Application;

import com.kenoki.app.myparseapp.helper.ParseUtils;

/**
 * Created by aoki on 10/08/2015.
 */
public class MyApplication extends Application {

    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        ParseUtils.registerParse(this);
    }

    public static synchronized MyApplication getInstance() {
        return  mInstance;
    }



}
