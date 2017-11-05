package com.example.android.cryptoinfo.api;

import com.example.android.cryptoinfo.Currency;
import com.example.android.cryptoinfo.model.Item;
import com.example.android.cryptoinfo.model.ItemResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by GOZMAN VICTOR on 11/3/2017.
 */
public interface ApiService{
    @GET("/data/price?fsym=ETH&tsyms=BTC,USD,EUR")
    Call<ItemResponse> getAllItems();
}


