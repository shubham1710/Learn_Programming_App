package com.codeout.lrnprogpro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class problemsets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problemsets);
    }

    public void p1(View view) {
        Intent intent = new Intent(problemsets.this, P1.class);
        startActivity(intent);
    }

    public void p2(View view) {
        Intent intent = new Intent(problemsets.this, P2.class);
        startActivity(intent);
    }

    public void p3(View view) {
        Intent intent = new Intent(problemsets.this, P3.class);
        startActivity(intent);
    }

    public void p4(View view) {
        Intent intent = new Intent(problemsets.this, P4.class);
        startActivity(intent);
    }

    public void p5(View view) {
        Intent intent = new Intent(problemsets.this, P5.class);
        startActivity(intent);
    }

    public void p6(View view) {
        Intent intent = new Intent(problemsets.this, P6.class);
        startActivity(intent);
    }

    public void p7(View view) {
        Intent intent = new Intent(problemsets.this, P7.class);
        startActivity(intent);
    }

    public void p8(View view) {
        Intent intent = new Intent(problemsets.this, P8.class);
        startActivity(intent);
    }

    public void p9(View view) {
        Intent intent = new Intent(problemsets.this, P9.class);
        startActivity(intent);
    }

    public void pu(View view) {
        Intent intent = new Intent(problemsets.this, PU.class);
        startActivity(intent);
    }
}
