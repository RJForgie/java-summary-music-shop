package com.example.ryanforgie.java_music_exchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryanforgie on 08/09/2017.
 */
public class AccessoryTest {

    Accessory drumsticks;

    @Before
    public void before(){
        drumsticks = new Accessory("Drumsticks", 10.00, 15.00);
    }

    @Test
    public void accessoryHasType() {
        assertEquals("Drumsticks", drumsticks.getType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5.00, drumsticks.calculateMarkup(), 1e-6);
    }

}