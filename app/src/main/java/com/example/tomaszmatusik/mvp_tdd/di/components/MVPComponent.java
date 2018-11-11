package com.example.tomaszmatusik.mvp_tdd.di.components;

import com.example.tomaszmatusik.mvp_tdd.di.modules.MVPModule;
import com.example.tomaszmatusik.mvp_tdd.fragments.main.MainFragment;
import com.example.tomaszmatusik.mvp_tdd.fragments.users.UsersFragment;

import dagger.Component;

@Component(modules = MVPModule.class, dependencies = AppComponent.class)
public interface MVPComponent {

    void inject(MainFragment mainFragment);

    void inject(UsersFragment usersFragment);
}
