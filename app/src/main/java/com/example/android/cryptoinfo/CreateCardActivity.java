package com.example.android.cryptoinfo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.android.cryptoinfo.api.ApiService;
import com.example.android.cryptoinfo.model.Item;
import com.example.android.cryptoinfo.model.ItemResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class CreateCardActivity extends AppCompatActivity {
    private   RViewAdapter adapter;
    private  ArrayList<Item> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_card);

        // set layout manager for recycler viwew
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        items = new ArrayList<Item>();
        items.add(new Item(1.23,2.43));
        items.add(new Item(1.23,2.43));
        adapter = new RViewAdapter(items);
        recyclerView.setAdapter(adapter);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://min-api.cryptocompare.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);
        Call<ItemResponse> call = apiService.getAllItems();
        call.enqueue(new Callback<ItemResponse>() {

            @Override
            public void onResponse(Call<ItemResponse> call, Response<ItemResponse> response) {


//                        items = new ArrayList<Item>();
                        items = response.body().getAllItems();
                        if(items == null){
                            Toast.makeText(CreateCardActivity.this,"The error",Toast.LENGTH_LONG).show();
                        }
////                ArrayList<Currency> items = new ArrayList<>();
////                items.add(new Currency(CurrencyName.BTC,1.23));
////                items.add(new Currency(CurrencyName.ETH,1.23));
////                items.add(new Currency(CurrencyName.AUD,0.08));
//                        adapter = new RViewAdapter(items);
//                        recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<ItemResponse> call, Throwable t) {
                Toast.makeText(CreateCardActivity.this, "Connection Failed", Toast.LENGTH_SHORT).show();
            }
        });


//        ArrayList<Currency> currency = new ArrayList<Currency>();
//        currency.add(new Currency(CurrencyName.BTC,1.23));
//        currency.add(new Currency(CurrencyName.ETH,1.23));
//        currency.add(new Currency(CurrencyName.AUD,0.08));
//
//        RViewAdapter adapter = new RViewAdapter(currency);
//        recyclerView.setAdapter(adapter);

    }



}
