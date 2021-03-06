package com.societegenerale.hackaton.mycareer.ui.activities.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;

import com.societegenerale.hackaton.mycareer.R;
import com.societegenerale.hackaton.mycareer.ui.activities.SkillsFragmentActivity;
import com.societegenerale.hackaton.mycareer.ui.adapter.CustomGridViewAdapterProf;

public class ProlfilFragment extends Fragment {
	
	public ProlfilFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.fragment_profil, container, false);
		GridView gridView = (GridView)rootView.findViewById(R.id.gridView2);
		gridView.setAdapter(new CustomGridViewAdapterProf(getActivity()));
		
		// Implement On Item click listener
				gridView.setOnItemClickListener(new OnItemClickListener() {
					Fragment fragment = null;
					Activity SkillsAct = null;
					@Override
					public void onItemClick(AdapterView<?> a, View v, int position, long id) {
						
						
						switch(position) {
						case 0:
							fragment = new CursusFragment();
							break;
						case 1:
							SkillsAct =  new SkillsFragmentActivity();
							break;
						case 2:
							fragment = new JobFragment();
							break;
						default:
							break;
						}
						if (fragment != null) {
				            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
				            fragmentTransaction.setCustomAnimations(R.anim.slide_to_y, R.anim.slide_from_x, R.anim.slide_to_y, R.anim.slide_from_x);
				            fragmentTransaction.replace(R.id.frame_container, fragment).addToBackStack(null).commit();
				 
				        }
						else if (SkillsAct != null) {
							Intent intent = new Intent(getActivity(), SkillsAct.getClass());
							//Bundle bundle = ActivityOptions.makeCustomAnimation(getActivity(), R.anim.slide_to_y, R.anim.slide_from_x).toBundle();
							startActivity(intent);
						}
						
						else {
				            // error in creating fragment
				            Log.e("Home Fragment", "Error in launching fragment");
				        }
					}
				});
         
        return rootView;
	}
}
