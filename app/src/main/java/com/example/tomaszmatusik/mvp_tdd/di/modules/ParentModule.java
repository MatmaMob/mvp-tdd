package com.example.tomaszmatusik.mvp_tdd.di.modules;

import com.example.tomaszmatusik.mvp_tdd.activities.main.ParentContract;
import com.example.tomaszmatusik.mvp_tdd.activities.main.ParentPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class ParentModule {

    private ParentContract.View parentView;

    public ParentModule(ParentContract.View parentView) {
        this.parentView = parentView;
    }

    @Provides
    ParentContract.View providesParentView() {
        return parentView;
    }

    @Provides
    ParentPresenter providesParentPresenter(ParentContract.View parentView) {
        return new ParentPresenter(parentView);
    }
}
