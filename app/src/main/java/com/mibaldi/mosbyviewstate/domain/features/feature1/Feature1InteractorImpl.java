package com.mibaldi.mosbyviewstate.domain.features.feature1;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.birbit.android.jobqueue.JobManager;
import com.birbit.android.jobqueue.RetryConstraint;
import com.mibaldi.mosbyviewstate.data.repositories.UserDataRepository;
import com.mibaldi.mosbyviewstate.di.PerActivity;
import com.mibaldi.mosbyviewstate.domain.callbacks.CallbackListener;
import com.mibaldi.mosbyviewstate.domain.callbacks.MyError;

import javax.inject.Inject;

public class Feature1InteractorImpl implements Feature1Interactor {

    UserDataRepository userDataRepository;
    JobManager jobManager;

    @Inject
    public Feature1InteractorImpl(UserDataRepository userDataRepository,JobManager jobManager){
        this.userDataRepository = userDataRepository;
        this.jobManager = jobManager;
    }

    @Override
    public void getUser(final CallbackListener<String> listener) {
        jobManager.addJobInBackground(new FeatureJob(userDataRepository, new CallbackListener<String>() {
            @Override
            public void onSuccess(String result) {
                listener.onSuccess(result);
            }

            @Override
            public void onError(MyError myError) {
                listener.onError(myError);
            }
        }));
    }
}
