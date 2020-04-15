package com.codeout.lrnprogpro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class BasicKnowledge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_knowledge);
    }

    public void b1(View view) {
        Intent intent = new Intent(BasicKnowledge.this, B1.class);
        startActivity(intent);
    }

    public void b2(View view) {
        Intent intent = new Intent(BasicKnowledge.this, B2.class);
        startActivity(intent);
    }

    public void b3(View view) {
        Intent intent = new Intent(BasicKnowledge.this, B3.class);
        startActivity(intent);
    }

    public void b4(View view) {
        Intent intent = new Intent(BasicKnowledge.this, B4.class);
        startActivity(intent);
    }

    public void b5(View view) {
        Intent intent = new Intent(BasicKnowledge.this, B5.class);
        startActivity(intent);
    }

    public void b6(View view) {
        Intent intent = new Intent(BasicKnowledge.this, B6.class);
        startActivity(intent);
    }

    public void b7(View view) {
        Intent intent = new Intent(BasicKnowledge.this, B7.class);
        startActivity(intent);
    }

    public void b8(View view) {
        Intent intent = new Intent(BasicKnowledge.this, B8.class);
        startActivity(intent);
    }

    public void b9(View view) {
        Intent intent = new Intent(BasicKnowledge.this, B9.class);
        startActivity(intent);
    }

    public void b10(View view) {
        Intent intent = new Intent(BasicKnowledge.this, B10.class);
        startActivity(intent);
    }

    public void b11(View view) {
        Intent intent = new Intent(BasicKnowledge.this, B11.class);
        startActivity(intent);
    }

    public void b12(View view) {
        Intent intent = new Intent(BasicKnowledge.this, B12.class);
        startActivity(intent);
    }

}
