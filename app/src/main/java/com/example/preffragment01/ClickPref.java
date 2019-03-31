package com.example.preffragment01;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;

public class ClickPref extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.clickpref);
        getPreferenceManager().setSharedPreferencesName("mysetting");
    }

    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        //如果保存个人信息被选中，将进行括号里面的操作
        if ("yesno_save_individual_info".equals(preference.getKey())){
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference)findPreference("yesno_save_individual_info");
            EditTextPreference editTextPreference = (EditTextPreference)findPreference("individual_name");
            editTextPreference.setEnabled(checkBoxPreference.isChecked());
        }


        return super.onPreferenceTreeClick(preferenceScreen, preference);
    }
}
