package com.mibaldi.mosbyviewstate.ui.activities;

import android.support.annotation.NonNull;
import android.os.Bundle;
import android.widget.TextView;

import com.mibaldi.mosbyviewstate.R;
import com.mibaldi.mosbyviewstate.base.baseMosby.activity.BaseMVPActivity;
import com.mibaldi.mosbyviewstate.di.HasComponent;
import com.mibaldi.mosbyviewstate.ui.presenters.mainActivity.DaggerMainActivityComponent;
import com.mibaldi.mosbyviewstate.ui.presenters.mainActivity.MainActivityComponent;
import com.mibaldi.mosbyviewstate.ui.presenters.mainActivity.MainActivityPresenter;
import com.mibaldi.mosbyviewstate.ui.views.MainActivityView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseMVPActivity<MainActivityPresenter, MainActivityView>
implements MainActivityView, HasComponent<MainActivityComponent> {
    @BindView(R.id.tvMain)
    TextView tvMain;
    private MainActivityComponent mainActivityComponent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.initializeInjector();
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        presenter.init(this);
    }

    @NonNull
    @Override
    public MainActivityPresenter createPresenter() {
        return mainActivityComponent.presenter();
    }

    @Override
    public void showMessage(String message) {
        tvMain.setText(message);
    }
    @OnClick (R.id.btnGoSecondActivity)
    public void goSecondActivity(){
        presenter.goSecondActivity();
    }

    @OnClick(R.id.btnJobQueue)
    public void jobQueue(){
        presenter.getUser();
    }
    @Override
    public MainActivityComponent getComponent() {
        return mainActivityComponent;
    }
    private void initializeInjector() {
        this.mainActivityComponent = DaggerMainActivityComponent.builder().myApplicationComponent(getInjector()).build();
    }
}
