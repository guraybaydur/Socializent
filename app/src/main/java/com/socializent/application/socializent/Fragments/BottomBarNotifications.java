package com.socializent.application.socializent.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.socializent.application.socializent.R;

/**
 * Created by Irem on 13.3.2017.
 */

public class BottomBarNotifications  extends Fragment {
    public static BottomBarNotifications newInstance() {
        BottomBarNotifications fragment = new BottomBarNotifications();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bottom_bar_notification_fragment, container, false);
    }
}