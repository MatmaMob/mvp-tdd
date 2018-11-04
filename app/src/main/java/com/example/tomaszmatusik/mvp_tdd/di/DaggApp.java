package com.example.tomaszmatusik.mvp_tdd.di;

import android.app.Application;

import com.example.tomaszmatusik.mvp_tdd.di.components.AppComponent;
import com.example.tomaszmatusik.mvp_tdd.di.components.DaggerAppComponent;
import com.example.tomaszmatusik.mvp_tdd.di.modules.AppModule;

public class DaggApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
