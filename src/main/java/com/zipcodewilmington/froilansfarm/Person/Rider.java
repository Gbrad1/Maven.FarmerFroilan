package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Vehicle.Vehicle;

public class Rider {

    public boolean isRiding;

    public Rider(){
        isRiding = false;
    }

    public boolean mount(Rideable rideable) {

        if (rideable.isMounted()) {
            return false;
        }else {
            rideable.setMounted(true);
            isRiding = true;
            return true;
        }
    }

    public boolean dismount(Rideable rideable) {
        if (!isRiding) {
            return false;
        }else{
            isRiding = false;
            rideable.setMounted(false);
            return true;
        }

    }

}