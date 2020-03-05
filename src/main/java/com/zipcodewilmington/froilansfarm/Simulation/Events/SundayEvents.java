package com.zipcodewilmington.froilansfarm.Simulation.Events;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Simulation.WeekDay;
import com.zipcodewilmington.froilansfarm.Storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Storage.Farm;

import java.util.ArrayList;

public class SundayEvents implements Events{
    public void run(Farm farm){
        WeekDay.TUE.getWeekDayEvents().run(farm);
        Farmer f = (Farmer) farm.getFarmHouse().getPerson("Froilan");
        ArrayList<Edible> eggs = new ArrayList<>();

        c.printlnWait(f.getName()+" took a big box and went to the chicken coops.");
        for( ChickenCoop cc: farm.getChickenCoops()){
            for(Chicken chickens :cc.getChickens()){
                eggs.add(chickens.yield());
            }
        }
        c.printlnWait(f.getName()+" obtained "+eggs.size()+" eggs from his chicken.");
        farm.getFoodStorage().updateFoodCount("Egg",new TomatoPlant(), eggs.size()+farm.getFoodStorage().getFoodCount("Egg"));
        c.printlnWait("Now fridge has "+farm.getFoodStorage().getFoodCount("Egg")+" eggs.");


    }
}
