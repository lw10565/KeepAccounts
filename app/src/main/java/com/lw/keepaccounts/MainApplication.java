package com.lw.keepaccounts;

import android.app.Application;

/**
 * Created by lw on 2016/8/25.
 * app全局管理类
 * by
 */
public class MainApplication extends Application{

    private static  MainApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }



    public static MainApplication getInstance(){
        return instance;
    }


}
