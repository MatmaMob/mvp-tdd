package com.example.tomaszmatusik.mvp_tdd.activities.main;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Toast;

import com.example.tomaszmatusik.mvp_tdd.R;
import com.example.tomaszmatusik.mvp_tdd.activities.BaseActivity;
import com.example.tomaszmatusik.mvp_tdd.adapters.ParentViewPagerAdapter;
import com.example.tomaszmatusik.mvp_tdd.databinding.ActivityMainBinding;
import com.example.tomaszmatusik.mvp_tdd.di.components.DaggerParentComponent;
import com.example.tomaszmatusik.mvp_tdd.di.modules.ParentModule;
import com.example.tomaszmatusik.mvp_tdd.fragments.main.MainFragment;
import com.example.tomaszmatusik.mvp_tdd.fragments.users.UsersFragment;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements ParentContract.View {

    @Inject
    ParentPresenter parentPresenter;

    ActivityMainBinding mainBinding;

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
        mainBinding = DataBindingUtil.setContentView(this, getContentView());
        parentPresenter.handleInitViews();
    }

    @Override
    public void setupViewPager() {
        ParentViewPagerAdapter parentAdapter = new ParentViewPagerAdapter(getSupportFragmentManager());
        parentAdapter.add(new MainFragment());
        parentAdapter.add(new UsersFragment());
        mainBinding.parentViewPager.setAdapter(parentAdapter);
    }

    @Override
    public void loadToastOnStart() {
        Toast.makeText(this, "on main view ready", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void resolveDaggerDependency() {
        super.resolveDaggerDependency();
        DaggerParentComponent
                .builder()
                .appComponent(getApplicationComponent())
                .parentModule(new ParentModule(this))
                .build().inject(this);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }
}
