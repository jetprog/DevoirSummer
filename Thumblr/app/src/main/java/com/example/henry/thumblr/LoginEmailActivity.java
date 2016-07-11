package com.example.henry.thumblr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_email);
    }

    public void onPassword(View v){
        Intent i = new Intent(LoginEmailActivity.this, LoginPasswordActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }
}
