package com.zipcodewilmington.froilansfarm.Produce;

import org.junit.Assert;
import org.junit.Test;

public class EarOfCornTest {

    @Test
    public void cornDefaultConstructTest(){
        Edible someFood = new EarOfCorn();
        Assert.assertEquals("sweet",someFood.getFlavor());
        Assert.assertEquals(0.5,someFood.getQuality(),0.01);
    }

    @Test
    public void cornConstructWithQualityTest(){
        Edible someFood = new EarOfCorn(0.9);
        Assert.assertEquals("sweet",someFood.getFlavor());
        Assert.assertEquals(0.9,someFood.getQuality(),0.01);
    }
}
