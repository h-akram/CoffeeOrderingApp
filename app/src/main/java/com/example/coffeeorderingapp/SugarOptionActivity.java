package com.example.coffeeorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SugarOptionActivity extends AppCompatActivity {

    String sugar_quantity = "";
    String coffee_type = "";

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

        // Get Coffee type value as intent extras from Sugar option activity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            coffee_type = extras.getString("Key_Coffee");
            //The key argument here must match that used in the other activity
        }
        Log.i("Sugar_Options_page__Coffee_type", coffee_type);


        btnLow.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sugar_quantity = "Easy";
                        Log.i("Button Pressed", sugar_quantity);
                        Intent intent = new Intent(SugarOptionActivity.this, OrderReviewActivity.class);
                        intent.putExtra("Key_Coffee",coffee_type);
                        intent.putExtra("Key_Sugar",sugar_quantity);
                        startActivity(intent);
                    }
                }
        );
        btnMedium.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sugar_quantity = "Regular";
                        Log.i("Button Pressed", sugar_quantity);
                        Intent intent = new Intent(SugarOptionActivity.this, OrderReviewActivity.class);
                        intent.putExtra("Key_Coffee",coffee_type);
                        intent.putExtra("Key_Sugar",sugar_quantity);
                        startActivity(intent);
                    }
                }
        );
        btnHigh.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sugar_quantity = "Extra";
                        Log.i("Button Pressed", sugar_quantity);
                        Intent intent = new Intent(SugarOptionActivity.this, OrderReviewActivity.class);
                        intent.putExtra("Key_Coffee",coffee_type);
                        intent.putExtra("Key_Sugar",sugar_quantity);
                        startActivity(intent);
                    }
                }
        );
    }
}