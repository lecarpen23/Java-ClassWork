package com.company;

public class Car {
    private double fuelEfficiency;
    private double fuelLevel;
    private int gas;

    Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        fuelLevel = 0;
    }

    Car(int gas){
        addGas(gas);
    }

    public void addGas(int gas) {
        fuelLevel = fuelLevel + gas;
        this.fuelLevel = fuelLevel;
    }
    public void drive(int miles) {
        if (miles <= getFuelLevel() * getFuelEfficiency()) {
            double gallonsUsed = (miles / getFuelEfficiency());
            fuelLevel = (fuelLevel - gallonsUsed);
            this.fuelLevel = fuelLevel;
        }
        else {System.out.println("Error: You cant drive that far. ");}
    }

    //public void drive() {}
    //public void getGasLevel() {}

    //Getters
    public double getFuelEfficiency() {return this.fuelEfficiency; }
    public double getFuelLevel() {return this.fuelLevel; }

}