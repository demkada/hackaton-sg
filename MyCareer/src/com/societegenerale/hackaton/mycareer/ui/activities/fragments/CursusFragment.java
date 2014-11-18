package com.societegenerale.hackaton.mycareer.ui.activities.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.societegenerale.hackaton.mycareer.R;

public class CursusFragment extends Fragment {
	
	public CursusFragment(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_cursus, container, false);
         
        return rootView;
    }
}
