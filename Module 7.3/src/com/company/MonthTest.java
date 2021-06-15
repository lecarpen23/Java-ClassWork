package com.company;

public class MonthTest {
    public static void main(String[] args) {
        Month firstTest = new Month("January");
        Month secondTest = new Month(2);
        Month thirdTest = new Month();
        System.out.println(firstTest.toString());
        System.out.println(secondTest.toString());
        System.out.println("\n");

        firstTest.setMonthName("October");
        secondTest.setMonthNumber(11);
        thirdTest.setMonthName("December");


        System.out.println(firstTest.toString());
        System.out.println(firstTest.getMonthNumber());
        System.out.println((firstTest.getMonthName()));
        System.out.println("\n");
        System.out.println(secondTest.toString());
        System.out.println(secondTest.getMonthName());
        System.out.println(secondTest.getMonthNumber());
        System.out.println("\n");
        System.out.println((thirdTest.toString()));
        System.out.println(thirdTest.getMonthName());
        System.out.println(thirdTest.getMonthNumber());
    }
}