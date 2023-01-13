package com.example.kathaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

@SuppressLint("CustomSplashScreen")
public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        boolean firstStart = prefs.getBoolean("firstStart", true);

        if (firstStart) {
            Intent gettingStartedIntent = new Intent(splashScreen.this, getstarted.class);
            startActivity(gettingStartedIntent);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("firstStart", false);
            editor.apply();
        } else
        {
            Intent mainIntent = new Intent(splashScreen.this, MainActivity.class);
            startActivity(mainIntent);
            finish();
        }

    }
}