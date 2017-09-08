package com.example.ryanforgie.java_music_exchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryanforgie on 08/09/2017.
 */
public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(6, "Black", "Wood", 80.00, 100.00);
    }

    @Test
    public void guitarHasStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void guitarInheritsFromInstrument() {
        assertEquals("Black", guitar.getColour());
        assertEquals("Wood", guitar.getMaterial());
        assertEquals(80.00, guitar.getBuyPrice(), 1e-6);
        assertEquals(100.00, guitar.getSellPrice(), 1e-6);
    }

    @Test
    public void guitarPlays() {
        assertEquals("Strum strum", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(25.00, guitar.calculateMarkup(), 1e-6);
    }
}