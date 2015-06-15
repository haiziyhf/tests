package com.gilbert.ltt.lttcustomer.ui;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.gilbert.ltt.diana.local.ui.LttAppCompatActivity;
import com.gilbert.ltt.lttcustomer.R;
import com.gilbert.ltt.lttcustomer.ui.user.PersonalFragment;
import com.google.inject.Inject;

import roboguice.inject.InjectView;

public class FaceFrameActivity extends LttAppCompatActivity {
    @Inject FragmentManager fragmentManager;
    @Inject PersonalFragment personalFragment;
    @InjectView(R.id.toolbar) Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_frame);

        initActionBar();
        initFrame();
    }

    private void initActionBar() {
        setSupportActionBar(toolbar);
    }

    private void initFrame() {
        fragmentManager.beginTransaction().replace(R.id.f_container, personalFragment).commit();
    }

}
