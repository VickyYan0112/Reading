package com.yan.reading;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {

    private String[] title = new String[]{"中文书刊","英文书刊","排行榜"};

    public MyPageAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0) {
            return new FirstFragment();
        }else if(i==1){
            return new SecondFragment();
        } else{
            return new ThirdFragment();
        }
    }

    public CharSequence getPageTitle(int position){

        return title[position];
    }

    @Override
    public int getCount() {
        return 3;
    }
}
