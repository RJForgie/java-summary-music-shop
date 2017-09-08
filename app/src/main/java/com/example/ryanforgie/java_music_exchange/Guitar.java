package com.example.ryanforgie.java_music_exchange;

/**
 * Created by ryanforgie on 08/09/2017.
 */

public class Guitar extends Instrument implements Playable, Sellable{

    private int numberOfStrings;

    public Guitar(int numberOfStrings, String colour, String material, Double buyPrice, Double sellPrice) {
        super(colour, material, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Strum strum";
    }

    public Double calculateMarkup() {
       return (this.getSellPrice() / this.getBuyPrice() -1) * 100;
    }


}
