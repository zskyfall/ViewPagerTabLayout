package com.example.ginz.viewpagertablayout;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> mFragment;
    private List<String> mTitle;

    public PagerAdapter(FragmentManager fm, List<Fragment> mFragment, List<String> mTitle) {
        super(fm);
        this.mFragment = mFragment;
        this.mTitle = mTitle;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragment.get(position);
    }

    @Override
    public int getCount() {
        return mFragment.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle.get(position);
    }
}
