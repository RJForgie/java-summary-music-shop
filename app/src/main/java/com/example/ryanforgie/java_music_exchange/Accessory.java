package com.example.ryanforgie.java_music_exchange;

/**
 * Created by ryanforgie on 08/09/2017.
 */

public class Accessory implements Sellable {

    private String type;
    private Double buyPrice;
    private Double sellPrice;

    public Accessory( String type, Double buyPrice, Double sellPrice ) {
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getType() {
        return type;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public Double calculateMarkup() {
        return (this.getSellPrice() / this.getBuyPrice() -1) * 100;
    }
}
