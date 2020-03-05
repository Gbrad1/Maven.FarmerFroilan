package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class BotanistTest {

    @Test

    public void botanistConstructorTest () {
        Botanist botanist = new Botanist("Jim", 57, "Male");
        String expectedName = "Jim";
        String actualName = botanist.getName();
        Integer expectedAge = 57;
        Integer actualAge = botanist.getAge();
        String expectedGender = "Male";
        String actualGender = botanist.getGender();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedGender, actualGender);
    }

        @Test
    public void plantTest() {
        Botanist botanist = new Botanist("Sarah", 24, "Female");
        CropRow cropRow = new CropRow();
        Crop crop1 = new TomatoPlant();
        botanist.plant(crop1, cropRow);
        Assert.assertEquals( 1, (int) cropRow.getCropRowSize());

    }
}
