package com.example.justjava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.justjava.model.CalculatorModel;
import com.example.justjava.model.HistoryModel;
import com.joanzapata.iconify.IconDrawable;
import com.joanzapata.iconify.fonts.FontAwesomeIcons;
import com.joanzapata.iconify.widget.IconTextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalculatorActivity extends BaseActivity {

    @BindView(R.id.quantity)
    TextView quantityTextView;

    @BindView(R.id.price)
    TextView priceTextView;

    @BindView(R.id.fontawesome)
    IconTextView fontawesome;

    private int quantity = 0;
    private String price;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add("history").setTitle("history")
                .setIcon(new IconDrawable(this, FontAwesomeIcons.fa_history)
                        .colorRes(android.R.color.white).actionBarSize())
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String title = item.getTitle().toString();
        if (title.equals("history")) {
            Intent intent = new Intent(CalculatorActivity.this, HistoryActivity.class);
            startActivity(intent);
        } else {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ButterKnife.bind(this);


    }

    //button
    public void increase(View v) {
        if (quantity < 5) {
            quantity++;
            display();
        }

    }

    public void decrease(View v) {
        if (quantity > 0) {
            quantity--;
            display();
        }

    }

    public void orderonClick(View v) {
        showOrder();
    }


    //logic
    private void display() {
        quantityTextView.setText(quantity + "");
        price();
    }


    private void price() {
        int p = quantity * 5;
        price = "$" + p;
        priceTextView.setText(price);
    }

    private void showOrder() {
        priceTextView.setText(price + "\nThank your for order");
        HistoryModel historyModel = new HistoryModel();
        historyModel.setQuantity(quantity);
        historyModel.setPrice(price);
        historyModel.save();

        String coffee = "";
        for (int i = 0; i < quantity; i++) {
            coffee += "{fa-coffee} ";
        }
        fontawesome.setText(coffee);


    }


}
