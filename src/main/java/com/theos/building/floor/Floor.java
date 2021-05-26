package com.theos.building.floor;

import com.theos.person.Person;
import com.theos.threads.FloorButtonClickerThread;

import java.util.*;


public class Floor {
    private Queue<Person> down = new LinkedList<>();
    private Queue<Person> up = new LinkedList<>();
    private final int number;

    public Floor(int number) {
        this.number = number;
    }

    public static Floor generateFloor(int number) {
        return new Floor(number);
    }

    public Queue<Person> getQueueUp() {
        return up;
    }

    public Queue<Person> getQueueDown() {
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
        FloorButtonClickerThread floorButtonClickerThread = new FloorButtonClickerThread(this);
    }

}
