package com.company;

public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    abstract double getFuelNeeds();
    abstract double getDistance();
    double calculateFuelConsumption()
    {
       return getFuelNeeds()/getDistance();
    };

    public void go(){
        System.out.println(String.format("%s has started", this.getClass().getName()));;
    }
    public void stop(){
        System.out.println(String.format("%s has stopped", this.getClass().getName()));;
    }

    void MethodVehicle() {
        System.out.println("Vehicle method");
    }
}
