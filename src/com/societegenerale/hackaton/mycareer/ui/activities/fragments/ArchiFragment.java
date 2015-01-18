package com.societegenerale.hackaton.mycareer.ui.activities.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.societegenerale.hackaton.mycareer.R;

public class ArchiFragment extends Fragment {
	
	public ArchiFragment(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_archi, container, false);
         
        return rootView;
    }
}
