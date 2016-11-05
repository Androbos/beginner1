package com.example.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    TextView quantityTextView;
    TextView priceTextView;
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        quantityTextView = (TextView) findViewById(R.id.quantity);
        priceTextView = (TextView) findViewById(R.id.price);
    }

    private void increase(View v) {
        quantity++;
        display();
    }

    private void decrease(View v) {
        quantity--;
        display();
    }

    public void orderonClick(View v) {
        int price = quantity * 5;
        priceTextView.setText("$"+price+"\nThank You");
    }



    private void display() {
        quantityTextView.setText(quantity);

    }


}
