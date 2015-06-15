package com.gilbert.ltt.lttcustomer.ui.system;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.gilbert.ltt.diana.local.ui.LttAppCompatActivity;
import com.gilbert.ltt.lttcustomer.R;

import roboguice.inject.InjectView;


/**
 * Created by xxstop on 15/6/15.
 */
public class SettingActivity extends LttAppCompatActivity implements View.OnClickListener {
    @InjectView(R.id.toolbar)  Toolbar toolbar;
    @InjectView(R.id.ll_clean_cache) LinearLayout llCleanCache;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_setting);

        initActionBar();
        initBindEvent();
    }

    @Override
    public void onClick(View v) {

    }

    private void initBindEvent() {
        llCleanCache.setOnClickListener(this);
    }

    private void initActionBar() {
        setSupportActionBar(toolbar);
        ActionBar bar = getSupportActionBar();
        bar.setDisplayHomeAsUpEnabled(true);
    }

}
