package com.example.fahdamin.photo.Adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.fahdamin.photo.Fragment.CategoryFragment;
import com.example.fahdamin.photo.Fragment.DailyPopularFragment;
import com.example.fahdamin.photo.Fragment.RecentsFragment;

public class MyFragmentAdapter extends FragmentPagerAdapter {

    Context context;

    public MyFragmentAdapter(FragmentManager fm,Context context) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int i) {

        if(i==0)
            return CategoryFragment.getInstance();
        else if (i==1)
            return DailyPopularFragment.getInstance();
        else if(i==2)
            return RecentsFragment.getInstance();
        else return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int i) {
        switch (i){
            case 0:
                return "Category";
            case 1:
                return "Daily Popular";
            case 2:
                return "Recents";
        }
        return "";
    }
}
