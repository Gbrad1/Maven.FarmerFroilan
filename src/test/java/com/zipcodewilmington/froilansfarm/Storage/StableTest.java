package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StableTest {

    @Test
    public void constructor1Test() {
        Stable s = new Stable();
        Assert.assertEquals(0, s.getNumOfHorse());
        Assert.assertNull(s.removeHorse("Bullet"));
    }

    @Test
    public void constructor2Test() {
        Stable s;
        ArrayList<Horse> horseArrayL = new ArrayList<>();
        Horse horse1 = new Horse("Bullet", "Black", 2);
        Horse horse2 = new Horse("Epona", "Brown", 3);
        horseArrayL.add(horse1);
        horseArrayL.add(horse2);
        s = new Stable(horseArrayL);

        Assert.assertEquals(2, s.getNumOfHorse());
        Assert.assertEquals(horse1, s.getHorse("Bullet"));
        Assert.assertEquals(horse2, s.getHorse("Epona"));
    }

    @Test
    public void addHorseTest() {
        Stable s = new Stable();
        Horse horse1 = new Horse("Bullet", "Black", 2);
        Horse horse2 = new Horse("Epona", "Brown", 3);
        s.addHorse(horse1);
        s.addHorse(horse2);

        Assert.assertEquals(2, s.getNumOfHorse());
        Assert.assertEquals(horse1, s.getHorse("Bullet"));
        Assert.assertEquals(horse2, s.getHorse("Epona"));
    }

    @Test
    public void removeHorseTest() {
        Stable s = new Stable();
        Horse horse1 = new Horse("Bullet", "Black", 2);
        Horse horse2 = new Horse("Epona", "Brown", 3);
        s.addHorse(horse1);
        s.addHorse(horse2);
        Horse removedHorse = s.removeHorse("Bullet");

        Assert.assertEquals(1, s.getNumOfHorse());
        Assert.assertNull(s.getHorse("Bullet"));
        Assert.assertEquals(horse2, s.getHorse("Epona"));
        Assert.assertEquals(horse1, removedHorse);
    }

    @Test
    public void cleanStableNoHorseTest() {
        Stable s = new Stable();
        s.cleanUpStable();
        Assert.assertTrue(s.checkIfClean());
    }

    @Test
    public void cleanDirtyStableNoHorseTest() {
        Stable s = new Stable();
        s.getsDirty();
        Assert.assertFalse(s.checkIfClean());
        s.cleanUpStable();
        Assert.assertTrue(s.checkIfClean());
    }


    @Test
    public void cleanStableWithHorseStillInThereTest() {
        Stable s = new Stable();
        s.getsDirty();
        Horse horse1 = new Horse("Bullet", "Black", 2);
        Horse horse2 = new Horse("Epona", "Brown", 3);
        s.addHorse(horse1);
        s.addHorse(horse2);

        s.cleanUpStable();
        Assert.assertFalse(s.checkIfClean());
    }

    @Test
    public void getHorseNameListTest() {
        Stable s = new Stable();
        Horse horse1 = new Horse("Bullet", "Black", 2);
        Horse horse2 = new Horse("Epona", "Brown", 3);
        s.addHorse(horse1);
        s.addHorse(horse2);
        String expected = "Bullet\nEpona\n";
        Assert.assertEquals(expected, s.getListOfHorseName());
    }

    @Test
    public void removeLastHorseTest() {
        Stable s = new Stable();
        Horse horse1 = new Horse("Bullet", "Black", 2);
        s.addHorse(horse1);
        s.removeLastHorse();
        int actual = s.getNumOfHorse();
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}
