package com.zipcodewilmington.froilansfarm.Simulation.Events;
import com.zipcodewilmington.froilansfarm.Person.Botanist;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicle;

public class MondayEvents implements Events{
    Person froilanda;

    public void run(Farm farm) {
        createFroilanda(farm);

        //things happens ONLY on Monday will start here
        c.printlnWait(froilanda.getName() + " gets into the Crop Duster.");
        FarmVehicle cropDuster = farm.getVehicles().get(1);
        CropDuster temp = (CropDuster)cropDuster;
        temp.fertilizeCrops(farm.getFields().get(0), 5);
        c.printlnWait(froilanda.getName() + " fertilizes " + farm.getFields().size() + " field"+
                " which consisted of " + farm.getFields().get(0).getFieldSize() +
                " rows.");
    }

    public Person createFroilanda(Farm farm) {
        return froilanda = (Botanist)farm.getFarmHouse().getPerson("Froilanda");
    }

}
