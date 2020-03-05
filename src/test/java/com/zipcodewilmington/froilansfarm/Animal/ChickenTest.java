package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Egg;
import com.zipcodewilmington.froilansfarm.Storage.FoodStorage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ChickenTest {
    @Test
    public void testGender(){
        //given
        Chicken mickey = new Chicken();
        //when
        mickey.setGender("male");
        String expected = "male";
        String actual = mickey.getGender();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testYield(){
        Chicken mickey = new Chicken();
        Assert.assertTrue( mickey.yield() instanceof Egg);
    }

    @Test
    public void testEat(){
        Chicken mickey = new Chicken();
        FoodStorage feed = new FoodStorage();
        ArrayList<Edible> corns = new ArrayList<>();
        corns.add(new EarOfCorn());
        corns.add(new EarOfCorn());
        corns.add(new EarOfCorn());
        feed.addFoodSet("EarOfCorn", corns);
        mickey.eat(new EarOfCorn(), feed);

        Assert.assertEquals(2,feed.getFoodCount("EarOfCorn"));
    }

}
