package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {


    private Integer id;
    private boolean isMounted;

    public Vehicle(Integer id) {
        this.id = id;
        isMounted = false;
    }

    public Vehicle() {
        id = -1;
        isMounted = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }
}
