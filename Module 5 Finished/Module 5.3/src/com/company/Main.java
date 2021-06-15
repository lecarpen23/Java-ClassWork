package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the integer for the Fibonacci sequence: ");
        int counter = keyboard.nextInt();
        int fold1 = 1;
        int fold2 = 1;
        int newFold = fold1 + fold2;

        for (int i = 0; i < counter; i++) {
            newFold = (fold1 + fold2);
            fold2 = fold1;
            fold1 = newFold;

        }
        System.out.print(newFold);
    }
}
