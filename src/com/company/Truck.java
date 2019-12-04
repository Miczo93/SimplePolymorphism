package com.company;

public class Truck extends Car {
    @Override
    void MethodVehicle() {
        System.out.println("Vehicle method from Truck");
    }
    @Override
    void MethodCar() {
        System.out.println("Car method from Truck");
    }
    void MethodTruck(){
        System.out.println("Truck method");
    }

}
