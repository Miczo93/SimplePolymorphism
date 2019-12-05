package com.company;

public class Plane extends Vehicle implements Flying {

    public Plane(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return 1000;
    }

    @Override
    double getDistance() {
        return 100;
    }

    @Override
    public void go() {
        super.go();
        takeOff();
    }

    @Override
    public void stop() {
        super.stop();
        land();
    }

    @Override
    void MethodVehicle() {
        System.out.println("Vehicle method from Plane");
    }

    void MethodPlane() {
        System.out.println("Plane method");
    }

    @Override
    public void takeOff() {
        System.out.println("Plane took off");
    }

    @Override
    public void land() {
        System.out.println("Plane is landing");
    }

    @Override
    public void callAirControl() {
        System.out.println("Plane is calling");
    }
}
