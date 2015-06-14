package com.gilbert.ltt.lttcustomer.ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

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
        TextView toolbarTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        if (toolbarTitle != null && getSupportActionBar() != null) {
            toolbarTitle.setText(getTitle());
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }

    private void initFrame() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.f_container, personalFragment);
        transaction.commit();
    }

}
