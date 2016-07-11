package com.example.henry.thumblr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    public void onActive(View v){
        Intent i = new Intent(SearchActivity.this, ActiveActivity.class);
        startActivity(i);
        overridePendingTransition(0, 0);
    }
}
