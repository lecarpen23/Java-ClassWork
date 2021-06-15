package com.company;

public class CanTest {
    public static void main(String[] args) {
        Can newCan = new Can(5,10);

        double sa = newCan.getSurfaceArea();
        double vol = newCan.getVolume();

        System.out.println("The surface area of the can is: " + sa);
        System.out.println("The volume of the can is: " + vol);

    }
}
