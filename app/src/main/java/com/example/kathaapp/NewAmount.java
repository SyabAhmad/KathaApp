package com.example.kathaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewAmount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_amount);

        Button calculationAndNext = (Button) findViewById(R.id.toTheMainActivity1);
        MainActivity mainActivity = new MainActivity();
        calculationAndNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText amount = (EditText) findViewById(R.id.newAmount1);
                int amount1 = Integer.parseInt(amount.getText().toString());
                mainActivity.totalAmount += amount1;
                TextView days = (TextView) findViewById(R.id.remainingDays);
                Intent intent = new Intent(NewAmount.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}