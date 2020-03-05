package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test

    public void fertilizerTest() throws Exception {
        Farmer farmer = new Farmer("Dave", 33, "Male");
        CropDuster cropduster = new CropDuster(1, "Blue");
        farmer.fillFertilizer(cropduster);
        int expected = 8;
        int actual = cropduster.getFertilizerAmount();
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void farmerConstructorTest() {
        Farmer farmer = new Farmer("Dave", 33, "Male");
        String expectedName = "Dave";
        String actualName = farmer.getName();
        Integer expectedAge = 33;
        Integer actualAge = farmer.getAge();
        String expectedGender = "Male";
        String actualGender = farmer.getGender();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedGender, actualGender);

    }

    @Test
    public void tameTest () {
        Farmer farmer = new Farmer("Dave", 33, "Male");
        Horse horse = new Horse ();
        farmer.tame(horse);
        Assert.assertTrue(horse.isDocile());
    }

}