package com.gilbert.ltt.lttcustomer.ui.user;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.gilbert.ltt.diana.local.ui.ItemListFragment;
import com.gilbert.ltt.lttcustomer.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xxstop on 15/6/12.
 */
public class ContactListFragment extends ItemListFragment<Map<String, Object>> {

    @Override
    protected ListAdapter createAdapter(List<Map<String, Object>> items) {
        adapter = new SimpleAdapter(getActivity(), items,
                R.layout.arrows_right_item, new String[]{"title","marked"},
                new int[]{R.id.tv_title,R.id.tv_marked});
        return adapter;
    }

    @Override
    public List<Map<String, Object>> getItems() {
        items = new ArrayList<>();
        String[] texts = new String[] {"意见反馈", "客户电话"};
        String[] marks = new String[] {"", "400-820-5555"};
        Object[] actions = new Object[] {null, "tel:400-800-5555"};
        for (int i=0; i<texts.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("title", texts[i]);
            map.put("marked", marks[i]);
            map.put("action", actions[i]);
            items.add(map);
        }
        return items;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object action = items.get(position).get("action");
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
