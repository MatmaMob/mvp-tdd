package com.example.tomaszmatusik.mvp_tdd.di.modules;

import android.content.Context;

import com.example.tomaszmatusik.mvp_tdd.activities.main.MainContract;
import com.example.tomaszmatusik.mvp_tdd.di.DaggApp;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final DaggApp daggApp;

    public AppModule(DaggApp daggApp) {
        this.daggApp = daggApp;
    }

    @Provides
    Context provideContext() {
        return daggApp;
    }
}
