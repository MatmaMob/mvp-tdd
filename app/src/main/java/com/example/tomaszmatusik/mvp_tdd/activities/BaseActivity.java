package com.example.tomaszmatusik.mvp_tdd.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.tomaszmatusik.mvp_tdd.di.DaggApp;
import com.example.tomaszmatusik.mvp_tdd.di.components.AppComponent;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onViewReady(savedInstanceState, getIntent());
    }

    @CallSuper
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        resolveDaggerDependency();
        //To be used by child activities
    }

    protected AppComponent getApplicationComponent() {
        return ((DaggApp) getApplication()).getAppComponent();
    }

    protected void resolveDaggerDependency() {
    }

    protected abstract int getContentView();
}
