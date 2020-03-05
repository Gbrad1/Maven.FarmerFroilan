package com.zipcodewilmington.froilansfarm.Produce;

import org.junit.Assert;
import org.junit.Test;

public class EdibleTest {

    @Test
    public void edibleSetFlavorTest(){
        Edible food = new Tomato();
        String newFlavor = "disgusting";
        food.setFlavor(newFlavor);
        Assert.assertEquals(newFlavor,food.getFlavor());
    }

    @Test
    public void edibleSetQualityTest(){
        Edible food = new EarOfCorn();
        double newQuality = 0.9;
        food.setQuality(newQuality);
        Assert.assertEquals(newQuality,food.getQuality(),0.01);
    }

}
