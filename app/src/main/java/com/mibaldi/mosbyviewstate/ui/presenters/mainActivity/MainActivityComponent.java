package com.mibaldi.mosbyviewstate.ui.presenters.mainActivity;


import com.mibaldi.mosbyviewstate.application.MyApplicationComponent;
import com.mibaldi.mosbyviewstate.data.repositories.UserDataRepository;
import com.mibaldi.mosbyviewstate.di.PerActivity;
import com.mibaldi.mosbyviewstate.domain.features.feature1.Feature1Interactor;
import com.mibaldi.mosbyviewstate.domain.features.feature1.Feature1InteractorImpl;

import dagger.Component;
import dagger.Provides;

@PerActivity
@Component(dependencies = MyApplicationComponent.class,modules = MainActivityModule.class)
public interface MainActivityComponent {
        MainActivityPresenter presenter();
        Feature1Interactor getFeature1Interactor();
}
