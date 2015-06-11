package com.gilbert.ltt.lttcustomer.ui.user;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.gilbert.ltt.diana.local.LttAppCompatActivity;
import com.gilbert.ltt.lttcustomer.R;
import com.google.inject.Inject;

import java.util.ArrayList;

import roboguice.inject.InjectView;

/**
 * Created by xxstop on 15/6/10.
 */
public class HomeActivity extends LttAppCompatActivity {

    @InjectView(R.id.lv_personal_opera) ListView lvPersonalOpera;
    @InjectView(R.id.lv_contact) ListView lvContact;
    @Inject ArrayList<String> alPersonalOpera;
    @Inject ArrayList<String> alContact;

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
        alPersonalOpera.add("位置");
        alPersonalOpera.add("个人资料");
        alPersonalOpera.add("账户与安全");
        lvPersonalOpera.setAdapter(new ArrayAdapter<>(getApplication(),
                android.R.layout.simple_list_item_1, alPersonalOpera));
    }

    private void initContactList() {
        alContact.add("意见反馈");
        alContact.add("客户电话");
        lvContact.setAdapter(new ArrayAdapter<>(getApplication(),
                android.R.layout.simple_list_item_1, alContact));
    }

}
