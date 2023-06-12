package com.untirta.A_3337210012_HafizIbrahim;

public class test {
    public static void main(String[] args) {
        vehicle myBike = new bike("Honda", 2, 160);
        vehicle myCar = new car("Toyota", 4, 240);
        
        System.out.println("My bike brand is " + myBike.getBrand());
        if (myBike instanceof bike) {
            ((bike) myBike).ride();
        }
        
        System.out.println("My car brand is " + myCar.getBrand());
        if (myCar instanceof car) {
            ((car) myCar).drive();
        }
    }
}
