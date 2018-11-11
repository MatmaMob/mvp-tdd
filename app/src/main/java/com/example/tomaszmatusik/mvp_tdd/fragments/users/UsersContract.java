package com.example.tomaszmatusik.mvp_tdd.fragments.users;

public interface UsersContract {

    interface Presenter {
        void initUsersView();
    }

    interface View {
        void showInitToast();
    }
}
