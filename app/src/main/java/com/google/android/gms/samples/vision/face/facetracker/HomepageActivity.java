package com.google.android.gms.samples.vision.face.facetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomepageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChooseCateg(View v) {
        Intent i = new Intent(this, OffersActivity.class);
        startActivity(i);
    }
}
