package com.zipcodewilmington.froilansfarm.Produce;

public class Egg extends Edible {

    private boolean isFertile;

    public Egg() {
        super("eggy");
        isFertile = false;
    }

    public Egg(double quality){
        super(quality, "eggy");
        isFertile = false;
    }

    //no method to set fertile yet because it will make the plot too complicated
    public boolean isFertile() {
        return isFertile;
    }
}
