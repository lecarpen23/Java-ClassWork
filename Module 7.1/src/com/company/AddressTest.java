package com.company;

public class AddressTest {
    //add in another comparison to prove it all works
    public static void main(String[] args) {
        Address newAddress1 = new Address(2134, "Quinn Street", "Arlington", "Virginia", 12345);
        Address newAddress2 = new Address(1020, "Westminster", "Fayetteville", "Arkansas", 72704);

        if (newAddress1.comesBefore(newAddress2)) System.out.println("The postal code for the house on " + newAddress1.getStreet() + " comes before the postal code on " + newAddress2.getStreet() + ".");
        else System.out.println("The compared postal code comes first. ");
        System.out.print("\n");

        System.out.print(newAddress1.toString());
    }
}
