package com.theos.building;

import com.theos.person.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Floor {
    private ArrayList<Person> up = new ArrayList<Person>();
    private ArrayList<Person> down = new ArrayList<Person>();
    private final int number;

    public Floor(int number) {
        this.number = number;
    }

    public static Floor generateFloor(int number) {
        return new Floor(number);
    }

    public ArrayList<Person> getQueueUp() {
        return up;
    }

    public ArrayList<Person> getQueueDown() {
        return down;
    }

    public int getNumber() {
        return number;
    }

    public void addingPersonToFloor(Person person) {
        if (number < person.getTargetFloor()) {
            up.add(person);
        } else {
          down.add(person);
        }
    }

}
