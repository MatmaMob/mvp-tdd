package com.example.tomaszmatusik.mvp_tdd.activities.main;

public interface MainContract {

    interface Presenter {
        void handleLoadingToastOnStart();
    }

    interface View {
        void loadToastOnStart();
    }
}
