package com.example.myportfofolio.views;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myportfofolio.R;


public class Skills extends Fragment {

    public Skills() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View skillsView = inflater.inflate(R.layout.fragment_skills, container, false);
        return skillsView;
    }

}
