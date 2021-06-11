package com.example.bmwtestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.chinodev.androidneomorphframelayout.NeomorphFrameLayout;

public class MainActivity extends AppCompatActivity {

    private AppCompatButton mLoginBtn;
    private AppCompatButton mRegisterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoginBtn = findViewById(R.id.login_btn);
        mRegisterBtn = findViewById(R.id.register_btn);
        mLoginBtn.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,LoginActivity.class));
        });
        mRegisterBtn.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,RegisterActivity.class));
        });

    }
}