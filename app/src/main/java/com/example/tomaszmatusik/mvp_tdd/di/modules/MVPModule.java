package com.example.tomaszmatusik.mvp_tdd.di.modules;

import com.example.tomaszmatusik.mvp_tdd.fragments.main.MainContract;
import com.example.tomaszmatusik.mvp_tdd.fragments.main.MainPresenter;
import com.example.tomaszmatusik.mvp_tdd.fragments.main.MainRepository;
import com.example.tomaszmatusik.mvp_tdd.db.FirebaseDatabaseHelper;
import com.example.tomaszmatusik.mvp_tdd.fragments.users.UsersContract;
import com.example.tomaszmatusik.mvp_tdd.fragments.users.UsersPresenter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import dagger.Module;
import dagger.Provides;

@Module
public class MVPModule {

    private MainContract.View mainView;
    private UsersContract.View usersView;

    public MVPModule(MainContract.View mainView) {
        this.mainView = mainView;
    }

    public MVPModule(UsersContract.View usersView) {
        this.usersView = usersView;
    }

    @Provides
    UsersContract.View providesUsersView() {
        return usersView;
    }

    @Provides
    UsersPresenter providesUsersPresenter(UsersContract.View usersView) {
        return new UsersPresenter(usersView);
    }

    @Provides
    MainContract.View providesMainView() {
        return mainView;
    }

    @Provides
    MainPresenter providesMainPresenter(MainContract.View mainView, MainRepository mainRepository) {
        return new MainPresenter(mainView, mainRepository);
    }

    @Provides
    DatabaseReference providesDatabaseReference() {
        return FirebaseDatabase.getInstance().getReference();
    }

    @Provides
    FirebaseDatabaseHelper providesFirebaseDatabaseHelper(DatabaseReference databaseReference) {
        return new FirebaseDatabaseHelper(databaseReference);
    }

    @Provides
    MainRepository providesMainRepository(FirebaseDatabaseHelper firebaseDatabaseHelper) {
        return new MainRepository(firebaseDatabaseHelper);
    }
}
