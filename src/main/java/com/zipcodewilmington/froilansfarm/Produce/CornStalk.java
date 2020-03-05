package com.zipcodewilmington.froilansfarm.Produce;

import java.util.ArrayList;

public class CornStalk extends Crop {

    ArrayList<EarOfCorn> cornStalkWithCorn;

    public CornStalk() {
        this.cornStalkWithCorn = new ArrayList<>();
    }

    public void removeFruit(EarOfCorn corn) {
        cornStalkWithCorn.remove(corn);
    }

    public void addFruit(EarOfCorn corn) {
        cornStalkWithCorn.add(corn);
    }


    @Override
    public Edible yield() {
        return new EarOfCorn();
    }
}