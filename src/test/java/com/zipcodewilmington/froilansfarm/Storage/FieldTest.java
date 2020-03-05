package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class FieldTest {
    private static final Logger LOGGER = Logger.getLogger(FieldTest.class.getName());
    Field currentField = new Field();
    CropRow currentCropRow = new CropRow();
    CropRow anotherCropRow = new CropRow();
    Crop currentTomatoPlant = new TomatoPlant();
    Crop currentCornStalk = new CornStalk();

    @Test
    public void fieldConstructorTest() {
        currentCropRow.addSeeds(currentCornStalk);
        currentField.addCropRow(currentCropRow);

        Integer expectedFieldSize = 1;
        Integer actualFieldRowSize = currentField.field.size();

        Assert.assertEquals(expectedFieldSize, actualFieldRowSize);
    }

    @Test
    public void addCropRowTest() {
        currentCropRow.addSeeds(currentCornStalk);
        currentField.addCropRow(currentCropRow);
        anotherCropRow.addSeeds(currentTomatoPlant);
        currentField.addCropRow(anotherCropRow);

        Integer expectedFieldSize = 2;
        Integer actualFieldRowSize = currentField.field.size();

        Assert.assertEquals(expectedFieldSize, actualFieldRowSize);
    }

    @Test
    public void getCropRowTest() {
        currentCropRow.addSeeds(currentCornStalk);
        anotherCropRow.addSeeds(currentTomatoPlant);
        currentField.addCropRow(currentCropRow);
        currentField.addCropRow(anotherCropRow);

        currentField.getCropRow(1);

        Assert.assertFalse(currentField.field.isEmpty());
    }

    @Test
    public void getFieldSizeTest() {
        Integer actual = currentField.getFieldSize();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);
    }
}

