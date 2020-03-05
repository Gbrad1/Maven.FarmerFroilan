package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Egg;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    @Test
    public void isHappyTest() {
        Horse horse1 = new Horse();
        horse1.isHappy();
        Assert.assertTrue(horse1.isHappy());
    }
}
