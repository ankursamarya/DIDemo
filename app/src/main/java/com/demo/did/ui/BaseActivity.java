package com.demo.did.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.demo.did.analytics.AnalyticsManager;
import com.demo.did.analytics.EventLogger;
import com.demo.did.analytics.User;
import com.demo.did.api.ApiManager;
import com.demo.did.storage.PrefUtil;

public class BaseActivity extends AppCompatActivity {

    //// TODO:
    protected ApiManager apiManager;
    protected AnalyticsManager analyticsManager;
    protected EventLogger eventLogger;
    protected User loggedInUser;
    protected PrefUtil prefUtil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

}
