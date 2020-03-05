package com.zipcodewilmington.froilansfarm.Produce;

import java.util.ArrayList;

public class TomatoPlant extends Crop {

    ArrayList<Tomato> tomatoPlantWithFruit;

    public TomatoPlant() {
        this.tomatoPlantWithFruit = new ArrayList<>();
    }

    public void removeFruit(Tomato fruit) {
        tomatoPlantWithFruit.remove(fruit);
    }

    public void addFruit(Tomato fruit) {
        tomatoPlantWithFruit.add(fruit);
    }


    @Override
    public Edible yield() {
        return new Tomato();
    }
}


