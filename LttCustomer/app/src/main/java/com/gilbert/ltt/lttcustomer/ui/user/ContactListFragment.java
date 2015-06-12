package com.gilbert.ltt.lttcustomer.ui.user;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.gilbert.ltt.lttcustomer.R;
import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import roboguice.fragment.RoboListFragment;

/**
 * Created by xxstop on 15/6/12.
 */
public class ContactListFragment extends RoboListFragment {
    @Inject ArrayList<Map<String,String>> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] texts = new String[] {"意见反馈", "客户电话"};
        String[] marks = new String[] {"", "400-820-5555"};
        for (int i=0; i<texts.length; i++) {
            HashMap<String, String> map = new HashMap<>();
            map.put("title", texts[i]);
            map.put("marked", marks[i]);
            map.put("intent", "tel:400-800-5555");
            list.add(map);
        }
        setListAdapter(new SimpleAdapter(getActivity(), list,
                R.layout.arrows_right_item, new String[]{"title","marked"},
                new int[]{R.id.tv_title,R.id.tv_marked}));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(list.get(position).get("intent")));
        startActivity(intent);
    }
}
