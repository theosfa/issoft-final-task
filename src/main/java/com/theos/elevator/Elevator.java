package com.theos.elevator;

public class Elevator {

    private final int maxWeight;
    private int floor;
    private State state;

    private Elevator(int maxWeight) {
        this.maxWeight = maxWeight;
        this.floor = 1;
        this.state = State.AWAITING;
    }

    public Elevator generateElevator(int weight) {
        return new Elevator(weight);
    }
}
