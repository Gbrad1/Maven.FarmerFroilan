package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Produce.StrangeFruit;
import com.zipcodewilmington.froilansfarm.Produce.Edible;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class FoodStorage {
    LinkedHashMap<String, ArrayList<Edible>> foodStorage;
    ArrayList<Edible> foodToBeAdded = new ArrayList<>();
    Object[] listOfProduceToEat = {"corn", "tomato", "strange fruit"};

    public FoodStorage() {
        this.foodStorage = new LinkedHashMap<>();
    }

    public void addFoodSet(String newFood, ArrayList<Edible> food) {
        this.foodStorage.put(newFood, food);
    }

    public LinkedHashMap<String, ArrayList<Edible>> getFoodStorage() {
        return foodStorage;
    }

    public void takeFood(String foodName, Edible food) {
        if (foodStorage.containsKey(foodName)) {
            foodStorage.get(foodName).remove(food);
        }
    }

    public void takeLastFood(String foodName) {
        if (foodStorage.containsKey(foodName)) {
            foodStorage.get(foodName).remove(foodStorage.get(foodName).size()-1);
        }
    }
    public int getFoodCount(String foodName){
        return foodStorage.get(foodName).size();
    }
    public void updateFoodCount(String foodName, Produce newProduce, int howMany) {
        if (foodStorage.containsKey(foodName)) {
            for (int i = 0; i < howMany; i++) {
                Edible produce = new StrangeFruit();
                foodToBeAdded.add(produce);
                foodStorage.put(foodName, foodToBeAdded);
            }
        }
    }

    public void setFoodStorage(LinkedHashMap<String, ArrayList<Edible>> foodStorage) {
        this.foodStorage = foodStorage;
    }

    public void setFoodToBeAdded(ArrayList<Edible> foodToBeAdded) {
        this.foodToBeAdded = foodToBeAdded;
    }

    public void setListOfProduceToEat(Object[] listOfProduceToEat) {
        this.listOfProduceToEat = listOfProduceToEat;
    }
}