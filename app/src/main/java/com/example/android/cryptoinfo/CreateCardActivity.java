package com.example.android.cryptoinfo;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.cryptoinfo.api.ApiService;
import com.example.android.cryptoinfo.model.CryptoCurrency;
import java.util.ArrayList;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class CreateCardActivity extends AppCompatActivity {
    ArrayList<String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_card);
            Intent createCardIntent = getIntent();
            final String btc = createCardIntent.getStringExtra("btc_true");
        // set layout manager for recycler viwew
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

         items = new ArrayList<String>();
        final RViewAdapter adapter = new RViewAdapter(items);
        recyclerView.setAdapter(adapter);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://min-api.cryptocompare.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
//Start make call to retrofit

        ApiService apiService = retrofit.create(ApiService.class);
        Call<CryptoCurrency> repos = apiService.getCurrency();

        repos.enqueue(new Callback<CryptoCurrency>() {
            @Override
            public void onResponse(Call <CryptoCurrency> call, Response<CryptoCurrency> response) {

               //get the response
                try{
                CryptoCurrency li = response.body();



                // Add get selected cryptoCureency and add to the list
                    if(btc.equals("true")){
                        RViewAdapter.currencyName ="BTC";
                        items.add(li.getBTC().getUSD().toString());
                        items.add(li.getBTC().getEUR().toString());
                        items.add(li.getBTC().getNGN().toString());
                        items.add(li.getBTC().getBRL().toString());
                        items.add(li.getBTC().getCAD().toString());
                        items.add(li.getBTC().getAUD().toString());
                        items.add(li.getBTC().getCHF().toString());

                    }else if(btc.equals("false")){
                        RViewAdapter.currencyName ="ETH";
                        items.add(li.getETH().getUSD().toString());
                        items.add(li.getETH().getEUR().toString());
                        items.add(li.getETH().getNGN().toString());
                    }

                    // Set Adapter for recyclerView and pass Items to display
                    RViewAdapter adapter = new RViewAdapter(items);

                    recyclerView.setAdapter(adapter);
                    Log.d("MainActivity","No of Items : "+items.size());

                }catch (Exception e){
                    Log.d("Got", e.getMessage());
                }



            }

            @Override
            public void onFailure(Call<CryptoCurrency> call, Throwable t) {
                Toast.makeText(CreateCardActivity.this, "Failure", Toast.LENGTH_LONG).show();
            }
        });




    }



}
