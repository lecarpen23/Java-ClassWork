package com.company;

public class Address {
    private int houseNumber;
    private String street;
    private int aptNumber;
    private String city;
    private String state;
    private int postalCode;

    //Constructor1
    Address(int houseNumber, String street, int aptNumber, String city, String state, int postalCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.aptNumber = aptNumber;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode; }
    //Constructor2
    Address(int houseNumber, String street, String city, String state, int postalCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode; }
    //getter (turns out I didnt need these
    public String getStreet () { return street; }
    public String getCity () { return city; }
    public String getState () { return state; }
    public int getPostalCode() { return postalCode; }

    //print method
    public String toString() { return street + "\n" + city + ", " + state + ", " + postalCode; }

    public boolean comesBefore(Address Address) {
        return (this.postalCode <= Address.postalCode);
    }

}
