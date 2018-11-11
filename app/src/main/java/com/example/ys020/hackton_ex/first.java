package com.example.ys020.hackton_ex;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;


public class first extends Fragment {
    Button sm1, gm2, sf3, sc4;
    public first()
    {
    }

    public static first newInstance() {
        first fragment = new first();
        return fragment;
    }



    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        RelativeLayout layout= (RelativeLayout) inflater.inflate(R.layout.fragment_first, container, false);
return layout;

    }

}





//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//    }
//    public void movePage3List1()
//    {
//        first first = new first();
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.btn_first, first);
//        fragmentTransaction.commit();
//    }
//    public void movePage3List2()
//    {
//        second second = new second();
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.btn_second, second);
//        fragmentTransaction.commit();
//    }
//    public void movePage3List3()
//    {
//        third third = new third();
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.btn_third, third);
//        fragmentTransaction.commit();
//    }
//    public void movePage4List4()
//    {
//    four four = new four();
//    FragmentManager fragmentManager = getFragmentManager();
//    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//    fragmentTransaction.replace(R.id.btn_four, four);
//    fragmentTransaction.commit();
//}












