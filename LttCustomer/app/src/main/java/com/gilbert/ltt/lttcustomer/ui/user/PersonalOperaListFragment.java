package com.gilbert.ltt.lttcustomer.ui.user;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.gilbert.ltt.lttcustomer.R;
import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import roboguice.fragment.RoboListFragment;

/**
 * A placeholder fragment containing a simple view.
 */
public class PersonalOperaListFragment extends RoboListFragment {
    @Inject ArrayList<Map<String,String>> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] texts = new String[] {"位置", "个人资料", "账户与安全"};
        for (int i=0; i<texts.length; i++) {
            HashMap<String, String> map = new HashMap<>();
            map.put("title", texts[i]);
            list.add(map);
        }
        setListAdapter(new SimpleAdapter(getActivity(), list,
                R.layout.arrows_right_item, new String[]{"title"}, new int[]{R.id.tv_title}));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(getActivity(), String.valueOf(position), Toast.LENGTH_SHORT).show();
    }
}
