package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);
        out.println("What is your annual income?");
        Double income = Double.parseDouble(keyboard.nextLine());

        if (income < 50000){
            Double incomeTax1 = (.01 * income);
            System.out.println("Your income tax due for this year is " + incomeTax1);
        }

        if ((income > 50000) && (income <= 75000)) {
            Double incomeTax2 = (500 + ((income - 50000) * .02));
            System.out.println("Your income tax due for this year is " + incomeTax2);
        }

        if ((income > 75000) && (income <= 100000)) {
            Double incomeTax3 = (1000 + ((income - 75000) * .03));
            System.out.println("Your income tax due for this year is " + incomeTax3);
        }

        if ((income > 100000) && (income <= 250000)) {
            Double incomeTax4 = (1750 + ((income - 100000) * .04));
            System.out.println("Your income tax due for this year is " + incomeTax4);
        }

        if ((income > 250000) && (income <= 500000)) {
            Double incomeTax5 = (7750 + ((income - 250000)* .05));
            System.out.println("Your income tax due for this year is " + incomeTax5);
        }

        if (income > 500000) {
            Double incomeTax6 = (20250 + ((income - 500000)) * .06);
            System.out.println("Your income tax due for this year is " + incomeTax6);
        }
    }
}
