package com.example.bmwtestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

import com.chinodev.androidneomorphframelayout.NeomorphFrameLayout;

public class HomeActivity extends AppCompatActivity {

    private AppCompatButton mLogoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mLogoutBtn = findViewById(R.id.logout_btn);
        mLogoutBtn.setOnClickListener(v -> {
            startActivity(new Intent(HomeActivity.this,MainActivity.class));
        });
    }
}