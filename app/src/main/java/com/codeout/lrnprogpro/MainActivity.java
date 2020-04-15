package com.codeout.lrnprogpro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void open1(View view) {
        Intent intent = new Intent(MainActivity.this, Profile.class);
        startActivity(intent);
    }

    public void open2(View view) {

        Intent intent = new Intent(MainActivity.this, BasicKnowledge.class);
        startActivity(intent);
    }

    public void open3(View view) {

        Intent intent = new Intent(MainActivity.this, LearnLanguages.class);
        startActivity(intent);
    }

    public void open4(View view) {

        Intent intent = new Intent(MainActivity.this, articles.class);
        startActivity(intent);
    }

    public void open5(View view) {

        Intent intent = new Intent(MainActivity.this, problemsets.class);
        startActivity(intent);
    }

    public void open6(View view) {

        Intent intent = new Intent(MainActivity.this, Courses.class);
        startActivity(intent);
    }

    public void open7(View view) {
        Intent intent = new Intent(MainActivity.this, Pro.class);
        startActivity(intent);
    }

    public void open8(View view) {
        Intent intent = new Intent(MainActivity.this, DailyChallenge.class);
        startActivity(intent);
    }
}
