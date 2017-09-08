package com.example.ryanforgie.java_music_exchange;

/**
 * Created by ryanforgie on 08/09/2017.
 */

public class Piano extends Instrument implements Playable{

    private int numberOfKeys;


    public Piano(int numberOfKeys, String colour, String material, Double buyPrice, Double sellPrice) {
        super(colour, material, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "Plink plonk";
    }


}