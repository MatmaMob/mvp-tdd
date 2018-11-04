package com.example.tomaszmatusik.mvp_tdd.activities.main;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Toast;

import com.example.tomaszmatusik.mvp_tdd.R;
import com.example.tomaszmatusik.mvp_tdd.activities.BaseActivity;
import com.example.tomaszmatusik.mvp_tdd.databinding.ActivityMainBinding;
import com.example.tomaszmatusik.mvp_tdd.di.modules.MVPModule;
import com.example.tomaszmatusik.mvp_tdd.di.components.DaggerMVPComponent;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainContract.View {

    ActivityMainBinding mainBinding;

    @Inject
    MainPresenter presenter;

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
        mainBinding = DataBindingUtil.setContentView(this, getContentView());
        presenter.handleLoadingToastOnStart();
    }

    @Override
    public void loadToastOnStart() {
        Toast.makeText(this, "on main view ready", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void resolveDaggerDependency() {
        super.resolveDaggerDependency();
        DaggerMVPComponent
                .builder()
                .appComponent(getApplicationComponent())
                .mVPModule(new MVPModule(this))
                .build().inject(this);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }
}
