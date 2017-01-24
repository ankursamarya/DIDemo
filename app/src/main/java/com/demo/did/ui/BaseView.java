package com.demo.did.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.demo.did.api.ApiManager;

/**
 * Created by trave on 24/1/17.
 */

public class BaseView extends View {

    //// TODO:
    protected ApiManager apiManager;

    public BaseView(Context context) {
        super(context);
    }

    public BaseView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
