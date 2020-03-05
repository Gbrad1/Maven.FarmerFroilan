package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Produce.Egg;
import com.zipcodewilmington.froilansfarm.Storage.FoodStorage;

public class Chicken extends Animal implements Produce {

    @Override
    public Edible yield() {
        return new Egg();
    }

    @Override
    public void eat(Edible food, FoodStorage storage) {
        storage.takeLastFood(food.getClass().getSimpleName());
    }

}
