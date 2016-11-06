package com.example.justjava.model;

import com.orm.SugarRecord;

/**
 * Created by pratama on 11/6/2016.
 */

public class HistoryModel extends SugarRecord {

    private int quantity;
    private String price;

    public HistoryModel() {

    }

    public HistoryModel(int quantity, String price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
