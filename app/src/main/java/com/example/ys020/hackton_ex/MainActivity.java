package com.example.ys020.hackton_ex;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.Fragment;
import android.widget.ImageButton;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager vp;
    ListView mListView;
    MyAdapter mMyAdapter;
    //ArrayLIst mMyModel;

    FloatingActionButton mFab;
    ArrayList<MyModel> items = new ArrayList<>();


   ImageButton btn_first;
   ImageButton btn_second;
   ImageButton btn_third;
   ImageButton btn_four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = findViewById(R.id.vp);
       ImageButton btn_first = findViewById(R.id.btn_first);
       ImageButton btn_second = findViewById(R.id.btn_second);
       ImageButton btn_third = findViewById(R.id.btn_third);
       ImageButton btn_four = findViewById(R.id.btn_four);


        vp.setAdapter(new MypagerAdapter(getSupportFragmentManager()));
        vp.setCurrentItem(0);

        btn_first.setOnClickListener(movePageListener);
        btn_first.setTag(0);
        btn_second.setOnClickListener(movePageListener);
        btn_second.setTag(1);
        btn_third.setOnClickListener(movePageListener);
        btn_third.setTag(2);


    }

        View.OnClickListener movePageListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tag = (int) v.getTag();
                vp.setCurrentItem(tag);
            }
        };

        private class MypagerAdapter extends FragmentStatePagerAdapter
        {
            public MypagerAdapter(android.support.v4.app.FragmentManager fm) {

                super(fm);
            }

            @Override
            public android.support.v4.app.Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return new first();
                    case 1:
                        return new second();
                    case 2:
                        return new third();
                    case 3:
                        return new Fragment();
                    default:
                        return null;
                }
            }

            @Override
            public int getCount() {
                return 4;
            }
//
//            public void movePage() {
//                first first = new first();
//                android.app.FragmentManager fragmentManager = getFragmentManager();
//                android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.vp, );
//                fragmentTransaction.commit();
//            }
        }
    }
















