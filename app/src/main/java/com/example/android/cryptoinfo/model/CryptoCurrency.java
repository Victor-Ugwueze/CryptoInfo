package com.example.android.cryptoinfo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by GOZMAN VICTOR on 11/10/2017.
 */

public class CryptoCurrency {

    @SerializedName("ETH")
    @Expose
    private ETH eTH;
    @SerializedName("BTC")
    @Expose
    private BTC dBTC;

    public ETH getETH() {
        return eTH;
    }

    public void setETH(ETH eTH) {
        this.eTH = eTH;
    }

    public BTC getBTC() {
        return dBTC;
    }

    public void setBTC(BTC dBTC) {
        this.dBTC= dBTC;
    }


}