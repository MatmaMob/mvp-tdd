package com.example.tomaszmatusik.mvp_tdd.activities.main;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.tomaszmatusik.mvp_tdd.R;
import com.example.tomaszmatusik.mvp_tdd.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    ActivityMainBinding mainBinding;

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    @Override
    public void loadToastOnStart() {
        Toast.makeText(this, "on main view start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter = new MainPresenter(this);
        presenter.handleLoadingToastOnStart();
    }
}
