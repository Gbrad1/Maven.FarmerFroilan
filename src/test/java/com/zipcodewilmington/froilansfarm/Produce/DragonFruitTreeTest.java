package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Storage.FarmHouseTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class DragonFruitTreeTest {

    private static final Logger LOGGER = Logger.getLogger(FarmHouseTest.class.getName());

    DragonFruitTree currentDragonFruitTree = new DragonFruitTree();
    DragonFruit currentDragonFruit = new DragonFruit();
    DragonFruit anotherDragonFruit = new DragonFruit();

    @Test
    public void strangePlantConstructorTest() {
        currentDragonFruitTree.addFruit(currentDragonFruit);
        Integer expectedAmountOfFruitOnPlant = 1;
        Integer actualAmountOfFruit = currentDragonFruitTree.plantWithFruit.size();
        Assert.assertEquals(expectedAmountOfFruitOnPlant, actualAmountOfFruit);
    }

    @Test
    public void addFruitToPlantTest() {
        currentDragonFruitTree.addFruit(currentDragonFruit);
        currentDragonFruitTree.addFruit(anotherDragonFruit);
        Integer expectedAmountOfFruitOnPlant = 2;
        Integer actualAmountOfFruit = currentDragonFruitTree.plantWithFruit.size();
        Assert.assertEquals(expectedAmountOfFruitOnPlant, actualAmountOfFruit);
    }

    @Test
    public void removeFruit() {
        currentDragonFruitTree.addFruit((currentDragonFruit));
        currentDragonFruitTree.addFruit((anotherDragonFruit));
        currentDragonFruitTree.removeFruit(currentDragonFruit);
        Integer expectedAmountOfFruitOnPlant = 1;
        Integer actualAmountOfFruit = currentDragonFruitTree.plantWithFruit.size();

        Assert.assertEquals(expectedAmountOfFruitOnPlant, actualAmountOfFruit);
    }

}
