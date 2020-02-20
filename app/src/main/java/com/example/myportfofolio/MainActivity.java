package com.example.myportfofolio;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myportfofolio.controller.DevPageAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    TextView getInTouch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getInTouch = findViewById(R.id.getInTouch);

        getInTouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String phoneNo = "+40758510153";
                    String dial = "tel:" + phoneNo;
                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
            }
        });

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new DevPageAdapter(getSupportFragmentManager()));

        TabLayout tabs = findViewById(R.id.tabLayout);
        tabs.setupWithViewPager(viewPager);

        //tabs.setTabTextColors(Color.GRAY, Color.parseColor("yellow"));
    }
}
