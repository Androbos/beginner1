package com.example.justjava;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.justjava.model.HistoryModel;

import java.util.List;

/**
 * Created by pratama on 11/6/2016.
 */

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.MyViewHolder> {

    private List<HistoryModel> HistoryList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView quantity, price;

        public MyViewHolder(View view) {
            super(view);
            price = (TextView) view.findViewById(R.id.price);
            quantity = (TextView) view.findViewById(R.id.quantity);

        }
    }


    public HistoryAdapter(List<HistoryModel> HistoryList) {
        this.HistoryList = HistoryList;
    }

    @Override
    public HistoryAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.history_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        HistoryModel History = HistoryList.get(position);
        holder.price.setText(History.getPrice() + "");
        holder.quantity.setText(History.getQuantity() + "");
    }


    @Override
    public int getItemCount() {
        return HistoryList.size();
    }
}
