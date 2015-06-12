package com.gilbert.ltt.lttcustomer.ui.user;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.gilbert.ltt.lttcustomer.R;
import com.gilbert.ltt.lttcustomer.ui.MainActivity;
import com.google.inject.Inject;

import org.apache.commons.lang.ObjectUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import roboguice.fragment.RoboListFragment;

/**
 * Created by xxstop on 15/6/12.
 */
public class ContactListFragment extends RoboListFragment {
    @Inject ArrayList<Map<String, Object>> list;
    SimpleAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] texts = new String[] {"意见反馈", "客户电话"};
        String[] marks = new String[] {"", "400-820-5555"};
        Object[] actions = new Object[] {null, "tel:400-800-5555"};
        for (int i=0; i<texts.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("title", texts[i]);
            map.put("marked", marks[i]);
            map.put("action", actions[i]);
            list.add(map);
        }
        adapter = new SimpleAdapter(getActivity(), list,
                R.layout.arrows_right_item, new String[]{"title","marked"},
                new int[]{R.id.tv_title,R.id.tv_marked});
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object action = list.get(position).get("action");
        if (null == action) {
            return ;
        }

        Intent intent = null;
        if (action instanceof String) {
            intent = new Intent(Intent.ACTION_CALL, Uri.parse(action.toString()));
        } else {
            intent = new Intent(getActivity(), (Class<?>) action);
        }
        startActivity(intent);
    }
}
