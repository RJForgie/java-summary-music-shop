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

    @Before
    public void before(){
        shop = new Shop("Ryan's Records");
        guitar = new Guitar(6, "Black", "Wood", 80.00, 100.00);
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
        shop.removeItem(0);
        assertEquals(true, shop.getStock().isEmpty());
    }

}