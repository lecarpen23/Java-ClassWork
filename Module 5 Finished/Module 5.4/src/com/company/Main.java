package com.company;

public class Main {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(counter * i + " ");
            }
            System.out.println("\n");
            counter++;
        }


    }
}
