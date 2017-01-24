package com.demo.did.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.did.R;
import com.demo.did.analytics.EventLogger;
import com.demo.did.api.ApiManager;
import com.demo.did.storage.PrefUtil;


public class BaseFragment extends Fragment {

    //// TODO:
    protected ApiManager apiManager;
    protected EventLogger eventLogger;
    protected PrefUtil prefUtil;

    public BaseFragment() {
    }


    public static BaseFragment newInstance(String param1, String param2) {
        BaseFragment fragment = new BaseFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_base, container, false);
    }

}
