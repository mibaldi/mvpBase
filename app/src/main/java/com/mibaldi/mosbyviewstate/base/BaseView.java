package com.mibaldi.mosbyviewstate.base;

import com.hannesdorfmann.mosby.mvp.MvpView;

public interface BaseView extends MvpView {
    void showMessage(String message);
}
