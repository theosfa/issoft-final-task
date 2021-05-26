package com.theos.building.floor;

import com.theos.person.Person;
import com.theos.threads.FloorButtonClickerThread;

import java.util.*;

import static com.theos.building.floor.ButtonState.DOWN;
import static com.theos.building.floor.ButtonState.UP;


public class Floor {
    private Queue<Person> queueDown = new LinkedList<>();
    private Queue<Person> queueUp = new LinkedList<>();
    private final int number;

    public Floor(int number) {
        this.number = number;
    }

    public static Floor generateFloor(int number) {
        return new Floor(number);
    }

    public Queue<Person> getQueueUp() {
        return queueUp;
    }

    public Queue<Person> getQueueDown() {
        return queueDown;
    }

    public int getNumber() {
        return number;
    }

    public void addingPersonToFloor(Person person) {
        if (number < person.getTargetFloor()) {
            queueUp.add(person);
        } else {
            queueDown.add(person);
        }
        FloorButtonClickerThread floorButtonClickerThread = new FloorButtonClickerThread(this);
    }

    public Person deletingFirstPersonFromTheQueue(ButtonState buttonState){
        
        Person person = null;
        if (buttonState == UP) {
            person = queueUp.poll();
        }else if (buttonState == DOWN) {
            person =  queueDown.poll();
        }
        
        return person;
    }

}
