package com.example.tomaszmatusik.mvp_tdd.di.modules;

import com.example.tomaszmatusik.mvp_tdd.activities.main.MainContract;
import com.example.tomaszmatusik.mvp_tdd.activities.main.MainPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MVPModule {

    private MainContract.View mainView;

    public MVPModule(MainContract.View mainView) {
        this.mainView = mainView;
    }

    @Provides
    MainContract.View providesMainView() {
        return mainView;
    }

    @Provides
    MainPresenter providesMainPresenter(MainContract.View mainView) {
        return new MainPresenter(mainView);
    }
}
