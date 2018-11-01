package com.example.tomaszmatusik.mvp_tdd.dagger2;

import android.content.Context;

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
