package com.example.ys020.hackton_ex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText mTitle;
    private EditText mContent;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_third);
        mTitle = (EditText) findViewById(R.id.title_edt);
        mContent = (EditText) findViewById(R.id.content_edt);
        findViewById(R.id.complete_btn).setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {
        String title = mTitle.getText().toString();
        String content = mContent.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("title", title);
        intent.putExtra("content", content);
        setResult(RESULT_OK, intent);
        finish();
    }

}
