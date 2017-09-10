package com.example.ryanforgie.java_music_exchange;

/**
 * Created by ryanforgie on 08/09/2017.
 */

public class Piano extends Instrument implements Playable, Sellable{

    private int numberOfKeys;


    public Piano(int numberOfKeys, String brand, String colour, String material, Double buyPrice, Double sellPrice, Family family) {
        super(brand, colour, material, buyPrice, sellPrice, family);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "Plink plonk";
    }

    public Double calculateMarkup() {
        return this.getSellPrice() - this.getBuyPrice();
    }


}