package com.zipcodewilmington.froilansfarm.Simulation.Events;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

import java.util.ArrayList;

public class TuesdayEvents implements Events {

    public void run(Farm farm) {
        //things happens ONLY on Tuesday will start here
        //c.printlnWait("Tragic happened on Tuesday...");
        Farmer f = (Farmer)farm.getFarmHouse().getPerson("Froilan");
        Field field = farm.getFields().get(0);
        CropRow newCropRow = field.getCropRow(0);
        Tractor tractor = (Tractor) farm.getVehicles().get(0);
        c.printlnWait(f.getName()+" hops on a tractor.");
        tractor.setGasLevel(100);
        ArrayList<Crop> harvestedCrops;
        harvestedCrops = tractor.harvestCrops(newCropRow);

        int counter= 0;
        for(Crop c : harvestedCrops){
            counter++;
        }
        c.printlnWait(f.getName()+" harvested the first crop row in the field, there are "+counter+" corns.");
        farm.getAnimalFoodStorage().updateFoodCount("EarOfCorn",new CornStalk(), counter+farm.getAnimalFoodStorage().getFoodCount("EarOfCorn"));
        c.printlnWait(f.getName()+" stored "+counter +" corns into silo.");
        c.printlnWait("Now silo has "+farm.getAnimalFoodStorage().getFoodCount("EarOfCorn")+" corn");
    }
}
