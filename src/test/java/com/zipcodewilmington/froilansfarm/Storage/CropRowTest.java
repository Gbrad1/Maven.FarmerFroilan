package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class CropRowTest {
    private static final Logger LOGGER = Logger.getLogger(CropRowTest.class.getName());

    CropRow currentCropRow = new CropRow();
    Crop cornStalk = new CornStalk();

    @Test
    public void cropRowConstructorTest() {
        Integer actualCropRowSize = currentCropRow.crops.size();
        Integer expectedCropRowSize = 0;
        Assert.assertEquals(expectedCropRowSize, actualCropRowSize);
    }

    @Test
    public void addSeedsTest() {
        currentCropRow.addSeeds(cornStalk);
        Integer cropRowSize = currentCropRow.crops.size();
        Integer expectedSize = 1;

        Assert.assertEquals(expectedSize, cropRowSize);
    }

    @Test
    public void clearCropRow() {
        currentCropRow.addSeeds(cornStalk);
        currentCropRow.removeCrops();

        Assert.assertTrue(currentCropRow.crops.isEmpty());
    }

    @Test
    public void getCropRowSizeTest() {
        Integer actualSize = currentCropRow.getCropRowSize();
        Integer expectedSize = 0;
        Assert.assertEquals(expectedSize, actualSize);
    }
}
