package com.example.jh.gradledemo;

import android.app.Application;

/**
 * Created by jh on 2016/1/19.
 */
public class GradleAppcation extends Application {
    private static Application mApplication;

    @Override
    public void onCreate() {
        mApplication = this;
        super.onCreate();
    }

    public static Application getInstance() {
        return mApplication;
    }
}
