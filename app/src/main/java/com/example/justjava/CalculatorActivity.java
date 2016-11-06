package com.example.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalculatorActivity extends BaseActivity {

    @BindView(R.id.quantity)
    TextView quantityTextView;
    @BindView(R.id.price)
    TextView priceTextView;

    private int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ButterKnife.bind(this);

    }

    public void increase(View v) {
        quantity++;
        display();
    }

    public void decrease(View v) {
        quantity--;
        display();
    }

    public void orderonClick(View v) {
        int price = quantity * 5;
        priceTextView.setText("$"+price+"\nThank You");
    }



    private void display() {
        quantityTextView.setText(quantity+"");

    }


}
