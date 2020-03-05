package com.zipcodewilmington.froilansfarm.Produce;

import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {
    @Test
    public void tomatoConstructTest(){
        Edible someFood = new Tomato();
        Assert.assertEquals("sour and juicy",someFood.getFlavor());
        Assert.assertEquals(0.5,someFood.getQuality(),0.01);
    }

    @Test
    public void tomatoConstructWithQualityTest(){
        Edible someFood = new Tomato(0.6);
        Assert.assertEquals("sour and juicy",someFood.getFlavor());
        Assert.assertEquals(0.6,someFood.getQuality(),0.01);
    }
}
