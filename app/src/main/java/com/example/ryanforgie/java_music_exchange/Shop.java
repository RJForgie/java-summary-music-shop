package com.example.ryanforgie.java_music_exchange;

import java.util.ArrayList;

/**
 * Created by ryanforgie on 08/09/2017.
 */

public class Shop {

    private String name;
    private ArrayList<Sellable> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Sellable> getStock() {
        return stock;
    }

    public void addToStock(Sellable item) {
        this.stock.add(item);
    }

    public void removeItem(int index) {
        this.getStock().remove(index);
    }
}
