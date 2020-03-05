package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.logging.Logger;


public class FarmHouseTest {

    private static final Logger LOGGER = Logger.getLogger(FarmHouseTest.class.getName());
    FarmHouse currentFarmHouse = new FarmHouse();
    Farmer cfarmer = new Farmer("Chris Farmer", 28, "Male");
    Farmer gbradford = new Farmer("Giles Bradford", 24, "Male");

    @Test
    public void farmHouseConstructorTest() {
        Integer actualLength = currentFarmHouse.getListOfPeople().size();
        Integer expectedLength = 0;

        Assert.assertEquals(expectedLength, actualLength);
    }

    @Test
    public void addPersonTest() {
        currentFarmHouse.addPerson(cfarmer);
        currentFarmHouse.addPerson(gbradford);
        Integer expectedLength = 2;
        Integer actualLength = currentFarmHouse.getListOfPeople().size();

        Assert.assertEquals(expectedLength, actualLength);
    }

    @Test
    public void getPersonTest() {
        currentFarmHouse.addPerson(cfarmer);
        String actualName = currentFarmHouse.getPerson("Chris Farmer").getName();
        String expectedName = "Chris Farmer";
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getPersonNullTest() {
        Assert.assertNull( currentFarmHouse.getPerson("aslkdjals") );
    }

    @Test
    public void removePersonTest() {
        currentFarmHouse.addPerson(cfarmer);
        currentFarmHouse.removePerson("Chris Farmer");
        Integer actualSize = currentFarmHouse.listOfPeople.size();
        Integer expectedSize = 0;

        Assert.assertEquals(expectedSize, actualSize);
    }
}
