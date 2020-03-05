package com.zipcodewilmington.froilansfarm.Animal;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
    @Test
    public void testSetAge(){
        //given
        Horse mickey = new Horse();

        //when
        mickey.setAge(5);
        Integer expected = 5;
        Integer actual = mickey.getAge();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetName(){
        //given
        Horse mickey = new Horse();
        //when
        mickey.setName("Mickey");
        String expected = "Mickey";
        String actual = mickey.getName();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetColor(){
        //given
        Horse mickey = new Horse();
        //when
        mickey.setColor("White");
        String expected = "White";
        String actual = mickey.getColor();
        //then
        Assert.assertEquals(expected, actual);
    }
}
