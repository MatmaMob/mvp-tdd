package com.example.tomaszmatusik.mvp_tdd.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.example.tomaszmatusik.mvp_tdd.di.DaggApp;
import com.example.tomaszmatusik.mvp_tdd.di.components.AppComponent;

public abstract class BaseFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resolveDaggerDependency();
    }

    protected AppComponent getApplicationComponent() {
        return ((DaggApp) getActivity().getApplication()).getAppComponent();
    }

    protected void resolveDaggerDependency() {
    }
}
