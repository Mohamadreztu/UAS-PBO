package com.untirta.A_3337210012_HafizIbrahim;

public class car extends vehicle {
    private int numOfDoors;
    private int getSpeedLimit;
    
    public car(String brand, int numOfDoors, int getSpeedLimit) {
        super(brand);
        this.numOfDoors = numOfDoors;
        this.getSpeedLimit = getSpeedLimit;
    }
    
    public int getNumOfDoors() {
        return numOfDoors;
    }
    
    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }
    
    public void drive() {
        System.out.println("Driving the car with " + getNumOfDoors() + " doors.");
        System.out.println("Speed Limit is " + getSpeedLimit() + "Km/s \n");
    }

    @Override
    int getSpeedLimit(){
        return getSpeedLimit;
    }
}
