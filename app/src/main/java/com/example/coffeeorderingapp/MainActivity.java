package com.example.coffeeorderingapp;

import android.content.Intent;
//comment
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {

    private TextView CoffeeOrder;
    String coffee_type = "";

    //elements
    Button btnCapp;
    Button btnFrapp;
    Button btnAmeri;
    Button btnMacch;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiate element objects
        btnCapp = findViewById(R.id.button_capp);
        btnFrapp = findViewById(R.id.button_frapp);
        btnAmeri = findViewById(R.id.button_ameri);
        btnMacch = findViewById(R.id.button_macch);

        btnCapp.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        coffee_type = "Cappuccino";
                        Log.i("Button Pressed", coffee_type);
                        Intent i = new Intent(MainActivity.this, SugarOptionActivity.class);
                        i.putExtra("coffee_type", coffee_type);
                        startActivity(i);
                    }
                }
        );
        btnFrapp.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        coffee_type = "Frappuccino";
                        Log.i("Button Pressed", coffee_type);
                        Intent i = new Intent(MainActivity.this, SugarOptionActivity.class);
                        i.putExtra("coffee_type", coffee_type);
                        startActivity(i);
                    }
                }
        );
        btnAmeri.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        coffee_type = "Americano";
                        Log.i("Button Pressed", coffee_type);
                        Intent i = new Intent(MainActivity.this, SugarOptionActivity.class);
                        i.putExtra("coffee_type", coffee_type);
                        startActivity(i);
                    }
                }
        );
        btnMacch.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        coffee_type = "Macchiato";
                        Log.i("Button Pressed", coffee_type);
                        Intent i = new Intent(MainActivity.this, SugarOptionActivity.class);
                        i.putExtra("coffee_type", coffee_type);
                        startActivity(i);
                    }
                }
        );
    }
}
