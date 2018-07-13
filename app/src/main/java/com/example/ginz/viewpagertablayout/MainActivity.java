package com.example.ginz.viewpagertablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager mPager;
    private TabLayout mTabLayout;
    private FragmentManager mManager;
    private List<Fragment> mFragment;
    private List<String> mTitle;
    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        mPager = (ViewPager) findViewById(R.id.view_pager);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mFragment = new ArrayList<>();
        mFragment.add(new SpiderManFragment());
        mFragment.add(new IronManFragment());
        mFragment.add(new PantherFragment());

        mTitle = new ArrayList<>();
        mTitle.add(getString(R.string.spider_man));
        mTitle.add(getString(R.string.iron_man));
        mTitle.add(getString(R.string.black_panther));

        mManager = getSupportFragmentManager();
        mPagerAdapter = new PagerAdapter(mManager, mFragment, mTitle);
        mPager.setAdapter(mPagerAdapter);
        mTabLayout.setupWithViewPager(mPager);
        mPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.setTabsFromPagerAdapter(mPagerAdapter);
    }
}
