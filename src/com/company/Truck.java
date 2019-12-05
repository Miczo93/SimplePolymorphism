package com.company;

public class Truck extends Car {
    public Truck(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return 750;
    }

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
