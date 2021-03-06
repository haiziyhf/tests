package com.gilbert.ltt.lttcustomer.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.gilbert.ltt.lttcustomer.R;
import com.google.inject.Inject;

import roboguice.activity.RoboSplashActivity;

/**
 * Created by xxstop on 15/6/09
 */
public class SplashActivity extends RoboSplashActivity {
    @Inject Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    protected void startNextActivity() {
        startActivity(new Intent(SplashActivity.this, FaceFrameActivity.class));
    }

}
