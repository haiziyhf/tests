package com.gilbert.ltt.lttcustomer.ui.user;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gilbert.ltt.lttcustomer.R;

import roboguice.fragment.provided.RoboFragment;

/**
 * Created by xxstop on 15/6/10.
 */
public class PersonalFragment extends RoboFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_home, container, false);
        return view;
    }

}
