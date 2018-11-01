package com.example.tomaszmatusik.mvp_tdd.activities.main;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mainView;

    public MainPresenter(MainContract.View mainView) {
        this.mainView = mainView;
    }

    @Override
    public void handleLoadingToastOnStart() {
        mainView.loadToastOnStart();
    }
}
