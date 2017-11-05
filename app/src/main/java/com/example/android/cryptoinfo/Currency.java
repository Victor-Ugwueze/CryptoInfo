package com.example.android.cryptoinfo;

/**
 * Created by GOZMAN VICTOR on 10/5/2017.
 */

public class Currency{
    private CurrencyName name;
    private double rate;

    public Currency(CurrencyName name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public CurrencyName getName() {
        return this.name;
    }

    public void setName(CurrencyName name) {
        this.name = name;
    }

    public String getRate() {
        String rate= Double.toString(this.rate);

        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}
