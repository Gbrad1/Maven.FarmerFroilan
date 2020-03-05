package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;

public class StrangePlant extends Crop  {

    ArrayList<StrangeFruit> plantWithFruit;

    public StrangePlant() {
        this.plantWithFruit = new ArrayList<>();
    }

    public void removeFruit(StrangeFruit fruit) {
        plantWithFruit.remove(fruit);
    }

    public void addFruit(StrangeFruit fruit) {
        plantWithFruit.add(fruit);
    }

    @Override
    public Edible yield() {
        return new StrangeFruit();
    }
}
