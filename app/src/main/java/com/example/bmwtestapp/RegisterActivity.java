package com.example.bmwtestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.chinodev.androidneomorphframelayout.NeomorphFrameLayout;

public class RegisterActivity extends AppCompatActivity {

    private AppCompatButton mFacebookBtn;
    private AppCompatButton mGoogleBtn;
    private NeomorphFrameLayout mEmailEt;
    private NeomorphFrameLayout mPasswordEt;
    private NeomorphFrameLayout mConfirmPasswordEt;
    private AppCompatButton mRegisterButton;
    private TextView mLogInTv;
    private TextView mSkipTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mFacebookBtn = findViewById(R.id.facebookbtn);
        mGoogleBtn = findViewById(R.id.googlebtn);
        mEmailEt = findViewById(R.id.email_et);
        mPasswordEt = findViewById(R.id.password_et);
        mConfirmPasswordEt = findViewById(R.id.confirm_password_et);
        mRegisterButton = findViewById(R.id.register_button);
        mLogInTv = findViewById(R.id.log_in_tv);
        mSkipTv = findViewById(R.id.skip_tv);
        mLogInTv.setOnClickListener(v -> {
            startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
        });
        mRegisterButton.setOnClickListener(v -> {
            startActivity(new Intent(RegisterActivity.this, HomeActivity.class));
        });
        mSkipTv.setOnClickListener(v -> {
            startActivity(new Intent(RegisterActivity.this, HomeActivity.class));
        });
        mFacebookBtn.setOnClickListener(v -> {
            startActivity(new Intent(RegisterActivity.this, HomeActivity.class));
        });
        mGoogleBtn.setOnClickListener(v -> {
            startActivity(new Intent(RegisterActivity.this, HomeActivity.class));
        });
    }
}