package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard2 = new Scanner(in);
        out.println("Enter a number for the month: ");
        int month = Integer.parseInt(keyboard2.nextLine());

        int evenOrOdd = month % 2;

        if ((month > 12) || (month < 1)) {
            System.out.println("Error: Please input a number between 1 and 12. (1 for Jan, 2 for Feb, etc.) ");
            System.exit(0);
        }

        if(month == 2){
            System.out.println("There a 28 days this month. Unless it's a leap year, then there are 29 days.");
            System.exit(0);
        }
        if (((month <= 8) && (evenOrOdd != 0)) || ((month >= 8) && (evenOrOdd == 0))){
            System.out.println("There are 31 days this month. ");
        }
        if (((month > 8) && (evenOrOdd != 0)) || ((month < 8) && (evenOrOdd == 0))){
            System.out.println("There are 30 days this month. ");
        }
    }
}
