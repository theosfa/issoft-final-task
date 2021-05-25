package com.theos.building;

import com.theos.person.Person;

public class Building {

    private int numberOfFloors;
    private int numberOfElevators;
    private int currentElevatorAddingIndex = 0;
    private int currentFloorAddingIndex = 0;
    private Floor[] floors = new Floor[3];
    private Elevator[] elevators = new Elevator[1];

    public Building(int numberOfFloors, int numberOfElevators) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfElevators = numberOfElevators;
    }

    public void addPersonToTheFloor(int numberOfFloor, Person person) {
        floors[numberOfFloor-1].addingPersonToFloor(person);
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfElevators() {
        return numberOfElevators;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public Elevator[] getElevators() {
        return elevators;
    }

    public void addElevator(Elevator elevator) {
        elevators[currentElevatorAddingIndex] = elevator;
        currentElevatorAddingIndex++;
    }

    public void addFloor(Floor floor) {
        floors[currentFloorAddingIndex] = floor;
        currentFloorAddingIndex++;
    }

}
