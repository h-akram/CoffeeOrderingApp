package com.example.coffeeorderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderConfirmationActivity extends AppCompatActivity {

    //elements
    String coffee_type = "";
    String estimated_time = "";
    TextView viewTime;
    private Button maps_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirmation);

        viewTime = findViewById(R.id.textView_time);

        // Get sugar value & coffee type as intent extras from Sugar option activity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            coffee_type = extras.getString("Key_Coffee");
            //The key argument here must match that used in the other activity

            Log.i("Confirm_Coffee", coffee_type);
            //viewTime.setText(coffee_type);
        }

        // if/else to show estimated time
        if (coffee_type.equals("Cappuccino")) {
            viewTime.setText("10 minutes");
        }
        else if (coffee_type.equals("Frappuccino")) {
            viewTime.setText("12 minutes");
        }
        else if (coffee_type.equals("Americano")) {
            viewTime.setText("6 minutes");
        }
        else if (coffee_type.equals("Macchiato")) {
            viewTime.setText("8 minutes");
        }

        maps_btn = findViewById(R.id.maps_btn);
        maps_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(OrderConfirmationActivity.this, MapsActivity.class);
                startActivity(i);
            }
        });
    }
}