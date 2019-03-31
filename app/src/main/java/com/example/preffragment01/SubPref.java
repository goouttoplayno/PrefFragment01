package com.example.preffragment01;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.v4.app.FragmentTransaction;

public class SubPref extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.subscreen);
        getPreferenceManager().setSharedPreferencesName("mysetting");
    }
}
