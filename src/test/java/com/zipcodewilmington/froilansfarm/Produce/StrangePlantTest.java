package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Storage.FarmHouseTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class StrangePlantTest {

    private static final Logger LOGGER = Logger.getLogger(FarmHouseTest.class.getName());

    StrangePlant currentStrangePlant = new StrangePlant();
    StrangeFruit currentStrangeFruit = new StrangeFruit();
    StrangeFruit anotherStrangeFruit = new StrangeFruit();

    @Test
    public void strangePlantConstructorTest() {
        currentStrangePlant.addFruit(currentStrangeFruit);
        Integer expectedAmountOfFruitOnPlant = 1;
        Integer actualAmountOfFruit = currentStrangePlant.plantWithFruit.size();
        Assert.assertEquals(expectedAmountOfFruitOnPlant, actualAmountOfFruit);
    }

    @Test
    public void addFruitToPlantTest() {
        currentStrangePlant.addFruit(currentStrangeFruit);
        currentStrangePlant.addFruit(anotherStrangeFruit);
        Integer expectedAmountOfFruitOnPlant = 2;
        Integer actualAmountOfFruit = currentStrangePlant.plantWithFruit.size();
        Assert.assertEquals(expectedAmountOfFruitOnPlant, actualAmountOfFruit);
    }

    @Test
    public void removeFruit() {
        currentStrangePlant.addFruit((currentStrangeFruit));
        currentStrangePlant.addFruit((anotherStrangeFruit));
        currentStrangePlant.removeFruit(currentStrangeFruit);
        Integer expectedAmountOfFruitOnPlant = 1;
        Integer actualAmountOfFruit = currentStrangePlant.plantWithFruit.size();

        Assert.assertEquals(expectedAmountOfFruitOnPlant, actualAmountOfFruit);
    }

}
