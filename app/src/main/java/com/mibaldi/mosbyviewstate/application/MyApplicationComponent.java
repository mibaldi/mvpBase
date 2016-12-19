package com.mibaldi.mosbyviewstate.application;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;


import com.birbit.android.jobqueue.JobManager;
import com.mibaldi.mosbyviewstate.base.BaseActivity;
import com.mibaldi.mosbyviewstate.base.baseMosby.activity.BaseMVPActivity;
import com.mibaldi.mosbyviewstate.data.repositories.UserDataRepository;
import com.mibaldi.mosbyviewstate.router.Router;


import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyApplicationModule.class)
public interface MyApplicationComponent {
    @Named("ApplicationContext")
    Context context();
    void inject(AppCompatActivity baseActivity);
    Router getRouter();
    JobManager getJobManager();
    UserDataRepository userDataRepository();
}
