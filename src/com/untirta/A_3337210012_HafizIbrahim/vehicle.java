package com.untirta.A_3337210012_HafizIbrahim;

public abstract class vehicle {
    private final String brand;
        
    public vehicle(String brand) {
        this.brand = brand;
    }
    
    public String getBrand() {
        return brand;
    }

    abstract int getSpeedLimit();
}
