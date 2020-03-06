package com.zipcodewilmington.froilansfarm.Produce;

import java.util.ArrayList;

public class DragonFruitTree extends Crop  {

    ArrayList<DragonFruit> plantWithFruit;

    public DragonFruitTree() {
        this.plantWithFruit = new ArrayList<>();
    }

    public void removeFruit(DragonFruit fruit) {
        plantWithFruit.remove(fruit);
    }

    public void addFruit(DragonFruit fruit) {
        plantWithFruit.add(fruit);
    }

    @Override
    public Edible yield() {
        return new DragonFruit();
    }
}
