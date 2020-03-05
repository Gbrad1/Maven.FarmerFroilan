package com.zipcodewilmington.froilansfarm.Produce;

import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {

    CornStalk currentCornStalk = new CornStalk();
    EarOfCorn currentEarOfCorn = new EarOfCorn();
    EarOfCorn anotherEarOfCorn = new EarOfCorn();

    @Test
    public void CornStalkConstructorTest() {
        currentCornStalk.addFruit(currentEarOfCorn);
        Integer expected = 1;
        Integer actual = currentCornStalk.cornStalkWithCorn.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AddCornToStalkTest() {
        currentCornStalk.addFruit(currentEarOfCorn);
        currentCornStalk.addFruit(anotherEarOfCorn);
        Integer expectedAmountOfFruitOnPlant = 2;
        Integer actualAmountOfFruit = currentCornStalk.cornStalkWithCorn.size();
        Assert.assertEquals(expectedAmountOfFruitOnPlant, actualAmountOfFruit);
    }

    @Test
    public void RemoveEarOfCornTest() {
        currentCornStalk.addFruit((currentEarOfCorn));
        currentCornStalk.addFruit((anotherEarOfCorn));
        currentCornStalk.removeFruit(currentEarOfCorn);
        Integer expected = 1;
        Integer actual = currentCornStalk.cornStalkWithCorn.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void YieldCornTest() {
        Crop corn3 = new CornStalk();
        Edible expected = corn3.yield();
        Assert.assertTrue (expected instanceof EarOfCorn);
    }
}
