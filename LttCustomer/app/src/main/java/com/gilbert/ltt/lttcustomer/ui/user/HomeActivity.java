package com.gilbert.ltt.lttcustomer.ui.user;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.gilbert.ltt.diana.local.LttAppCompatActivity;
import com.gilbert.ltt.lttcustomer.R;
import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import roboguice.inject.InjectView;

/**
 * Created by xxstop on 15/6/10.
 */
public class HomeActivity extends LttAppCompatActivity {

    @InjectView(R.id.lv_personal_opera) ListView lvPersonalOpera;
    @InjectView(R.id.lv_contact) ListView lvContact;
    @Inject ArrayList<Map<String,String>> alPersonalOpera;
    @Inject ArrayList<Map<String,String>> alContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }

        // - 初始化个性操作
        initPersonalOperaList();
        // - 初始化官方联系
        initContactList();
    }

    private void initPersonalOperaList() {
        alPersonalOpera.add(new HashMap<String, String>() {
            {
                put("title", "位置");
            }
        });
        alPersonalOpera.add(new HashMap<String, String>() {
            {
                put("title", "个人资料");
            }
        });
        alPersonalOpera.add(new HashMap<String, String>() {
            {
                put("title", "账户与安全");
            }
        });
        lvPersonalOpera.setAdapter(new SimpleAdapter(HomeActivity.this, alPersonalOpera,
                R.layout.user_opera_item, new String[]{"title"}, new int[]{R.id.title}));
    }

    private void initContactList() {
        alContact.add(new HashMap<String, String>() {
            {
                put("title", "意见所反馈");
            }
        });
        alContact.add(new HashMap<String, String>() {
            {
                put("title", "客户电话");
            }
        });
        lvContact.setAdapter(new SimpleAdapter(HomeActivity.this, alContact,
                R.layout.user_opera_item, new String[]{"title"}, new int[]{R.id.title}));
    }

}
