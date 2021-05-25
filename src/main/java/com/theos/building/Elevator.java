package com.theos.building;

public class Elevator {

    private final int maxWeight;
    private int floor;
    private State state;
    private int timeBetweenFloors = 1000;
    private int finalFloor;

    private Elevator(int maxWeight) {
        this.maxWeight = maxWeight;
        this.floor = 1;
        this.state = State.AWAITING;
    }

    public static Elevator generateElevator(int weight) {
        return new Elevator(weight);
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getFloor() {
        return floor;
    }

    public State getState() {
        return state;
    }

    public int getTimeBetweenFloors() {
        return timeBetweenFloors;
    }

    public int getFinalFloor() {
        return finalFloor;
    }

    public void setFinalFloor(int finalFloor) {
        this.finalFloor = finalFloor;
    }
}
