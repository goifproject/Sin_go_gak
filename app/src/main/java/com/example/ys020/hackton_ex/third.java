package com.example.ys020.hackton_ex;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class third extends Fragment
{
    TextView setTitle,setContent;
    ListView mListView;
    MyAdapter mMyAdapter;
    ArrayList mMyModel;

    MyModel mModel;
    ArrayList<MyModel> items = new ArrayList<>();
    FloatingActionButton mFab;
    public third()
    {
    }
    public static third newInstance(){
        third fragment = new third();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

//        setContentView(R.layout.activity_main);
//        mMyAdapter = new MyAdapter(items, this);
//        mFab = (FloatingActionButton) findViewById(R.id.floating_action_btn);
//        mListView = (ListView) findViewById(R.id.main_list_view);
//        mListView.setAdapter(mMyAdapter);
//        mFab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(third.this, SecondActivity.class);
//                startActivityForResult(intent, 1000);
//            }
//        });
//    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1000 || data !=null){
            String title = data.getStringExtra("title");
            String content = data.getStringExtra("content");

            items.add(new MyModel(title,content));
            mMyAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view =inflater.inflate(R.layout.fragment_third,container,false);

        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.fragment_third, container, false);
        return layout;
    }

}