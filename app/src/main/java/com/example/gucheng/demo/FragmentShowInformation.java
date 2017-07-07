package com.example.gucheng.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by gucheng on 2017/7/4.
 */

public class FragmentShowInformation extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        //加载并返回这个布局
        View view = inflater.inflate(R.layout.fragment_show_information,null);
        return view;
    }
}
