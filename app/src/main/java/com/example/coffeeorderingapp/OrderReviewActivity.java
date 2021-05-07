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

        // Get sugar value & coffee type as intent extras from Sugar option activity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            coffee_type = extras.getString("Key_Coffee");
            sugar_quantity = extras.getString("Key_Sugar");
            //The key argument here must match that used in the other activity

            Log.i("Reivew_Coffee", coffee_type);
            viewCoffee.setText(coffee_type);
            Log.i("Review_Sugar", sugar_quantity);
            viewSugar.setText(sugar_quantity);
        }

        btnYes.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i("Button Yes", "Pressed");
                        Intent i = new Intent(OrderReviewActivity.this, OrderConfirmationActivity.class);
                        i.putExtra("Key_Coffee", coffee_type);
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