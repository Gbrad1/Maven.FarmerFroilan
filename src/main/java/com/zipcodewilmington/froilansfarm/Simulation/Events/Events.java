package com.zipcodewilmington.froilansfarm.Simulation.Events;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Console;
import com.zipcodewilmington.froilansfarm.Person.Botanist;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Produce.EarOfCorn;
import com.zipcodewilmington.froilansfarm.Produce.Egg;
import com.zipcodewilmington.froilansfarm.Produce.Tomato;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.FoodStorage;
import com.zipcodewilmington.froilansfarm.Storage.Stable;

import java.util.ArrayList;

public interface Events {

    Console c = new Console(System.out);

    void run(Farm farm);

    static Farmer getMC(Farm farm){
        return (Farmer)farm.getFarmHouse().getPerson("Froilan");
    }

    static Botanist getMC2(Farm farm){
        return (Botanist)farm.getFarmHouse().getPerson("Froilanda");
    }

    static void everyMorning( Farm farm ){
        //thing that will happen every morning
        c.printlnWait("The early birds are chirping.");
        mcEats(getMC2(farm), 2, 1, 2, farm.getFoodStorage());
        mcEats(getMC(farm), 1, 2, 5, farm.getFoodStorage());
        rideEveryHorse(farm);
    }

    static void rideEveryHorse(Farm farm){
        StringBuilder horses = new StringBuilder();
        ArrayList<Stable> stables = farm.getStables();
        for(Stable s : stables){
            for(Horse h : s.getHorses()){
                getMC(farm).tame(h);
                getMC(farm).mount(h);
                h.gallop();
                getMC(farm).dismount(h);
                h.eat(new EarOfCorn(), farm.getAnimalFoodStorage());
                h.eat(new EarOfCorn(), farm.getAnimalFoodStorage());
                h.eat(new EarOfCorn(), farm.getAnimalFoodStorage());
                horses.append(h.getName()).append(", ");
            }
        }
        String horseNames = horses.substring(0,horses.length()-2);
        c.printlnWait(getMC(farm).getName()+" took out "+horseNames+" from the stable and ride them.");
        c.printlnWait("Each horse eat 3 corn, now the silo has "+farm.getAnimalFoodStorage().getFoodCount("EarOfCorn")+" more corn");
        c.printlnWait("The morning tasks are done!");

    }

    static void mcEats(Person p, int numOfCorn, int numOfTom, int numOfEgg, FoodStorage fridge){
        for(int i=0; i<numOfCorn; i++)
            p.eat(new EarOfCorn(), fridge);
        for(int i=0; i<numOfTom; i++)
            p.eat(new Tomato(), fridge);
        for(int i=0; i<numOfEgg; i++)
            p.eat(new Egg(), fridge);
        c.printlnWait(p.getName()+" eat some breakfast, now the storage have "+
                fridge.getFoodCount("EarOfCorn") + " more corns, "+
                fridge.getFoodCount("Tomato") +" more tomatoes, and "+
                fridge.getFoodCount("Egg") +" more eggs");
    }


    static void everyNight( Farm farm ) {
        //thing that will happen every night
        Person mc = getMC(farm);
        c.printlnWait("Now we can call it a day!");
        c.printlnWait("The moon is out! " + mc.getName() + " shouts to the sky: DO YOUR UNIT TESTS!!!!");
        c.printlnWait("And the day ends");

    }
}
