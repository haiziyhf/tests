package com.gilbert.ltt.lttcustomer.ui.user;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.gilbert.ltt.diana.local.ui.ItemListFragment;
import com.gilbert.ltt.lttcustomer.R;
import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import roboguice.fragment.RoboListFragment;

/**
 * A placeholder fragment containing a simple view.
 */
public class PersonalOperaListFragment extends ItemListFragment<Map<String, Object>> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] texts = new String[] {"位置", "个人资料", "账户与安全"};
        Object[] actions = new Object[] {null, null, null};
        for (int i=0; i<texts.length; i++) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("title", texts[i]);
            map.put("action", actions[i]);
            list.add(map);
        }
        adapter = new SimpleAdapter(getActivity(), list,
                R.layout.arrows_right_item, new String[]{"title"}, new int[]{R.id.tv_title});
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object action = list.get(position).get("action");
        if (null == action) {
            return ;
        }

        Intent intent = new Intent(getActivity(), (Class<?>) action);
        startActivity(intent);
    }
}
