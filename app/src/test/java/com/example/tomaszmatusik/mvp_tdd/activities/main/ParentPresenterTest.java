package com.example.tomaszmatusik.mvp_tdd.activities.main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class ParentPresenterTest {

    @Mock
    ParentContract.View parentView;

    private ParentPresenter parentPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        parentPresenter = new ParentPresenter(parentView);
    }

    @Test
    public void handleInitViews() {
        parentPresenter.handleInitViews();
        verify(parentView).loadToastOnStart();
        verify(parentView).setupViewPager();
    }
}