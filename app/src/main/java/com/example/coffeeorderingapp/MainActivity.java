package com.example.coffeeorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView CoffeeOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialising all views through id defined above
        CoffeeOrder = findViewById(R.id.co);
        CoffeeOrder.setText(
                "Order your coffee now!");
    }
}

