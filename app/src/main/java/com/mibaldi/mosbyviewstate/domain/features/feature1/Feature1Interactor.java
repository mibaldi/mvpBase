package com.mibaldi.mosbyviewstate.domain.features.feature1;


import com.birbit.android.jobqueue.Job;
import com.birbit.android.jobqueue.Params;
import com.mibaldi.mosbyviewstate.domain.callbacks.CallbackListener;

public interface Feature1Interactor  {
  void getUser(CallbackListener<String> listener);
}
