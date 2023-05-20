package com.example.android_news_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;


import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    TabLayout tabLayout;
    TabItem mhome, mscience, mhealth, mtech, mentertainment, msports;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;

    //initialise api key
    String api ="avd_QiErAGMcEjSocycXS-3DqQl8XVVOmzffj6POpAE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mtoolbar=findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);


        mhome = findViewById(R.id.home);
        mscience = findViewById(R.id.science);
        msports = findViewById(R.id.sports);
        mtech = findViewById(R.id.technology);
        mentertainment = findViewById(R.id.entertainment);
        mhealth = findViewById(R.id.health);

        ViewPager viewPager=findViewById(R.id.fragmentcontainer);
        tabLayout=findViewById(R.id.include);


        pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 6);
        viewPager.setAdapter(pagerAdapter);



        //move user based on tab click
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
}