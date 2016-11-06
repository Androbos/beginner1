package com.example.justjava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void birthday(View v) {
        Intent i = new Intent(this, BirthdayActivity.class);
        startActivity(i);
    }

    public void calculator(View v) {
        Intent i = new Intent(this, CalculatorActivity.class);
        startActivity(i);
    }



}
