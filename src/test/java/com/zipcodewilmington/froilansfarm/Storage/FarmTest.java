package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTest {

    @Test
    public void constructor1Test(){
        Farm myFarm = new Farm();

        Assert.assertEquals( "", myFarm.getFarmName() );
        Assert.assertEquals( 0, myFarm.getChickenCoops().size());
        Assert.assertEquals( 0, myFarm.getStables().size());
        Assert.assertEquals( 0, myFarm.getFields().size());
        Assert.assertNull(myFarm.getFarmHouse());
        Assert.assertNull(myFarm.getFoodStorage());
    }

    @Test
    public void constructor2Test(){
        Farm myFarm = new Farm("My Farm");

        Assert.assertEquals( "My Farm", myFarm.getFarmName() );
        Assert.assertEquals( 0, myFarm.getChickenCoops().size());
        Assert.assertEquals( 0, myFarm.getStables().size());
        Assert.assertEquals( 0, myFarm.getFields().size());
        Assert.assertNull(myFarm.getFarmHouse());
        Assert.assertNull(myFarm.getFoodStorage());
    }

    @Test
    public void constructor3Test(){

        ArrayList<Stable> stables = new ArrayList<>();
        stables.add(new Stable());
        stables.add(new Stable());
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
        chickenCoops.add(new ChickenCoop());
        chickenCoops.add(new ChickenCoop());
        chickenCoops.add(new ChickenCoop());
        chickenCoops.add(new ChickenCoop());
        ArrayList<Field> fields = new ArrayList<>();
        fields.add(new Field());
        fields.add(new Field());
        fields.add(new Field());
        ArrayList<FarmVehicle> vehicles = new ArrayList<>();
        vehicles.add(new Tractor());
        vehicles.add(new CropDuster());
        Farm myFarm = new Farm("My Farm",stables,chickenCoops,fields,new FarmHouse(),new FoodStorage(),new FoodStorage(),vehicles);
        Assert.assertEquals( "My Farm", myFarm.getFarmName() );
        Assert.assertEquals( 4, myFarm.getChickenCoops().size());
        Assert.assertEquals( 2, myFarm.getStables().size());
        Assert.assertEquals( 3, myFarm.getFields().size());
        Assert.assertNotNull(myFarm.getFarmHouse());
        Assert.assertNotNull(myFarm.getFoodStorage());
        Assert.assertNotNull(myFarm.getAnimalFoodStorage());
        Assert.assertEquals( 2, myFarm.getVehicles().size());
    }

    @Test
    public void getFarmNameTest(){
        Farm myFarm = new Farm("Organic Farm");
        String expected = "Organic Farm";
        String actual = myFarm.getFarmName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setFarmNameTest(){
        Farm myFarm = new Farm("some farm");
        myFarm.setFarmName("Sunshine Farm");
        Assert.assertEquals("Sunshine Farm",myFarm.getFarmName());
    }

    @Test
    public void addStableTest(){
        Farm myFarm = new Farm("Organic Farm");
        Stable someStable1 =  new Stable();
        Stable someStable2 =  new Stable();
        myFarm.addStable(someStable1);
        myFarm.addStable(someStable2);

        Assert.assertEquals(2, myFarm.getStables().size());
    }

    @Test
    public void addChickenCoopTest(){
        Farm myFarm = new Farm("Organic Farm");
        ChickenCoop someCoop = new ChickenCoop();
        myFarm.addChickenCoop(someCoop);

        Assert.assertEquals(1, myFarm.getChickenCoops().size());
    }

    @Test
    public void addFieldTest(){
        Farm myFarm = new Farm("Organic Farm");
        Field someField = new Field();
        myFarm.addField(someField);
        Assert.assertEquals(1, myFarm.getFields().size());
    }

    @Test
    public void setFarmHouseTest(){
        Farm myFarm = new Farm("Organic Farm");
        FarmHouse farmHouse = new FarmHouse();
        myFarm.setFarmHouse(farmHouse);
        Assert.assertEquals(farmHouse, myFarm.getFarmHouse());
    }

    @Test
    public void setFoodStorageTest(){
        Farm myFarm = new Farm();
        FoodStorage expectedStorage = new FoodStorage();
        myFarm.setFoodStorage(expectedStorage);
        Assert.assertEquals(expectedStorage, myFarm.getFoodStorage());
    }

    @Test
    public void setStableTest(){
        Farm myFarm = new Farm();
        ArrayList<Stable> stables = new ArrayList<>();
        stables.add(new Stable());
        stables.add(new Stable());
        stables.add(new Stable());

        myFarm.setStables(stables);
        Assert.assertArrayEquals( stables.toArray() , myFarm.getStables().toArray() );
        Assert.assertEquals( stables.size(), myFarm.getStables().size());
    }

    @Test
    public void setChickenCoopTest(){
        Farm myFarm = new Farm();
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
        chickenCoops.add(new ChickenCoop());
        chickenCoops.add(new ChickenCoop());
        chickenCoops.add(new ChickenCoop());
        chickenCoops.add(new ChickenCoop());

        myFarm.setChickenCoops(chickenCoops);
        Assert.assertArrayEquals( chickenCoops.toArray() , myFarm.getChickenCoops().toArray() );
        Assert.assertEquals( chickenCoops.size(), myFarm.getChickenCoops().size());
    }

    @Test
    public void setFieldTest(){
        Farm myFarm = new Farm();
        ArrayList<Field> fields = new ArrayList<>();
        fields.add(new Field());
        fields.add(new Field());

        myFarm.setFields(fields);
        Assert.assertArrayEquals( fields.toArray() , myFarm.getFields().toArray() );
        Assert.assertEquals( fields.size(), myFarm.getFields().size());
    }

    @Test
    public void setVehicleTest(){
        Farm myFarm = new Farm();
        ArrayList<FarmVehicle> vehicles = new ArrayList<>();
        vehicles.add(new Tractor());
        vehicles.add(new CropDuster());
        myFarm.setVehicles(vehicles);

        Assert.assertArrayEquals( vehicles.toArray() , myFarm.getVehicles().toArray() );
        Assert.assertEquals( vehicles.size(), myFarm.getVehicles().size());
    }

    @Test
    public void setAnimalStorageTest(){
        Farm myFarm = new Farm();
        FoodStorage fs = new FoodStorage();
        myFarm.setFoodStorage(fs);
        Assert.assertEquals(fs, myFarm.getFoodStorage() );
    }

}
