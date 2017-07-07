package com.example.gucheng.demo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.RadioGroup;

import com.astuetz.PagerSlidingTabStrip;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends FragmentActivity {

    private List<Fragment> fragmentList;
    private ViewPager viewPager; //存放fragment的布局
    private PagerSlidingTabStrip pagerSlidingTabStrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.viewpager);
        pagerSlidingTabStrip = (PagerSlidingTabStrip) findViewById(R.id.pagerslidingtab);

        //初始化数据
        //initFragmentList();

        FragmentManager fragmentManager = getSupportFragmentManager();
        //MyFragmentPagerAdapter myFragmentPagerAdapter = new MyFragmentPagerAdapter(fragmentManager,fragmentList);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        pagerSlidingTabStrip.setViewPager(viewPager);

    }

//    public void initFragmentList(){
//        //把三个碎片new出来
//        FragmentShowInformation fragmentShowInformation = new FragmentShowInformation();
//        FragmentPublishInformation fragmentPublishInformation = new FragmentPublishInformation();
//        FragmentPersionalCenter fragmentPersionalCenter = new FragmentPersionalCenter();
//
//        //添加到list
//        fragmentList = new ArrayList<Fragment>();
//        fragmentList.add(fragmentShowInformation);
//        fragmentList.add(fragmentPublishInformation);
//        fragmentList.add(fragmentPersionalCenter);
//    }

    class MyPagerAdapter extends FragmentPagerAdapter{
        String[] title = {"项目一","项目二","项目三","项目四","项目五","项目六"};
        //把三个碎片new出来
        FragmentShowInformation fragmentShowInformation = new FragmentShowInformation();
        FragmentPublishInformation fragmentPublishInformation = new FragmentPublishInformation();
        FragmentPersionalCenter fragmentPersionalCenter = new FragmentPersionalCenter();
        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();
        Fragment3 fragment3 = new Fragment3();

        public MyPagerAdapter(FragmentManager fragmentManager){
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return fragmentShowInformation;
                case 1:
                    return fragmentPublishInformation;
                case 2:
                    return fragmentPersionalCenter;
                case 3:
                    return fragment1;
                case 4:
                    return fragment2;
                case 5:
                    return fragment3;
                default:
                    return null;
            }

        }

        @Override
        public int getCount() {
            return title.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return title[position];
        }
    }

}
