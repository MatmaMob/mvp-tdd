package com.example.tomaszmatusik.mvp_tdd.di.components;

import com.example.tomaszmatusik.mvp_tdd.activities.main.MainActivity;
import com.example.tomaszmatusik.mvp_tdd.di.modules.MVPModule;

import dagger.Component;

@Component(modules = MVPModule.class, dependencies = AppComponent.class)
public interface MVPComponent {
    void inject(MainActivity mainActivity);
}
