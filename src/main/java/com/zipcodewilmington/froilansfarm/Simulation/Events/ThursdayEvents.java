package com.zipcodewilmington.froilansfarm.Simulation.Events;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.Tomato;
import com.zipcodewilmington.froilansfarm.Produce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

import java.util.ArrayList;

public class ThursdayEvents implements Events{
    public void run(Farm farm){

        Farmer f = (Farmer) farm.getFarmHouse().getPerson("Froilan");
        c.printlnWait(f.getName()+" feel a little hungry.");
        f.eat(new Tomato(), farm.getFoodStorage());
        c.printlnWait(f.getName()+" eats a tomato from the fridge.");

        Field field = farm.getFields().get(0);
        CropRow newCropRow = field.getCropRow(1);
        Tractor tractor = (Tractor) farm.getVehicles().get(0);
        c.printlnWait(f.getName()+" hops on a tractor.");
        tractor.setGasLevel(100);
        ArrayList<Crop> harvestedCrops;
        harvestedCrops = tractor.harvestCrops(newCropRow);

        int counter= 0;
        for(Crop c : harvestedCrops){
            counter++;
        }
        c.printlnWait(f.getName()+" harvested the second crop row in the field, there are "+counter+" tomatoes.");
        farm.getFoodStorage().updateFoodCount("Tomato",new TomatoPlant(), counter+farm.getFoodStorage().getFoodCount("Tomato"));
        c.printlnWait(f.getName()+" stored "+counter +" tomatoes into the fridge.");
        c.printlnWait("Now fridge has "+farm.getFoodStorage().getFoodCount("Tomato")+" tomatoes");

    }

}
