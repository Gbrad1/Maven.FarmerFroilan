package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;

public abstract class Animal implements Eater {
    private String gender;
    private boolean isHappy;
    public Animal(){isHappy = true;};

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }
}
