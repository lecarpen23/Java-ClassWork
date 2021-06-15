package com.company;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);
        out.println("Enter the year:");
        int theYear = Integer.parseInt(keyboard.nextLine());

        keyboard.close();

        int var1 = theYear % 4;
        int var2 = theYear % 100;

        if ((var1 == 0) && (var2 != 0)){
            System.out.println("It's a leap year.");
        }
        else{
            System.out.println(("It's not a leap year. "));
        }

    }
}

