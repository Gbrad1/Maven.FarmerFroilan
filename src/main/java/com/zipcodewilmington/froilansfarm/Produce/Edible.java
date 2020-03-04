package com.zipcodewilmington.froilansfarm.Produce;

public abstract class Edible {
    private String flavor;
    private double quality;

    public Edible(){
        this(0.3,"");
    }

    public Edible(double quality){
        this(quality,"");
    }

    public Edible(double quality, String flavor){
        this.quality = quality;
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }
}
