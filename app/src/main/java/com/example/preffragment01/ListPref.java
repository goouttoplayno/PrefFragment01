package com.example.preffragment01;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class ListPref extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.listpref);
        getPreferenceManager().setSharedPreferencesName("mysetting");
    }
}
