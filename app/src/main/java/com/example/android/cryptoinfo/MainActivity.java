package com.example.android.cryptoinfo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button checkOut;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Open new activity to show Crypto currency rates

        checkOut = (Button)findViewById(R.id.create_card);
        checkOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createCardIntent = new Intent(MainActivity.this,CreateCardActivity.class);
                startActivity(createCardIntent);
            }
        });

    }
}
