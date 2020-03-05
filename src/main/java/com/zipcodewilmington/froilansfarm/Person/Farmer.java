package com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;

public class Farmer extends Botanist {

    public Farmer(String name, int age, String gender) {
        super(name, age, gender);
    }

    public void tame(Horse horse) {
        horse.setDocile(true);
    }

    public void fillFertilizer (CropDuster cropDuster) {
        cropDuster.refillFertilizer();

    }
}
