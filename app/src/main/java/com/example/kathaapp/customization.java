package com.example.kathaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class customization extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customization);



        Button weeklyLimit = (Button) findViewById(R.id.weeklyButton);
        weeklyLimit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivityForVariables = new MainActivity();
                mainActivityForVariables.daysLimit = 7;
                Toast.makeText(getApplicationContext(), "Weekly Limit Selected (7 days)", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(customization.this, NewAmount.class);
                startActivity(intent);
            }
        });

        Button monthlyLimit = (Button) findViewById(R.id.monthlyButton);
        monthlyLimit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivityForVariables = new MainActivity();
                mainActivityForVariables.daysLimit = 30;
                Toast.makeText(getApplicationContext(), "Monthly Limit Selected (30 days)", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(customization.this, NewAmount.class);
                startActivity(intent);
            }
        });
        Button yearlyLimit = (Button) findViewById(R.id.yearlyButton);
        yearlyLimit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivityForVariables = new MainActivity();
                mainActivityForVariables.daysLimit = 365;
                Toast.makeText(getApplicationContext(), "yearly Limit Selected (365 days)", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(customization.this, NewAmount.class);
                startActivity(intent);
            }
        });

        /// custom button for days limitation
        Button customButtonLimitation = (Button) findViewById(R.id.customButton);
        customButtonLimitation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivityForVariables = new MainActivity();
                mainActivityForVariables.customDaysLimits = 234;
                Toast.makeText(getApplicationContext(), "Coming SOon", Toast.LENGTH_SHORT).show();

            }
        });

        /// submit Button
        Button submitToMaiActivity = (Button) findViewById(R.id.submitLimitsButton);
        submitToMaiActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Data Entered Successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(customization.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}