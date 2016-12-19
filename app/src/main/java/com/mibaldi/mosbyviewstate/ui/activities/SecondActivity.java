package com.mibaldi.mosbyviewstate.ui.activities;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mibaldi.mosbyviewstate.R;
import com.mibaldi.mosbyviewstate.base.baseMosby.activity.BaseMVPActivity;
import com.mibaldi.mosbyviewstate.di.HasComponent;
import com.mibaldi.mosbyviewstate.ui.presenters.mainActivity.DaggerMainActivityComponent;
import com.mibaldi.mosbyviewstate.ui.presenters.mainActivity.MainActivityComponent;
import com.mibaldi.mosbyviewstate.ui.presenters.mainActivity.MainActivityPresenter;
import com.mibaldi.mosbyviewstate.ui.presenters.secondActivity.DaggerSecondActivityComponent;
import com.mibaldi.mosbyviewstate.ui.presenters.secondActivity.SecondActivityComponent;
import com.mibaldi.mosbyviewstate.ui.presenters.secondActivity.SecondActivityPresenter;
import com.mibaldi.mosbyviewstate.ui.views.MainActivityView;
import com.mibaldi.mosbyviewstate.ui.views.SecondActivityView;

public class SecondActivity extends BaseMVPActivity<SecondActivityPresenter, SecondActivityView>
        implements SecondActivityView, HasComponent<SecondActivityComponent> {

    private SecondActivityComponent secondActivityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.initializeInjector();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        presenter.init(this);
    }

    @NonNull
    @Override
    public SecondActivityPresenter createPresenter() {
        return secondActivityComponent.presenter();
    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public SecondActivityComponent getComponent() {
        return secondActivityComponent;
    }
    private void initializeInjector() {
        this.secondActivityComponent = DaggerSecondActivityComponent.builder().myApplicationComponent(getInjector()).build();
    }
}
