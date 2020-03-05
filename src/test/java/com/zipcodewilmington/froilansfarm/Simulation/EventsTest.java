package com.zipcodewilmington.froilansfarm.Simulation;

import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Person.Botanist;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Simulation.Events.Events;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Stable;
import org.junit.Assert;
import org.junit.Test;

import static com.zipcodewilmington.froilansfarm.Simulation.Events.Events.getMC;
import static com.zipcodewilmington.froilansfarm.Simulation.Events.Events.getMC2;

public class EventsTest {

    Farm farm = Simulation.setUpScenario();

    @Test
    public void getMC1Test(){
        Farmer mc = getMC(farm);
        Assert.assertEquals("Froilan",mc.getName());
        Assert.assertEquals(25,mc.getAge());
        Assert.assertEquals("Male",mc.getGender());
    }

    @Test
    public void getMC2Test(){
        Botanist mc = getMC2(farm);
        Assert.assertEquals("Froilanda",mc.getName());
        Assert.assertEquals(22,mc.getAge());
        Assert.assertEquals("Female",mc.getGender());
    }

    @Test
    public void mcEatTest(){
        Farmer mc = getMC(farm);
        Events.mcEats(mc,1,1,1,farm.getFoodStorage());
        Assert.assertEquals(49,farm.getFoodStorage().getFoodCount("EarOfCorn"));
        Assert.assertEquals(49,farm.getFoodStorage().getFoodCount("Tomato"));
        Assert.assertEquals(49,farm.getFoodStorage().getFoodCount("Egg"));
    }

    @Test
    public void rideEveryHorseTest(){

        for(Stable s :farm.getStables()){
            for( Horse h : s.getHorses()){
                Assert.assertFalse(h.isDocile());
            }
        }
        Events.rideEveryHorse(farm);

        for(Stable s :farm.getStables()){
            for( Horse h : s.getHorses()){
                Assert.assertTrue(h.isDocile());
            }
        }

    }


}
