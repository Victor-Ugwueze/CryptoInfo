package com.example.android.cryptoinfo;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.cryptoinfo.model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GOZMAN VICTOR on 10/28/2017.
 */
 class RViewAdapter extends RecyclerView.Adapter<RViewAdapter.CurrencyViewHolder>{

    static class CurrencyViewHolder extends RecyclerView.ViewHolder {
        TextView cryptoPrice;
        TextView cryptoName;



        CurrencyViewHolder(View itemView) {
            super(itemView);
            cryptoPrice = (TextView)itemView.findViewById(R.id.crypto_name);
            cryptoName = (TextView)itemView.findViewById(R.id.crypto_price);
        }
    }

    private ArrayList<Item> item;

    RViewAdapter(ArrayList<Item> item){
        this.item = item;
    }


    @Override
    public RViewAdapter.CurrencyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new CurrencyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(RViewAdapter.CurrencyViewHolder holder, int position) {
        TextView bitcoinPrice = holder.cryptoPrice;
        TextView ethPrice = holder.cryptoName;
        bitcoinPrice.setText(item.get(position).getBtc());
        ethPrice.setText(item.get(position).getUsd());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}