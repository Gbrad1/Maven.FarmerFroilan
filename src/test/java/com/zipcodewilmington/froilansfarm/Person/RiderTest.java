package com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import org.junit.Assert;
import org.junit.Test;

public class RiderTest {

    @Test
    public void checkRidingTest() {
        Rider someRider = new Farmer("Bill", 47, "Male");
        Assert.assertFalse(someRider.isRiding);
    }

    @Test
    public void mountSuccessTest() {
        Farmer someRider = new Farmer("Bill", 47, "Male");
        Horse someRideable = new Horse("Max", "White", 2);
        someRider.tame(someRideable);
        boolean actual = someRider.mount(someRideable);
        Assert.assertTrue(actual);

    }

    @Test
    public void mountFailedTest() {
        Rider someRider = new Farmer("Bill", 47, "Male");
        Rider someRider2 = new Farmer("Will", 33, "Male");
        Rideable someRideable = new Horse("Max", "White", 2);
        someRider.mount(someRideable);

        boolean actual = someRider2.mount(someRideable);
        Assert.assertFalse(actual);

    }

    @Test
    public void dismountSuccessTest() {
        Farmer someRider = new Farmer("Bill", 47, "Male");
        Horse someRideable = new Horse("Max", "White", 2);
        someRider.tame(someRideable);
        someRider.mount(someRideable);
        boolean actual = someRider.dismount(someRideable);
        Assert.assertTrue(actual);

    }

    @Test
    public void dismountFailedTest() {
        Rider someRider = new Farmer("Bill", 47, "Male");
        Rideable someRideable = new Horse("Max", "White", 2);
        boolean actual = someRider.dismount(someRideable);
        Assert.assertFalse(actual);
    }
}

