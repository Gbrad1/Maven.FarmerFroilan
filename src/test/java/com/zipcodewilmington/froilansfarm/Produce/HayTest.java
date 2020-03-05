package com.zipcodewilmington.froilansfarm.Produce;

import org.junit.Assert;
import org.junit.Test;

public class HayTest {

    @Test
    public void hayConstructTest(){
        Edible someFood = new Hay();
        Assert.assertEquals("Hay Flavor",someFood.getFlavor());
        Assert.assertEquals(0.2,someFood.getQuality(),0.01);
    }
}
