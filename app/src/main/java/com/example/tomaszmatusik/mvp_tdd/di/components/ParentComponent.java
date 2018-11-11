package com.example.tomaszmatusik.mvp_tdd.di.components;

import com.example.tomaszmatusik.mvp_tdd.activities.main.MainActivity;
import com.example.tomaszmatusik.mvp_tdd.di.modules.ParentModule;

import dagger.Component;

@Component(modules = ParentModule.class, dependencies = AppComponent.class)
public interface ParentComponent {

    void inject(MainActivity mainActivity);
}
