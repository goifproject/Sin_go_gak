package com.example.ys020.hackton_ex;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.support.v4.app.Fragment;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class four extends Fragment
{
    public four()
    {
    }
    public static four newInstance(){
        four fragment = new four();
       return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {


        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        RelativeLayout layout= (RelativeLayout) inflater.inflate(R.layout.fragment_four, container, false);

        return layout;
    }
}