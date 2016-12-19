package com.mibaldi.mosbyviewstate.application;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.support.multidex.MultiDex;
import android.util.Log;

import com.birbit.android.jobqueue.JobManager;
import com.birbit.android.jobqueue.config.Configuration;
import com.birbit.android.jobqueue.log.CustomLogger;
import com.birbit.android.jobqueue.scheduling.FrameworkJobSchedulerService;
import com.birbit.android.jobqueue.scheduling.GcmJobSchedulerService;

/**
 * Application
 */
public class MyApplication extends Application {
    private MyApplicationComponent myApplicationComponent;
    private JobManager jobManager;


    @Override
    public void onCreate() {
        super.onCreate();
        myApplicationComponent = DaggerMyApplicationComponent.builder().myApplicationModule(new MyApplicationModule(this)).build();
    }

    public MyApplicationComponent getInjector() {
        return myApplicationComponent;
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(getBaseContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

}
