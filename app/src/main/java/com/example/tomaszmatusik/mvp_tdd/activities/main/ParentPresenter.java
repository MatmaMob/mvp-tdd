package com.example.tomaszmatusik.mvp_tdd.activities.main;

public class ParentPresenter implements ParentContract.Presenter {

    private ParentContract.View parentView;

    public ParentPresenter(ParentContract.View parentView) {
        this.parentView = parentView;
    }

    @Override
    public void handleInitViews() {
        parentView.setupViewPager();
        parentView.loadToastOnStart();
    }
}
