package com.gilbert.ltt.lttcustomer.ui;

import android.os.Bundle;
import android.view.WindowManager;

import com.gilbert.ltt.lttcustomer.R;

import roboguice.activity.RoboSplashActivity;

/**
 * Created by xxstop on 15/6/09
 */
// @ContentView(R.layout.activity_splash)
public class SplashActivity extends RoboSplashActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    protected void startNextActivity() {
        // startActivity(new Intent());
    }

    /*@Override
    protected void andFinishThisOne() {
    }*/
}
