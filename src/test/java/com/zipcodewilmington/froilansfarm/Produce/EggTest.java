package com.zipcodewilmington.froilansfarm.Produce;

import org.junit.Assert;
import org.junit.Test;

public class EggTest {
    @Test
    public void eggDefaultConstructTest(){
        Egg egg1 = new Egg();
        Assert.assertEquals("eggy",egg1.getFlavor());
        Assert.assertEquals(0.5,egg1.getQuality(),0.01);
        Assert.assertFalse(egg1.isFertile());
    }

    @Test
    public void eggWithDifferentQualityConstructTest(){
        Egg egg1 = new Egg(0.8);
        Assert.assertEquals("eggy",egg1.getFlavor());
        Assert.assertEquals(0.8,egg1.getQuality(),0.01);
        Assert.assertFalse(egg1.isFertile());
    }

    @Test
    public void eggGetIsFertileTest(){
        Egg egg1 = new Egg();
        egg1.isFertile();
        Assert.assertFalse(egg1.isFertile());
    }

}
