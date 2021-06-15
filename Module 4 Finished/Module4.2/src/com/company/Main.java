package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);
        out.println("What is your name: ");
        String name = keyboard.nextLine();

        Scanner keyboard2 = new Scanner(in);
        out.println("What is your hourly wage: ");
        Double pay = Double.parseDouble(keyboard2.nextLine());

        Scanner keyboard3 = new Scanner(in);
        out.println("How many hours did you work: ");
        Double hours = Double.parseDouble(keyboard3.nextLine());

        Double overTime = pay * 1.5;
        Double wages = pay * hours;

        if (hours < 40){
            System.out.println(name + " made " + wages + " dollars this week.");
        }
        if (hours > 40){
            Double wages2 = ((pay * 40) + ((hours - 40) * overTime));
            System.out.println(name + " made " + wages2 + " dollars this week.");
        }
    }
}
