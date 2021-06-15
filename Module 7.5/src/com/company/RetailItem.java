package com.company;

public class RetailItem {
    String Description;
    int unitsOnHand;
    Double price;

    RetailItem(String Description, int unitsOnHand, Double price) {
        this.Description = Description;
        this.unitsOnHand = unitsOnHand;
        this.price = price; }

    //mutators for units on hand
    public void unitsSold(int units) {
        unitsOnHand = (unitsOnHand + units);
        this.unitsOnHand = unitsOnHand; }

    public void unitsBought(int units) {
        unitsOnHand = (unitsOnHand - units);
        this.unitsOnHand = unitsOnHand; }

     RetailItem(int unitsOnHand){
        unitsBought(unitsOnHand);
        unitsSold(unitsOnHand);
        this.unitsOnHand = unitsOnHand; }

    //Getter
    public String getDescription() {return this.Description;}
    public int getUnitsOnHand() {return this.unitsOnHand;}
    public Double getPrice() {return this.price;}

    //Setter
    public void setDescription(String newDescription) {this.Description = newDescription;}
    public void setPrice(Double newPrice) {this.price = newPrice;}

    //To String
    public String toString() {return "Description: " + Description + " Units: " + unitsOnHand + " Price: " + price;}
}
