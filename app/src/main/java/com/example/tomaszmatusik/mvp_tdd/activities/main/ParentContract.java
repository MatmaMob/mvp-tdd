package com.example.tomaszmatusik.mvp_tdd.activities.main;

public interface ParentContract {
    interface Presenter {
        void handleInitViews();
    }

    interface View {
        void setupViewPager();

        void loadToastOnStart();
    }
}
