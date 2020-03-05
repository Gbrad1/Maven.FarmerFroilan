package com.zipcodewilmington.froilansfarm.Storage;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import java.util.ArrayList;
public class Stable {


    private ArrayList<Horse> horses;
    boolean isClean = true;

    public Stable(){
        horses = new ArrayList<>();
    }

    public Stable(ArrayList<Horse> horses){
        this.horses = horses;
    }

    public void addHorse(Horse horse){
        horses.add(horse);
        //when you add horse there is a change that stable gets dirty
        if(Math.random()<0.2){
            getsDirty();
        }
    }

    public Horse removeHorse(String name){
        Horse h = getHorse(name);
        horses.remove(h);
        return h;
    }


    public Horse getHorse(String name){
        for( Horse h :horses ){
            if(h.getName().equals(name)){
                return h;
            }
        }
        return null;
    }

    public int getNumOfHorse(){
        return horses.size();
    }

    //you can only clean it when there are no horse
    public void cleanUpStable(){
        if(getNumOfHorse()==0)
            isClean = true;
    }

    public boolean checkIfClean(){
        return isClean;
    }

    public void getsDirty(){
        isClean = false;
    }

    public String getListOfHorseName(){
        StringBuilder s = new StringBuilder();
        for(Horse h :horses){
            s.append(h.getName()).append("\n");
        }
        return s.toString();
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

}
