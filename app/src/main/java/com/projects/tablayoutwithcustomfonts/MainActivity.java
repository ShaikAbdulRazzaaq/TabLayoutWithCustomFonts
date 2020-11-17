package com.projects.tablayoutwithcustomfonts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;
import com.projects.tablayoutwithcustomfonts.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        activityMainBinding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    activityMainBinding.response.setText("Tab 1 selected");
                } else {
                    activityMainBinding.response.setText("Tab 2 selected");
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    activityMainBinding.response.setText("Tab 1 selected");
                } else {
                    activityMainBinding.response.setText("Tab 2 selected");
                }
            }
        });
    }
}