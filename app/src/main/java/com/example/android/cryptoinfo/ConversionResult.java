package com.example.android.cryptoinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.cryptoinfo.api.ApiService;
import com.example.android.cryptoinfo.model.CryptoCurrency;


import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConversionResult extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_result);
    }

}
