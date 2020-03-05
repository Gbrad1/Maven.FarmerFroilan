package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Storage.FoodStorage;

public class Horse extends Animal implements Rideable {

    private int age;
    private String color;
    private String name;
    private boolean isMounted;
    private boolean isDocile;

    public Horse(String name, String color, int age){
        this.age = age;
        this.color = color;
        this.name = name;
        isMounted = false;
        isDocile = false;
    }

    public Horse(String name){
        this(name,"",1);
    }

    public Horse(){
        this("","",0);
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean isDocile() { return isDocile; }

    public void setDocile(boolean docile) { isDocile = docile; }

    public void gallop(){ setHappy(true);; }



    @Override
    public void setMounted(boolean mounted) {
        this.isMounted = mounted;
    }

    @Override
    public boolean isMounted() {
        if(isDocile){
            isMounted = false;
            return false;
        } else{
            isMounted = true;
            return true;
        }
    }

    @Override
    public void eat(Edible food, FoodStorage storage) {
        storage.takeLastFood(food.getClass().getSimpleName());
    }
}
