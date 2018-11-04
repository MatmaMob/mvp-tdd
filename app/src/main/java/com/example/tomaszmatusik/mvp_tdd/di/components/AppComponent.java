package com.example.tomaszmatusik.mvp_tdd.di.components;

import com.example.tomaszmatusik.mvp_tdd.di.modules.AppModule;
import com.example.tomaszmatusik.mvp_tdd.di.DaggApp;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(DaggApp daggApp);
}
