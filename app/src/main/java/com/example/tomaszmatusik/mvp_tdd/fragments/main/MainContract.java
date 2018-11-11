package com.example.tomaszmatusik.mvp_tdd.fragments.main;

public interface MainContract {

    interface Presenter {
        void handleLoadingToastOnStart();
    }

    interface View {
        void loadToastOnStart();
    }
}
