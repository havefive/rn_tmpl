package com.havefive.rn_tmpl;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactPackage;

import java.util.List;

public class RnActivity extends ReactActivity {

    @Override
    protected String getMainComponentName() {
        return null;
    }

    @Override
    protected boolean getUseDeveloperSupport() {
        return false;
    }

    @Override
    protected List<ReactPackage> getPackages() {
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_rn);
    }
}
