package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.FoodStorage;

public class Botanist extends Person implements Eater {

    public Botanist(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void plant(Crop crop, CropRow cropRow) {
        cropRow.addSeeds(crop);
    }

    @Override
    public void eat(Edible food, FoodStorage storage) {
        storage.takeLastFood(food.getClass().getSimpleName());
    }
}
