package com.example.coffeeorderingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView geeksforgeeks;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // initialising all views through id defined above
        geeksforgeeks = findViewById(R.id.gfg);
        geeksforgeeks.setText(
                "GeeksForGeeks(Firebase Authentication)");
    }
}

