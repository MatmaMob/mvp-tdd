package com.example.tomaszmatusik.mvp_tdd.fragments.users;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class UsersPresenterTest {

    @Mock
    UsersContract.View usersView;

    private UsersPresenter usersPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        usersPresenter = new UsersPresenter(usersView);
    }

    @Test
    public void initUsersView() {
        usersPresenter.initUsersView();
        verify(usersView).showInitToast();
    }
}