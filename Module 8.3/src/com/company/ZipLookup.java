package com.company;
import java.util.ArrayList;
import java.util.List;


public class ZipLookup {
    private String firstName;
    private String secondName;
    private int zip;
    //public ArrayList<ZipLookup> allZips = new ArrayList<ZipLookup>();


    ZipLookup(String firstName, String secondName, int zip){
        this.firstName = firstName;
        this.secondName = secondName;
        this.zip = zip;
    }
    ZipLookup() {
        String firstName;
        String secondName;
        int zip;
    }

    public String toString() {
        return firstName + " \t " + secondName + " \t " + zip;
    }
    public String getFirstName() {return firstName;}
    public String getSecondName() {return secondName;}
    public int getZip() {return zip;}

    public static void main(String[] args) {
        ZipLookup[] myLookup = new ZipLookup[25];
        ArrayList<ZipLookup> aLookup = new ArrayList<ZipLookup>();
        ZipLookup zero = new ZipLookup("name", "nameTwo", 219);
        aLookup.add(zero);

        System.out.println(zero);

        ZipLookup first = new ZipLookup("John", "Smith", 12345);
        ZipLookup second = new ZipLookup("Jane", "Doe", 23456);

        //ArrayList<ZipLookup> myLookup = new ArrayList<ZipLookup>();
        //myLookup.add(first);
        //myLookup.add(second);
        //myLookup.add(new ZipLookup("Joe", "Name", 98765));
        myLookup[0] = first;
        myLookup[1] = second;
        for (int i = 0; i < 25; i++)
            if(myLookup[i] != null) System.out.println(myLookup[i].toString());
            else System.out.println("null");
        //System.out.println(myLookup[0]);
        //System.out.print(myLookup.toString());
    }

    }

