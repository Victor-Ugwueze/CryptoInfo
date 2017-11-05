package com.example.android.cryptoinfo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by GOZMAN VICTOR on 11/5/2017.
 */





public class Item {
    @SerializedName("BTC")
    @Expose
    private Double BTC;

    @SerializedName("USD")
    @Expose
    private Double USD;

    public Item (Double btc, Double usd){
        this.BTC =btc;
        this.USD = usd;
    }

    public String getBtc() {
        return Double.toString(this.BTC);
    }

    public void setBtc(Double btc) {
        this.BTC = btc;
    }

    public String getUsd() {
        return Double.toString(this.USD);

    }

    public void setUsd(Double usd) {
        this.USD = usd;
    }
}
