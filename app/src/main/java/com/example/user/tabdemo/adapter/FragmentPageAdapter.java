package com.example.user.tabdemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.user.tabdemo.fragments.FragmentOne;
import com.example.user.tabdemo.fragments.FragmentThree;
import com.example.user.tabdemo.fragments.FragmentTwo;

/**
 * Created by User on 7/25/2017.
 */

public class FragmentPageAdapter extends FragmentStatePagerAdapter {
    int count;
    String[] title;
    public FragmentPageAdapter(FragmentManager fm,int count,String[] title) {
        super(fm);
        this.count = count;
        this.title = title;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentThree();
        }
        return null;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
