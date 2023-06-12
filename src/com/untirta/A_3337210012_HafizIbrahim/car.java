package com.untirta.A_3337210012_HafizIbrahim;

public final class car extends vehicle {
    private final int numOfDoors;
    private final int speedLimit;

    public car(String brand, int numOfDoors, int speedLimit) {
        super(brand);
        this.numOfDoors = numOfDoors;
        this.speedLimit = speedLimit;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void drive() {
        System.out.println("Driving the car with " + getNumOfDoors() + " doors.");
        System.out.println("Speed Limit is " + speedLimit + " Km/s \n");
    }

    @Override
    int getSpeedLimit() {
        return speedLimit;
    }
}
