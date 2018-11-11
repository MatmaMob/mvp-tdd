package com.example.tomaszmatusik.mvp_tdd.fragments.users;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.tomaszmatusik.mvp_tdd.R;
import com.example.tomaszmatusik.mvp_tdd.databinding.FragmentUsersBinding;
import com.example.tomaszmatusik.mvp_tdd.di.components.DaggerMVPComponent;
import com.example.tomaszmatusik.mvp_tdd.di.modules.MVPModule;
import com.example.tomaszmatusik.mvp_tdd.fragments.BaseFragment;

import javax.inject.Inject;

import dagger.Provides;

/**
 * A simple {@link Fragment} subclass.
 */
public class UsersFragment extends BaseFragment implements UsersContract.View {

    @Inject
    UsersPresenter usersPresenter;

    FragmentUsersBinding usersBinding;

    public UsersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        usersBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_users, container, false);
        usersPresenter.initUsersView();

        return usersBinding.getRoot();
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
    public void showInitToast() {
        Toast.makeText(getContext(), "init users view", Toast.LENGTH_SHORT).show();
    }
}
