package com.zipcodewilmington.froilansfarm.Simulation.Events;

import com.zipcodewilmington.froilansfarm.Person.Botanist;
import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;

public class FridayEvents implements Events {
    public void run(Farm farm) {
        Botanist froilan = (Botanist) farm.getFarmHouse().getPerson("Froilan");
        c.printlnWait(froilan.getName()+" is feeling a little lazy today.");
        c.printlnWait("he planted a few corns");
        Field newField = farm.getFields().get(0);
        CropRow newCropRow = newField.getCropRow(0);
        froilan.plant(new CornStalk(), newCropRow);
        froilan.plant(new CornStalk(), newCropRow);
        froilan.plant(new CornStalk(), newCropRow);
        froilan.plant(new CornStalk(), newCropRow);
        froilan.plant(new CornStalk(), newCropRow);

    }

}
