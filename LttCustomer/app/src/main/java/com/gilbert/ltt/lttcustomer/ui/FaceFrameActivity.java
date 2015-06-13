package com.gilbert.ltt.lttcustomer.ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.gilbert.ltt.diana.local.ui.LttAppCompatActivity;
import com.gilbert.ltt.lttcustomer.R;
import com.gilbert.ltt.lttcustomer.ui.user.PersonalFragment;
import com.google.inject.Inject;

public class FaceFrameActivity extends LttAppCompatActivity {
    @Inject FragmentManager fragmentManager;
    @Inject PersonalFragment personalFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_frame);

        initFrame();
    }

    private void initFrame() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.f_container, personalFragment);
        transaction.commit();
    }

}
