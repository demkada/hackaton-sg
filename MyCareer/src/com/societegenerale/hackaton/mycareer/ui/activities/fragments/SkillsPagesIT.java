package com.societegenerale.hackaton.mycareer.ui.activities.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.societegenerale.hackaton.mycareer.R;

public class SkillsPagesIT extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_skills_pages_it, container, false);

        return rootView;
    }
}