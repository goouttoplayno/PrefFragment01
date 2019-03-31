package com.example.preffragment01;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

public class PrefFragment extends PreferenceActivity {
    PreferenceManager pm;
    CheckBoxPreference checkbox;
    ListPreference listP;
    EditTextPreference editP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference02);

        getPreferenceManager().setSharedPreferencesName("mysetting");//修改生成的sharedpref文件的名字

    }

}
