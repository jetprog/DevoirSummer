package com.example.henry.thumblr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onTerms(View v){
        Intent i = new Intent(LoginActivity.this, TermsActivity.class);
        startActivity(i);
        //overridePendingTransition(android.animation.R.anim.);
    }

    public void onFocus(View v){
        Intent i = new Intent(LoginActivity.this, LoginFocusedActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }
}
