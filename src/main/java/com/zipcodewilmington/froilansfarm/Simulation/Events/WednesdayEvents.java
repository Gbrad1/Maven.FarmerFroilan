package com.zipcodewilmington.froilansfarm.Simulation.Events;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Person.Botanist;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Produce.StrangeFruit;
import com.zipcodewilmington.froilansfarm.Produce.StrangePlant;
import com.zipcodewilmington.froilansfarm.Produce.Tomato;
import com.zipcodewilmington.froilansfarm.Produce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;
import com.zipcodewilmington.froilansfarm.Storage.Stable;

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
