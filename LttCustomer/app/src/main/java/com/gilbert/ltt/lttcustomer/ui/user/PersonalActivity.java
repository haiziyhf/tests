package com.gilbert.ltt.lttcustomer.ui.user;

import android.os.Bundle;

import com.gilbert.ltt.diana.local.LttAppCompatActivity;
import com.gilbert.ltt.lttcustomer.R;

/**
 * Created by xxstop on 15/6/10.
 */
public class PersonalActivity extends LttAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }
    }

}
