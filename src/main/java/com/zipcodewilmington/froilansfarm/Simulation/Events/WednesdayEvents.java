package com.zipcodewilmington.froilansfarm.Simulation.Events;
import com.zipcodewilmington.froilansfarm.Person.Botanist;
import com.zipcodewilmington.froilansfarm.Produce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;

public class WednesdayEvents implements Events{
    public void run(Farm farm){
        Botanist froilanda = (Botanist)farm.getFarmHouse().getPerson("Froilanda");
        c.printlnWait(froilanda.getName()+" is feeling a little lazy today.");
        c.printlnWait("She planted a few tomatoes");
        Field field = farm.getFields().get(0);
        CropRow newCropRow = field.getCropRow(1);
        froilanda.plant(new TomatoPlant(), newCropRow);
        froilanda.plant(new TomatoPlant(), newCropRow);
        froilanda.plant(new TomatoPlant(), newCropRow);
        froilanda.plant(new TomatoPlant(), newCropRow);
        froilanda.plant(new TomatoPlant(), newCropRow);
    }
}
