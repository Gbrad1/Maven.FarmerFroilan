package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Produce.Crop;
import java.util.ArrayList;

public class CropRow {

    ArrayList<Crop> crops;

    public CropRow() {
        this.crops = new ArrayList<>();
    }

    public void addSeeds(Crop seed) {
        crops.add(seed);
    }

    public void removeCrops() {
        crops.clear();
    }

    public Integer getCropRowSize() {
        return crops.size();
    }

    public ArrayList<Crop> getCrops() {
        return crops;
    }
}
