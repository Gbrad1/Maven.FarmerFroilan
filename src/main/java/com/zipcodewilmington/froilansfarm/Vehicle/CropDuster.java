package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.Flyable;
import com.zipcodewilmington.froilansfarm.Storage.Field;

import java.util.logging.Logger;


public class CropDuster extends FarmVehicle implements Flyable {
    private static final Logger LOGGER = Logger.getLogger(CropDuster.class.getName());

    Integer fertilizerAmount = 5000;

    public CropDuster(Integer id, String color) {
        super(id, color);
    }

    public CropDuster() {super();}

    public Boolean hasFertilizer() {
        if (fertilizerAmount < 1) {
            LOGGER.info("\nYou are out of fertilizer. Please refill.");
            return false;
        }
        return true;
    }

    public void fertilizeCrops(Field newField, Integer amtOfRows) {
        //fly();
        newField.getFieldSize();
        for (int i = 0; i < newField.getFieldSize(); i++) {
            for (int j = 0; j < newField.getCropRow(i).getCropRowSize(); j++) {
                newField.getCropRow(i).getCrops().get(j).setFertilized(true);
            }
        }
//        for (int i = 0; i < amtOfRows; i++) {
//            setGasLevel(getGasLevel() - 1);
//            setFertilizerAmount(getFertilizerAmount() - 1);
//
//        }
    }

    public Integer getFertilizerAmount() {

        if (fertilizerAmount < 1) {
            System.out.println("Out of fertilizer. You are fertilizing nothing now.");
        } else {
            return fertilizerAmount;
        }
        return fertilizerAmount;
    }

    public void setFertilizerAmount(Integer fertilizer) {
        this.fertilizerAmount = fertilizer;
    }

    public void refillFertilizer() {
        setFertilizerAmount(8);
    }

    @Override
    public void fly() {
        setGasLevel(getGasLevel() - 1);
    }

    @Override
    public String makeNoise() {
        return "puh puh puh";
    }
}
