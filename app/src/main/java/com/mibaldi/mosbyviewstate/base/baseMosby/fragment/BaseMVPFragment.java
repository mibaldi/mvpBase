package com.mibaldi.mosbyviewstate.base.baseMosby.fragment;

import android.os.Bundle;

import com.hannesdorfmann.mosby.mvp.MvpFragment;
import com.mibaldi.mosbyviewstate.base.BasePresenter;
import com.mibaldi.mosbyviewstate.base.BaseView;
import com.mibaldi.mosbyviewstate.di.HasComponent;


/**
 * BaseFragment with mosby
 */
public abstract class BaseMVPFragment<P extends BasePresenter<V>, V extends BaseView> extends MvpFragment<V, P> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressWarnings("unchecked")
    protected <C> C getComponent(Class<C> componentType) {
        return componentType.cast(((HasComponent<C>) getActivity()).getComponent());
    }
}
