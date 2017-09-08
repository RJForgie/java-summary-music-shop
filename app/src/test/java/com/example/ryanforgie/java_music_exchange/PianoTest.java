package com.example.ryanforgie.java_music_exchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryanforgie on 08/09/2017.
 */
public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(20, "Wood", "Brown", 150.00, 200.00);
    }

    @Test
    public void pianoHasStrings(){
        assertEquals(20, piano.getNumberOfKeys());
    }
}