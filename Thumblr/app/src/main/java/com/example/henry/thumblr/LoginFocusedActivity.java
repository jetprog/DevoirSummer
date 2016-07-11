package com.example.henry.thumblr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginFocusedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_focused);
    }

    public void onEmail(View v){
        Intent i = new Intent(LoginFocusedActivity.this, LoginEmailActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }
}
