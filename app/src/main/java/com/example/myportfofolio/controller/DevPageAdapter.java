package com.example.myportfofolio.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.myportfofolio.views.About;
import com.example.myportfofolio.views.Contact;
import com.example.myportfofolio.views.Skills;
import com.example.myportfofolio.views.Work;

public class DevPageAdapter extends FragmentPagerAdapter {
    public DevPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0: return new About();
            case 1: return new Work();
            case 2: return new Skills();
            case 3: return new Contact();
            // return : *
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "ABOUT";
            case 1: return "WORK";
            case 2: return "SKILLS";
            case 3: return "CONTACT";

        }
        return null;
    }
}
