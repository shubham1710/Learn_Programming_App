package com.codeout.lrnprogpro;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class DailyChallenge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_challenge);
    }
    public void d1(View view) {

        Intent intent = new Intent(DailyChallenge.this, Easy.class);
        startActivity(intent);
    }

    public void d2(View view) {

        Intent intent = new Intent(DailyChallenge.this, Med.class);
        startActivity(intent);
    }

    public void d3(View view) {

        Intent intent = new Intent(DailyChallenge.this, Hard.class);
        startActivity(intent);
    }

}


