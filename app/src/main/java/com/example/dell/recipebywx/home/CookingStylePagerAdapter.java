package com.example.dell.recipebywx.home;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ListView;

import java.util.List;

/**
 * Created by dell on 2018/12/28.
 */

public class CookingStylePagerAdapter extends FragmentPagerAdapter {
    private Context context;
    private List<Fragment> fragments;
    private List<String> styles;
    public CookingStylePagerAdapter(FragmentManager fm,Context context,List<Fragment> fragments,List<String> styles) {
        super(fm);
        this.context = context;
        this.fragments = fragments;
        this.styles = styles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return styles.get(position);
    }
}
