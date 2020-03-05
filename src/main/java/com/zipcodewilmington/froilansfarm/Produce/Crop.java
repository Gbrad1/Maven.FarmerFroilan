package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
public abstract class Crop implements Produce {

    private boolean isFertilized;
    private boolean isHarvested;

    public Crop(){
        isFertilized = false;
        isHarvested = false;
    }
    public void setFertilized(boolean fertilizeStatus){
        isFertilized = fertilizeStatus;
    }

    public boolean checkIfFertilized(){
        return isFertilized;
    }
    public void setHarvested(boolean harvestedStatus){
        isHarvested = harvestedStatus;
    }

    public boolean checkIfHarvested() {

        return isHarvested;
    }


}
