package com.gilbert.ltt.lttcustomer.ui.system;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.gilbert.ltt.diana.local.ui.ItemListFragment;
import com.gilbert.ltt.lttcustomer.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xxstop on 15/6/15.
 */
public class AboutListFragment extends ItemListFragment<Map<String, Object>> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        items = new ArrayList<>();
        items.add(new HashMap<String, Object>() {
            {
                put("title", "关于手机两条腿");
                put("marked", "");
                put("action", null);
            }
        });
        adapter = new SimpleAdapter(getActivity(), items,
                R.layout.arrows_right_item, new String[]{"title","marked"},
                new int[]{R.id.tv_title,R.id.tv_marked});
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object action = items.get(position).get("action");
        if (null == action) {
            return ;
        }
        Intent intent = new Intent(getActivity(), (Class<?>) action);
        startActivity(intent);
    }
}
