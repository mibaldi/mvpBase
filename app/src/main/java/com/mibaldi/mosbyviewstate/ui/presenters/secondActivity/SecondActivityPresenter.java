package com.mibaldi.mosbyviewstate.ui.presenters.secondActivity;

import android.content.Context;

import com.mibaldi.mosbyviewstate.base.BasePresenter;
import com.mibaldi.mosbyviewstate.router.Router;
import com.mibaldi.mosbyviewstate.ui.views.MainActivityView;
import com.mibaldi.mosbyviewstate.ui.views.SecondActivityView;

import javax.inject.Inject;


public class SecondActivityPresenter extends BasePresenter<SecondActivityView> {

    @Inject
    Router router;

    @Inject
    SecondActivityPresenter() {}

    public void init(final Context context) {
        this.activityContext = context;
    }




}
