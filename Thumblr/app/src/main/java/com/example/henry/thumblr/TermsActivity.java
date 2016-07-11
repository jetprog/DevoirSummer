package com.example.henry.thumblr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TermsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);
    }

    public void onBack(View v){
        finish();
    }
}
