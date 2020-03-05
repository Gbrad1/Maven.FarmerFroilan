package com.zipcodewilmington.froilansfarm.Vehicle;

import java.util.logging.Logger;

public abstract class FarmVehicle extends Vehicle {

    private String color;
    private Integer gasLevel = 10;

    private static final Logger LOGGER = Logger.getLogger(FarmVehicle.class.getName());



    public FarmVehicle() {
    }

    public FarmVehicle(Integer id, String color) {
        super(id);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(Integer gasLevel) {
        this.gasLevel = gasLevel;
    }

    public Boolean isEmpty() {
        if (this.gasLevel > 1) {
            LOGGER.info("\n your gas level is " + gasLevel + ".");
            return false;
        }
        return true;
    }

    public void refill() {
        setGasLevel(10);
    }

}
