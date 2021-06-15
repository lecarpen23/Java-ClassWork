package com.company;

public class RetailTest {
    public static void main(String[] args) {
        RetailItem item1 = new RetailItem("Jacket", 11, 69.95);
        RetailItem item2 = new RetailItem("Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 21, 24.95);
        //Test mutators
        System.out.println(item1.toString());
        System.out.println(item2.toString());
        System.out.println(item3.toString());
        System.out.println("\n");

        item1.unitsBought(1);
        item1.setPrice(59.95);
        item2.setDescription("Designer Jeans");
        item3.unitsSold(1);

        System.out.println(item1.toString());
        System.out.println("Description: " + item2.getDescription() + " Units: " + item2.getUnitsOnHand() + " Price: " + item2.getPrice());
        System.out.println(item3.toString());

    }
}
