package com.zipcodewilmington.froilansfarm.Person;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void getNameTest() {
        Person p1 = new Botanist("Max", 15, "Male");
        String expectedName = "Max";
        String actualName = p1.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getAgeTest() {
        Person p1 = new Botanist("Max", 15, "Male");
        Integer expectedAge = 15;
        Integer actualAge = p1.getAge();
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void getGenderTest() {
        Person p1 = new Farmer("Max", 15, "Male");
        String expectedGender = "Male";
        String actualGender = p1.getGender();
        Assert.assertEquals(expectedGender, actualGender);
    }


    @Test
    public void setNameTest() {
        Person baby = new Botanist("New Born", 0, "Male");  //creating a baby
        baby.setName("Lilo");                                                  //changing the baby's name

        Assert.assertEquals("Lilo", baby.getName());

    }

    @Test
    public void setAgeTest() {
        Person babyTwo = new Farmer("", 2, "Male");
        babyTwo.setAge(4);

        Assert.assertEquals(4, babyTwo.getAge());

    }

    @Test
    public void setGenderTest() {
        Person babyThree = new Farmer("", 0, "Male");
        babyThree.setGender("Female");

        Assert.assertEquals("Female", babyThree.getGender());
    }
}