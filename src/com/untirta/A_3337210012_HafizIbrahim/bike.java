package com.untirta.A_3337210012_HafizIbrahim;

public final class bike extends vehicle {
    private final int numOfWheels;
    private final int speedLimit;

    public bike(String brand, int numOfWheels, int speedLimit) {
        super(brand);
        this.numOfWheels = numOfWheels;
        this.speedLimit = speedLimit;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void ride() {
        System.out.println("Riding the bike with " + getNumOfWheels() + " wheels.");
        System.out.println("Speed Limit is " + speedLimit + " Km/s \n");
    }

    @Override
    int getSpeedLimit() {
        return speedLimit;
    }
}
