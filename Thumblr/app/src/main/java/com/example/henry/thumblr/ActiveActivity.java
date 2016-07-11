package com.example.henry.thumblr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active);
    }

    public void onAccount(View v){
        Intent i = new Intent(ActiveActivity.this, AccountActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }
}
