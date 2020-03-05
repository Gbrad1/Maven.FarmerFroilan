package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import java.util.ArrayList;

public class ChickenCoop {
    ArrayList<Chicken> chickens;


    public ChickenCoop() {
        this.chickens = new ArrayList<>();
    }

    public void addChicken(Chicken chick) {
        chickens.add(chick);
    }

    public void removeChicken(Chicken chick) {
        chickens.remove(chick);
    }

    public void removeLastChicken() {
        chickens.remove(chickens.size()-1);
    }

    public Chicken getChicken(Integer index) {
        return chickens.get(index);
    }

    public int getNumChicken(){return chickens.size();}

    public ArrayList<Chicken> getChickens() { return chickens; }


}
