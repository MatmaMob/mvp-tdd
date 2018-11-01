package com.example.tomaszmatusik.mvp_tdd.dagger2;

import com.example.tomaszmatusik.mvp_tdd.activities.main.MainActivity;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(DaggApp daggApp);

    void inject(MainActivity mainActivity);
}
