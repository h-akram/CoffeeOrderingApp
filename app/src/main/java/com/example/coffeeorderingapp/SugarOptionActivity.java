package com.example.coffeeorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SugarOptionActivity extends AppCompatActivity {

    String sugar_quantity = "";

    //elements
    Button btnLow;
    Button btnMedium;
    Button btnHigh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugar_option);

        //instantiate element objects
        btnLow = findViewById(R.id.button_low);
        btnMedium = findViewById(R.id.button_medium);
        btnHigh = findViewById(R.id.button_high);

        btnLow.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sugar_quantity = "Low";
                        Log.i("Button Pressed", sugar_quantity);
                        Intent i = new Intent(SugarOptionActivity.this, OrderReviewActivity.class);
                        startActivity(i);
                    }
                }
        );
        btnMedium.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sugar_quantity = "Medium";
                        Log.i("Button Pressed", sugar_quantity);
                        Intent i = new Intent(SugarOptionActivity.this, OrderReviewActivity.class);
                        startActivity(i);
                    }
                }
        );
        btnHigh.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sugar_quantity = "High";
                        Log.i("Button Pressed", sugar_quantity);
                        Intent i = new Intent(SugarOptionActivity.this, OrderReviewActivity.class);
                        startActivity(i);
                    }
                }
        );
    }
}