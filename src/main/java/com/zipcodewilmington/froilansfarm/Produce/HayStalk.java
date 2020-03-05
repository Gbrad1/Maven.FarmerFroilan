package com.zipcodewilmington.froilansfarm.Produce;

public class HayStalk extends Crop {
    @Override
    public Edible yield() {
        return new Hay();
    }
}
