package com.codeout.lrnprogpro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class LearnLanguages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_languages);
           }

    public void l1(View view) {
        Intent intent = new Intent(LearnLanguages.this, L1.class);
        startActivity(intent);
    }

    public void l2(View view) {
        Intent intent = new Intent(LearnLanguages.this, L2.class);
        startActivity(intent);
    }

    public void l3(View view) {
        Intent intent = new Intent(LearnLanguages.this, L3.class);
        startActivity(intent);
    }

    public void l4(View view) {
        Intent intent = new Intent(LearnLanguages.this, L4.class);
        startActivity(intent);
    }
}
