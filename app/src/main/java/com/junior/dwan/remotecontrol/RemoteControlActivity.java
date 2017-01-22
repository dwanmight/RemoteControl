package com.junior.dwan.remotecontrol;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Window;

public class RemoteControlActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {

        return new RemoteControlFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
}
