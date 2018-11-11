package com.example.tomaszmatusik.mvp_tdd.main;

import com.example.tomaszmatusik.mvp_tdd.fragments.main.MainContract;
import com.example.tomaszmatusik.mvp_tdd.fragments.main.MainPresenter;
import com.example.tomaszmatusik.mvp_tdd.fragments.main.MainRepository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class MainPresenterTest {

    @Mock
    private MainContract.View mainView;

    private MainRepository mainRepository;
    private MainPresenter presenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        presenter = new MainPresenter(mainView, mainRepository);
    }

    @Test
    public void handleLoadingToastOnStart() {
        presenter.handleLoadingToastOnStart();
        verify(mainView).loadToastOnStart();
    }
}