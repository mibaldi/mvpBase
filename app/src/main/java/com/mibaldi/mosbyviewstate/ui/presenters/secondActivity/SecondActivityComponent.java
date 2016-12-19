package com.mibaldi.mosbyviewstate.ui.presenters.secondActivity;


import com.mibaldi.mosbyviewstate.application.MyApplicationComponent;
import com.mibaldi.mosbyviewstate.di.PerActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = MyApplicationComponent.class,modules = SecondActivityModule.class)
public interface SecondActivityComponent {
        SecondActivityPresenter presenter();
}
