package com.example.ryanforgie.java_music_exchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryanforgie on 10/09/2017.
 */
public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Accessory drumsticks;

    @Before
    public void before(){
        shop = new Shop("Ryan's Records");
        guitar = new Guitar(6, "Gibson", "Black", "Wood", 80.00, 100.00, Family.STRINGS);
        piano = new Piano(20, "Steinway", "Wood", "Brown", 150.00, 200.00, Family.KEYBOARD);
        drumsticks = new Accessory("Drumsticks", 10.00, 15.00);
    }

    @Test
    public void shopHasName() {
        assertEquals("Ryan's Records", shop.getName());
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(true, shop.getStock().isEmpty());
    }

    @Test
    public void addItemToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void removeItemFromStock() {
        shop.addToStock(guitar);
        shop.removeItem(guitar);
        assertEquals(true, shop.getStock().isEmpty());
    }

    @Test
    public void checkCorrectItemRemoved() {
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.removeItem(guitar);
        assertEquals(piano, shop.getStock().get(0));
    }

    @Test
    public void totalPotentialProfit() {
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.addToStock(drumsticks);
        assertEquals(75.00, shop.calculatePotentialProfit(), 1e-6);
    }


}