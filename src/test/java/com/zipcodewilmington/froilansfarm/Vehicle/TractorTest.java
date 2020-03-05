package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.logging.Logger;

public class TractorTest {

    private static final Logger LOGGER = Logger.getLogger(TractorTest.class.getName());


    @Test
    public void harvestCropTest() throws Exception {

        ArrayList<Crop> actual;

        Tractor newTractor = new Tractor();
        CropRow newRow = new CropRow();
        newRow.addSeeds(new TomatoPlant());
        newRow.addSeeds(new CornStalk());
        newRow.addSeeds(new TomatoPlant());
        newRow.addSeeds(new CornStalk());

         actual = newTractor.harvestCrops(newRow);

        Integer expected = 4;
        Integer actualNum = actual.size();

        Assert.assertEquals(expected,actualNum);
        for (Crop c: actual) {
            LOGGER.info("Gas is now "+newTractor.getGasLevel()); c.getClass().getSimpleName();
        }
    }

    @Test
    public void makeNoiseTest() {

        Tractor tractor = new Tractor();
        String expected = tractor.makeNoise();
        String actual = "Vroom Vroom";
        Assert.assertEquals(expected,actual);

        LOGGER.info(tractor.makeNoise());
    }
}
