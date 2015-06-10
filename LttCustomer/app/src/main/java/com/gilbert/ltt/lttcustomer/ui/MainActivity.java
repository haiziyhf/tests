package com.gilbert.ltt.lttcustomer.ui;

import android.content.Intent;
import android.os.Bundle;

import com.gilbert.ltt.diana.local.LttAppCompatActivity;
import com.gilbert.ltt.lttcustomer.R;
import com.gilbert.ltt.lttcustomer.ui.user.HomeActivity;

public class MainActivity extends LttAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jumpUserHome();
    }

    private void jumpUserHome() {
        startActivity(new Intent(MainActivity.this, HomeActivity.class));
    }

}
