package com.example.android.cryptoinfo;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.cryptoinfo.model.CryptoCurrency;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by GOZMAN VICTOR on 10/28/2017.
 */
 class RViewAdapter extends RecyclerView.Adapter<RViewAdapter.CurrencyViewHolder>{

    static class CurrencyViewHolder extends RecyclerView.ViewHolder {
        TextView cryptoPrice;
        TextView cryptoName;
        TextView currencyName;



        CurrencyViewHolder(View itemView) {
            super(itemView);
            cryptoPrice = (TextView)itemView.findViewById(R.id.crypto_name);
            cryptoName = (TextView)itemView.findViewById(R.id.crypto_price);
            currencyName = (TextView)itemView.findViewById(R.id.crypto_currency_name);
        }
    }

    private ArrayList<String> item;
    public static String currencyName;

    RViewAdapter(ArrayList<String> item){
        this.item = item;
    }





    private final View.OnClickListener mOnClickListener = new MyOnClickListener();
    @Override
    public RViewAdapter.CurrencyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new CurrencyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(RViewAdapter.CurrencyViewHolder holder, int position) {
        TextView currecncyName = holder.currencyName;
        TextView bitcoinPrice = holder.cryptoPrice;
        TextView ethPrice = holder.cryptoName;
        bitcoinPrice.setText(item.get(position));
        currecncyName.setText(RViewAdapter.currencyName);
//        ethPrice.setText(item.get(position).getETH().getUSD().toString());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}