package com.untirta.A_3337210012_HafizIbrahim;

public class bike extends vehicle {
    private int numOfWheels;
    private int getSpeedLimit;
    
    public bike(String brand, int numOfWheels, int getSpeedLimit) {
        super(brand);
        this.numOfWheels = numOfWheels;
        this.getSpeedLimit = getSpeedLimit;
    }
    
    public int getNumOfWheels() {
        return numOfWheels;
    }
    
    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }
    
    public void ride() {
        System.out.println("Riding the bike with " + getNumOfWheels() + " wheels.");
        System.out.println("Speed Limit is " + getSpeedLimit() + "Km/s \n");
    }

    @Override
    int getSpeedLimit(){
        return getSpeedLimit;
    }
}
