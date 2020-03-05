package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Person.Person;

import java.util.ArrayList;

public class FarmHouse {

    ArrayList<Person> listOfPeople;

    public FarmHouse() {
        this.listOfPeople = new ArrayList<>();
    }

    public void addPerson(Person newPerson) {
        listOfPeople.add(newPerson);
    }

    public ArrayList<Person> getListOfPeople() {
        return listOfPeople;
    }

    public Person getPerson(String name) {
        for (Person element : listOfPeople) {
            if (element.getName().equals(name)) {
                return element;
            }
        }
        return null;
    }

    public void removePerson(String name) {
        listOfPeople.removeIf(element -> element.getName().equals(name));
    }

}
