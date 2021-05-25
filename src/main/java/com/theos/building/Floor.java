package com.theos.building;

import com.theos.person.Person;

import java.util.Queue;

public class Floor {
    private Queue<Person> up;
    private Queue<Person> down;
    private final int number;

    public Floor(int number) {
        this.number = number;
    }
}
