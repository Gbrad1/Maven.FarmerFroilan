package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Storage.FoodStorage;

public interface Eater {
    void eat(Edible object, FoodStorage storage);
}
