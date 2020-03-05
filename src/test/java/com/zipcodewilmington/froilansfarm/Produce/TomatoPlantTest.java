package com.zipcodewilmington.froilansfarm.Produce;

import org.junit.Assert;
import org.junit.Test;


public class TomatoPlantTest {

    TomatoPlant currentTomatoPlant = new TomatoPlant();
    Tomato currentTomato = new Tomato();
    Tomato anotherTomato = new Tomato();

    @Test
    public void TomatoPlantConstructorTest() {
        currentTomatoPlant.addFruit(currentTomato);
        Integer expected = 1;
        Integer actual = currentTomatoPlant.tomatoPlantWithFruit.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTomatoToPlantTest() {
        currentTomatoPlant.addFruit(currentTomato);
        currentTomatoPlant.addFruit(anotherTomato);
        Integer expectedAmountOfFruitOnPlant = 2;
        Integer actualAmountOfFruit = currentTomatoPlant.tomatoPlantWithFruit.size();
        Assert.assertEquals(expectedAmountOfFruitOnPlant, actualAmountOfFruit);
    }

    @Test
    public void removeTomato() {
        currentTomatoPlant.addFruit((currentTomato));
        currentTomatoPlant.addFruit((anotherTomato));
        currentTomatoPlant.removeFruit(currentTomato);
        Integer expected = 1;
        Integer actual = currentTomatoPlant.tomatoPlantWithFruit.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void YieldTomatoTest() {
        Crop tomato3 = new TomatoPlant();
        Edible expected = tomato3.yield();
        Assert.assertTrue(expected instanceof Tomato);
    }
}