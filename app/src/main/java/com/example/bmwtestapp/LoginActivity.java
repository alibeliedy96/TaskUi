package com.example.bmwtestapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.chinodev.androidneomorphframelayout.NeomorphFrameLayout;

import soup.neumorphism.NeumorphCardView;

public class LoginActivity extends AppCompatActivity {

    private AppCompatButton mFacebookBtn;
    private AppCompatButton mGoogleBtn;
    private NeomorphFrameLayout mEmailEt;
    private NeomorphFrameLayout mPasswordEt;
    private TextView mForgetPasswordTv;
    private AppCompatButton mLoginButton;
    private TextView mCreateNewAccountTv;
    private TextView mSkipTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mFacebookBtn = findViewById(R.id.facebookbtn);
        mGoogleBtn = findViewById(R.id.googlebtn);
        mEmailEt = findViewById(R.id.email_et);
        mPasswordEt = findViewById(R.id.password_et);
        mForgetPasswordTv = findViewById(R.id.forget_password_tv);
        mLoginButton = findViewById(R.id.login_button);
        mCreateNewAccountTv = findViewById(R.id.create_new_account_tv);
        mSkipTv = findViewById(R.id.skip_tv);
        mCreateNewAccountTv.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
        });
        mLoginButton.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        });
        mSkipTv.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        });
        mFacebookBtn.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        });
        mGoogleBtn.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        });
    }
}