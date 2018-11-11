package com.example.tomaszmatusik.mvp_tdd.db;

import com.google.firebase.database.DatabaseReference;

public class FirebaseDatabaseHelper {

    private DatabaseReference databaseReference;

    public FirebaseDatabaseHelper(DatabaseReference databaseReference) {
        this.databaseReference = databaseReference;
    }

    public void insertString(String string) {
        databaseReference.setValue(string);
    }
}
