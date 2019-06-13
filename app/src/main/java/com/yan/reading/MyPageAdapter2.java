package com.yan.reading;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPageAdapter2 extends FragmentStatePagerAdapter {

    private String[] title2;

    public MyPageAdapter2(FragmentManager manager2){
        super(manager2);
        this.title2= new String[]{"国内新闻","国外新闻"};
    }
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new FourthFragment();
        }else{
            return new FifthFragment();
        }
    }

    public CharSequence getPageTitle(int position){

        return title2[position];
    }

    @Override
    public int getCount() {
        return 2;
    }
}
