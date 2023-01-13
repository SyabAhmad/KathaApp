package com.example.kathaapp;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int daysLimit;
    public int customDaysLimits;
    public int  totalAmount= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NewAmount newAmount = new NewAmount();
        TextView amountToBeDisplay = (TextView) findViewById(R.id.totalRemainingAmount);
        amountToBeDisplay.setText(String.valueOf(totalAmount));
    }
}