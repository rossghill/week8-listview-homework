package com.example.rosshill.beerslistviewhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rosshill on 23/01/2018.
 */

public class BeerTest {

    Beer beer;

    @Before
    public void before() {
        beer = new Beer(1, "Belhaven Best");
    }

    @Test
    public void getNameTest() {
        assertEquals("Belhaven Best", beer.getName());
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)1, beer.getRanking());
    }
}
