package com.example.tomaszmatusik.mvp_tdd.fragments.main;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.tomaszmatusik.mvp_tdd.R;
import com.example.tomaszmatusik.mvp_tdd.databinding.FragmentMainBinding;
import com.example.tomaszmatusik.mvp_tdd.di.components.DaggerMVPComponent;
import com.example.tomaszmatusik.mvp_tdd.di.modules.MVPModule;
import com.example.tomaszmatusik.mvp_tdd.fragments.BaseFragment;

import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends BaseFragment implements MainContract.View {

    @Inject
    MainPresenter mainPresenter;

    FragmentMainBinding binding;

    public MainFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        mainPresenter.handleLoadingToastOnStart();
        return binding.getRoot();
    }

    @Override
    public void loadToastOnStart() {
        Toast.makeText(getContext(), "init fragment", Toast.LENGTH_SHORT).show();
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
}
