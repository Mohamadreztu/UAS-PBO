package com.untirta.A_3337210012_HafizIbrahim;

public abstract class vehicle {
    private String brand;
        
    public vehicle(String brand) {
        this.brand = brand;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    abstract int getSpeedLimit();
}
