package com.societegenerale.hackaton.mycareer.ui.activities.fragments;



import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.societegenerale.hackaton.mycareer.R;

public class CoachFragment extends Fragment {
	
	public CoachFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_coach, container, false);
         
        return rootView;
    }
}
