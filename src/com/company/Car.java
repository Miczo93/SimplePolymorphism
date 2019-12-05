package com.company;

public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return 500;
    }

    @Override
    double getDistance() {
        return 1000;
    }

    @Override
    void MethodVehicle() {
        System.out.println("Vehicle method from Car");
    }

    void MethodCar() {
        System.out.println("Car method");
    }
}
