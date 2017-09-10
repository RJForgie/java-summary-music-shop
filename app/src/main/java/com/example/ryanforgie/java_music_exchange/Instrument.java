package com.example.ryanforgie.java_music_exchange;

/**
 * Created by ryanforgie on 08/09/2017.
 */

public abstract class Instrument {

    private String brand;
    private String colour;
    private String material;
    private double buyPrice;
    private double sellPrice;
    private Family family;

    public Instrument( String brand, String colour, String material, double buyPrice, double sellPrice, Family family) {
        this.brand = brand;
        this.colour = colour;
        this.material = material;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.family = family;
    }


    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getBrand() {
        return brand;
    }

    public Family getFamily() {
        return family;
    }
}
