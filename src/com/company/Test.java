package com.company;

public class Test {
    public static void main(String[] args) {
        Vehicle[] T = {new Plane("TutajPolew"), new Ship("Titanic"), new Car("Honda"), new Truck("Truck-kun"), new RaceCar("Mitsubishi")};
        for (Vehicle vehicles : T) {
            vehicles.go();
            vehicles.stop();
            System.out.println(String.format("Użyto %.2f paliwa",vehicles.calculateFuelConsumption()));
            if (vehicles instanceof Flying) {
                ((Flying) vehicles).callAirControl();
            }

            System.out.println("\n");
        }
    }
}
