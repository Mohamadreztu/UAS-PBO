package com.untirta.A_3337210012_HafizIbrahim;

public class test {
    public static void main(String[] args) {
        bike myBike = new bike("Honda", 2, 160);
        car myCar = new car("Toyota", 4, 240);
        
        System.out.println("My bike brand is " + myBike.getBrand());
        myBike.ride();
        
        System.out.println("My car brand is " + myCar.getBrand());
        myCar.drive();
    }
}