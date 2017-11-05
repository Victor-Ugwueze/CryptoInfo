package com.example.android.cryptoinfo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GOZMAN VICTOR on 11/5/2017.
 */

public class ItemResponse {

    private ArrayList<Item> items;
    public ArrayList<Item> getAllItems(){
        return items;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
}
