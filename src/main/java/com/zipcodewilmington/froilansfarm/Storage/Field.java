package com.zipcodewilmington.froilansfarm.Storage;

import java.util.ArrayList;

public class Field {

    ArrayList<CropRow> field;

    public Field() {
        this.field = new ArrayList<>();
    }

    public void addCropRow(CropRow cropRow) {
        field.add(cropRow);
    }

    public CropRow getCropRow(Integer numberCropRow) {
        return field.get(numberCropRow);
    }

    public Integer getFieldSize() {
        return field.size();
    }

    public void setCropRow(ArrayList<CropRow> field) {
        this.field = field;
    }
}
