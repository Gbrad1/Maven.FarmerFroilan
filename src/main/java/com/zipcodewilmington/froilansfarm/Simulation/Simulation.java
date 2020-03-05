package com.zipcodewilmington.froilansfarm.Simulation;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Console;
import com.zipcodewilmington.froilansfarm.Person.Botanist;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Produce.*;
import com.zipcodewilmington.froilansfarm.Simulation.Events.Events;
import com.zipcodewilmington.froilansfarm.Storage.*;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

import java.util.ArrayList;

public class Simulation {

    public static Console c = new Console(System.out);

    public static Farm setUpScenario(){
        //create all the people/animal/plants/buildings here
        //will return a Farm that is stuffed with everything we need for simulation.
        Farm mainFarm = new Farm("Froilan's Farm");
        FarmHouse froilansHouse = new FarmHouse();
        Person froilan = new Farmer("Froilan",25,"Male");
        Person froilanda = new Botanist("Froilanda", 22, "Female");
        ArrayList<Field> listOfFields = new ArrayList<>();
        Field currentField = new Field();
        currentField.setCropRow(setUpCropRow());

        listOfFields.add(currentField);
        froilansHouse.addPerson(froilan);
        froilansHouse.addPerson(froilanda);

        mainFarm.setFarmHouse(froilansHouse);
        mainFarm.setChickenCoops(setUpChickenCoops());
        mainFarm.setStables(setUpStables());
        mainFarm.setVehicles(setUpVehicle());
        mainFarm.setFoodStorage(setUpFridge());
        mainFarm.setAnimalFoodStorage(setUpSilo());
        mainFarm.setFields(listOfFields);
        return mainFarm;
    }


    public static ArrayList<CropRow> setUpCropRow(){
        ArrayList<CropRow> someCropRow = new ArrayList<>();

        CropRow cr = new CropRow();
        for (int j = 0; j < 100; j++) {
            cr.addSeeds( new CornStalk());
        }
        CropRow cr2 = new CropRow();
        for (int j = 0; j < 100; j++) {
            cr2.addSeeds( new TomatoPlant());
        }

        CropRow cr3 = new CropRow();
        CropRow cr4 = new CropRow();
        CropRow cr5 = new CropRow();

        someCropRow.add(cr);
        someCropRow.add(cr2);
        someCropRow.add(cr3);
        someCropRow.add(cr4);
        someCropRow.add(cr5);
        return someCropRow;
    }


    public static FoodStorage setUpSilo(){
        FoodStorage someStorage = new FoodStorage();
        ArrayList<Edible> manyCorns = new ArrayList<>();
        for (int i = 0; i < 150 ; i++) {
            manyCorns.add(new EarOfCorn());
        }
        someStorage.addFoodSet("EarOfCorn", manyCorns);

        return someStorage;
    }

    public static FoodStorage setUpFridge(){
        FoodStorage someStorage = new FoodStorage();
        ArrayList<Edible> manyCorns = new ArrayList<>();
        ArrayList<Edible> manyTomato = new ArrayList<>();
        ArrayList<Edible> manyEgg = new ArrayList<>();
        for (int i = 0; i < 50 ; i++) {
            manyCorns.add(new EarOfCorn());
            manyTomato.add(new Tomato());
            manyEgg.add(new Egg());
        }
        someStorage.addFoodSet("EarOfCorn", manyCorns);
        someStorage.addFoodSet("Tomato", manyTomato);
        someStorage.addFoodSet("Egg", manyEgg);

        return someStorage;
    }


    public static ArrayList<ChickenCoop> setUpChickenCoops(){
        ArrayList<ChickenCoop> chickenCoopList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ChickenCoop chickenCoop = new ChickenCoop();
            for (int j = 0; j < 4; j++) {
                chickenCoop.addChicken(new Chicken());
            }
            chickenCoopList.add(chickenCoop);
        }
        chickenCoopList.get(3).removeLastChicken();
        return chickenCoopList;
    }

    public static ArrayList<Stable> setUpStables(){
        ArrayList<Stable> stableList = new ArrayList<>();
        String[] horseNames = {
                "Snowy",
                "Epona",
                "Bullet",
                "Spirit",
                "Sea Biscuit",
                "Hidalgo",
                "Lynel",
                "Dusk",
                "Dawn",
                "Blupee",
                "",
                ""
        };
        for (int i = 0; i < 3; i++) {
            Stable stable = new Stable();
            for (int j = 0; j < 4; j++) {
                stable.addHorse(new Horse(horseNames[4*i + j]));
            }
            stableList.add(stable);
        }
        stableList.get(stableList.size()-1).removeHorse("");
        stableList.get(stableList.size()-1).removeHorse("");

        return stableList;
    }

    public static ArrayList<FarmVehicle> setUpVehicle(){
        ArrayList<FarmVehicle> vehicles = new ArrayList<>();
        Tractor tractor = new Tractor();
        CropDuster cropDuster = new CropDuster();
        vehicles.add(tractor);
        vehicles.add(cropDuster);
        return vehicles;
    }


    public static void simulate(Farm someFarm){
        c.printlnWaitWithTime(2500L, "The simulation for the week will be starting soon...");

        for (WeekDay d :WeekDay.values()) {
            c.printlnWait(" [ It's "+d.getWeekDayName()+"! ] ");
            Events.everyMorning(someFarm);
            d.getWeekDayEvents().run(someFarm);
            Events.everyNight(someFarm);
        }

        c.printlnWaitWithTime(2500L, "The simulation for the week has ended.");
    }


}
