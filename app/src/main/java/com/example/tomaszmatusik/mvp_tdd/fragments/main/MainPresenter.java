package com.example.tomaszmatusik.mvp_tdd.fragments.main;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mainView;
    private MainRepository mainRepository;

    public MainPresenter(MainContract.View mainView, MainRepository mainRepository) {
        this.mainView = mainView;
        this.mainRepository = mainRepository;
    }

    @Override
    public void handleLoadingToastOnStart() {
        mainView.loadToastOnStart();
    }

}
