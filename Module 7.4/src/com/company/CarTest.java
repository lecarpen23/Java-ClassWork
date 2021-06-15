package com.company;

public class CarTest {
    public static void main(String[] args) {
        Car newCar = new Car(10.0);
        newCar.addGas(20);
        System.out.println("Fuel Efficiency: " + newCar.getFuelEfficiency());
        System.out.println("Gallons of fuel left: " + newCar.getFuelLevel());

        newCar.drive(190);
        System.out.println("Gallons of fuel left after driving: " + newCar.getFuelLevel());
        newCar.addGas(9);
        System.out.println("Gallons of fuel left after driving: " + newCar.getFuelLevel());
        }
}

