


package com.example.ys020.hackton_ex;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    //    EditText idInput, passwordInput;
//    CheckBox autoLogin;
//    Boolean loginChecked;
//    SharedPreferences pref;
//    SharedPreferences.Editor editor;
    private Button btnRegist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button = findViewById(R.id.log_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"환영합니다!",Toast.LENGTH_SHORT).show();
            }
        });
    }

}