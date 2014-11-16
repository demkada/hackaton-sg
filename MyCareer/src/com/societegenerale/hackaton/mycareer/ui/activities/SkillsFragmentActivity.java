package com.societegenerale.hackaton.mycareer.ui.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import com.societegenerale.hackaton.mycareer.R;
import com.societegenerale.hackaton.mycareer.ui.activities.fragments.SkillsPages;
import com.societegenerale.hackaton.mycareer.ui.widget.ZoomOutPageTransformer;

public class SkillsFragmentActivity extends FragmentActivity {
	    /**
	     * The number of pages (wizard steps) to show in this demo.
	     */
	    private static final int NUM_PAGES = 5;

	    /**
	     * The pager widget, which handles animation and allows swiping horizontally to access previous
	     * and next wizard steps.
	     */
	    private ViewPager mPager;

	    /**
	     * The pager adapter, which provides the pages to the view pager widget.
	     */
	    private PagerAdapter mPagerAdapter;

	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.fragment_skills);

	        // Instantiate a ViewPager and a PagerAdapter.
	        mPager = (ViewPager) findViewById(R.id.skills_pager);
	        mPager.setPageTransformer(true, new ZoomOutPageTransformer());
	        mPagerAdapter = new ScreenSlidePagerAdapter(super.getSupportFragmentManager());
	        mPager.setAdapter(mPagerAdapter);
	    }

	    @Override
	    public void onBackPressed() {
	        if (mPager.getCurrentItem() == 0) {
	            // If the user is currently looking at the first step, allow the system to handle the
	            // Back button. This calls finish() on this activity and pops the back stack.
	            super.onBackPressed();
	        } else {
	            // Otherwise, select the previous step.
	            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
	        }
	    }

	    /**
	     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
	     * sequence.
	     */
	    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
	        public ScreenSlidePagerAdapter(FragmentManager fm) {
	            super(fm);
	        }

	        @Override
	        public Fragment getItem(int position) {
	            return new SkillsPages();
	        }

	        @Override
	        public int getCount() {
	            return NUM_PAGES;
	        }
	    }
	}