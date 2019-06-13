package com.yan.reading;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

public class MyPageAdapter1 extends FragmentStatePagerAdapter {

    private String[] title1;

    public MyPageAdapter1(FragmentManager manager1){
        super(manager1);
        this.title1= new String[]{"热点抢先看","谣言粉碎机","奇葩视觉赏"};
    }
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new FirstFragment();
        }else if(position==1){
            return new SecondFragment();
        }else{
            return new ThirdFragment();
        }
    }

    public CharSequence getPageTitle(int position){

        return title1[position];
    }

    @Override
    public int getCount() {
        return 3;
    }
}
