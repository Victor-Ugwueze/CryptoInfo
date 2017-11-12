package com.example.android.cryptoinfo.api;

import com.example.android.cryptoinfo.model.CryptoCurrency;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by GOZMAN VICTOR on 11/3/2017.
 */
public interface ApiService{
    @GET("data/pricemulti?fsyms=ETH,BTC&tsyms=BTC,USD,EUR,NGN,ETH,JPY,AUD,CAD,HKD")
    Call<CryptoCurrency> getCurrency();
}


