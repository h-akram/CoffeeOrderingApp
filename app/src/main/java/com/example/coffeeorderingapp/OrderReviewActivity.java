package com.example.coffeeorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderReviewActivity extends AppCompatActivity {

    //elements
    TextView viewSugar;
    TextView viewCoffee;
    Button btnYes;
    Button btnNo;
    String coffee_type = "";
    String sugar_quantity = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_review);

        //instantiate element objects
        viewCoffee = findViewById(R.id.textView_coffee);
        viewSugar = findViewById(R.id.textView_sugar);
        btnYes = findViewById(R.id.button_yes);
        btnNo = findViewById(R.id.button_no);

        //coffee_type = getIntent().getStringExtra("coffee_type");
        Log.i("View Coffee", coffee_type);
        viewCoffee.setText("Americano");

        //sugar_quantity = getIntent().getStringExtra("sugar_quantity");
        Log.i("View Coffee", sugar_quantity);
        viewSugar.setText("Low");

        btnYes.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i("Button Yes", "Pressed");
                        Intent i = new Intent(OrderReviewActivity.this, OrderConfirmationActivity.class);
                        startActivity(i);
                    }
                }
        );
        btnNo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i("Button No", "Pressed");
                        Intent i = new Intent(OrderReviewActivity.this, MainActivity.class);
                        startActivity(i);
                    }
                }
        );
    }
}