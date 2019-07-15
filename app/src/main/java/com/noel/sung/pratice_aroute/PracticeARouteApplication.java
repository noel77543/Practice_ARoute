package com.noel.sung.pratice_aroute;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class PracticeARouteApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if(BuildConfig.DEBUG){
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}
