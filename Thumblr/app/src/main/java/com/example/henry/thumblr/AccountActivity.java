package com.example.henry.thumblr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }

    public void onHome(View v){
        Intent i = new Intent(AccountActivity.this, HomeActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }

    public void onLikes(View v){
        Intent i = new Intent(AccountActivity.this, LikesActivity.class);
        startActivity(i);
    }
}
