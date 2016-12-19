package com.mibaldi.mosbyviewstate.ui.presenters.mainActivity;


import com.birbit.android.jobqueue.JobManager;
import com.birbit.android.jobqueue.Params;
import com.mibaldi.mosbyviewstate.data.repositories.UserDataRepository;
import com.mibaldi.mosbyviewstate.domain.features.feature1.Feature1Interactor;
import com.mibaldi.mosbyviewstate.domain.features.feature1.Feature1InteractorImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {
    public MainActivityModule(){}

    @Provides
    public Feature1Interactor getFeature1Interactor(UserDataRepository userDataRepository, JobManager jobManager){
        return new Feature1InteractorImpl(userDataRepository,jobManager);
    }
}
