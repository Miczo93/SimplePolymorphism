package com.company;

public class RaceCar extends Car {
    public RaceCar(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return 650;
    }

    @Override
    void MethodVehicle() {
        System.out.println("Vehicle method from RaceCar");
    }
    @Override
    void MethodCar() {
        System.out.println("Car method from RaceCar");
    }
    void MethodRaceCar(){
        System.out.println("RaceCar method");
    }
}
