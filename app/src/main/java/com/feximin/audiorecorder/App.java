package com.feximin.audiorecorder;

import android.app.Application;

/**
 * Created by Neo on 16/3/29.
 */
public class App extends Application {

    private static App sApp;
    @Override
    public void onCreate() {
        super.onCreate();
        sApp = this;
    }

    public static final App getApp(){
        return sApp;
    }
}
