package com.example.tomaszmatusik.mvp_tdd.fragments.users;

public class UsersPresenter implements UsersContract.Presenter {

    private UsersContract.View usersView;

    public UsersPresenter(UsersContract.View usersView) {
        this.usersView = usersView;
    }

    @Override
    public void initUsersView() {
        usersView.showInitToast();
    }
}
