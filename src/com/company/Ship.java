package com.company;

public class Ship extends Vehicle implements Sailing {
    @Override
    double getFuelNeeds() {
        return 20000;
    }

    @Override
    double getDistance() {
        return 1000;
    }

    @Override
    public void stop() {
       dock();
    }

    @Override
    void MethodVehicle() {
        System.out.println("Vehicle method from Ship");
    }

    void MethodShip() {
        System.out.println("Ship method");
    }

    public Ship(String name) {
        super(name);
    }

    @Override
    public void dock() {
        System.out.println(String.format("Przebyto: %.2f",getDistance()));
    }
}
