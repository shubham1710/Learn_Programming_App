package com.codeout.lrnprogpro;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


    }

    public void o6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.codeout.lrnprogpro"));
        startActivity(browserIntent);
    }

    public void o7(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:learn.prog.cd@gmail.com"));
        startActivity(browserIntent);
    }

    public void o1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/lrn.prog.cd"));
        startActivity(browserIntent);
    }

    public void o2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/lrnprog/"));
        startActivity(browserIntent);
    }

    public void o3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/company/learn-prog"));
        startActivity(browserIntent);
    }

    public void o4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/lrnprog"));
        startActivity(browserIntent);
    }
}
