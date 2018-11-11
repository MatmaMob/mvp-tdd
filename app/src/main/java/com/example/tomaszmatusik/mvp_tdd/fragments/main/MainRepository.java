package com.example.tomaszmatusik.mvp_tdd.fragments.main;

import com.example.tomaszmatusik.mvp_tdd.db.FirebaseDatabaseHelper;

public class MainRepository {

    private FirebaseDatabaseHelper firebaseDatabaseHelper;

    public MainRepository(FirebaseDatabaseHelper firebaseDatabaseHelper) {
        this.firebaseDatabaseHelper = firebaseDatabaseHelper;
    }

    public void insertString(String string) {
        firebaseDatabaseHelper.insertString(string);
    }
}
