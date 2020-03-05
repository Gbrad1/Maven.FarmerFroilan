package com.zipcodewilmington.froilansfarm.Simulation;

import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.StrangePlant;
import com.zipcodewilmington.froilansfarm.Simulation.Events.MondayEvents;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Farm;
import com.zipcodewilmington.froilansfarm.Storage.Field;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicle;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.logging.Logger;

public class MondayEventsTest {

    private static final Logger LOGGER = Logger.getLogger(MondayEventsTest.class.getName());


    Farm farm = Simulation.setUpScenario();
    MondayEvents monday = new MondayEvents();
    StrangePlant newStrangePlant;
    CropRow newCropRow;

    @Test
    public void checkCreationOfFroilandaTest() {
        Person newPerson = monday.createFroilanda(farm);
        farm.getFarmHouse().addPerson(newPerson);
        Person person = farm.getFarmHouse().getListOfPeople().get(1);

        String expectedName = "Froilanda";
        String actualName = farm.getFarmHouse().getListOfPeople().get(1).getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void checkIfPlantsAreFertilized() {
        FarmVehicle cropDuster = new CropDuster();
        CropDuster temp = (CropDuster)cropDuster;
        ArrayList<Crop> plantsToCheckIfFertilized = new ArrayList<>();

        Field newField = new Field();

        for (int i = 0; i < 5; i++) {
            newCropRow = new CropRow();
            for (int j = 0; j < 10; j++) {
                newStrangePlant = new StrangePlant();
                newCropRow.addSeeds(newStrangePlant);
            }
            newField.addCropRow(newCropRow);
        }

        temp.fertilizeCrops(newField, 5);

        for (int i = 0; i < newField.getFieldSize(); i++) {
            newField.getCropRow(i);
            for (int j = 0; j < newField.getCropRow(i).getCropRowSize(); j++) {
                temp.fertilizeCrops(newField, newField.getCropRow(i).getCropRowSize());
            }
        }

        for (int i = 0; i < newCropRow.getCrops().size(); i++) {
            LOGGER.info("\n" + newCropRow.getCrops().get(i).checkIfFertilized());
        }

        Assert.assertTrue(newCropRow.getCrops().get(0).checkIfFertilized());
    }
}
