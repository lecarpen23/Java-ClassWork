package com.company;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(in);
        out.println("Type the first persons name: ");
        String name1 = keyboard.nextLine();

        Scanner keyboard2 = new Scanner(in);
        out.println("What is " + name1 + "'s age?");
        int age1 = Integer.parseInt(keyboard2.nextLine());

        Scanner keyboard3 = new Scanner(in);
        out.println("Type the second persons name: ");
        String name2 = keyboard3.nextLine();

        Scanner keyboard4 = new Scanner(in);
        out.println("What is " + name2 + "'s age?");
        int age2 = Integer.parseInt(keyboard4.nextLine());

        Scanner keyboard5 = new Scanner(in);
        out.println("Type the third persons name: ");
        String name3 = keyboard5.nextLine();

        Scanner keyboard6 = new Scanner(in);
        out.println("What is " + name3 + "'s age?");
        int age3 = Integer.parseInt(keyboard6.nextLine());


        keyboard.close();

        if ((age1 > age2) && (age1 > age3)) {
            if (age2 > age3)
                System.out.println(name1 + " is the oldest, " + name2 + " is the second oldest" + ", and " + name3 + " is the youngest.");
            else {
                System.out.println(name1 + " is the oldest, " + name3 + " is the second oldest" + ", and " + name2 + " is the youngest.");
            }
        }
        if ((age1 < age2) && (age1 < age3)) {
            if (age2 > age3)
                System.out.println(name1 + " is the youngest, " + name2 + " is the oldest" + " ,and " + name3 + " is the second oldest.");
            else {
                System.out.println(name1 + "is the youngest, " + name3 + " is the oldest" + " ,and " + name2 + " is the second oldest.");
            }
        }
        else{
            if (age2 > age3){
                System.out.println(name2 + " is the oldest, " + name1 + " is the second oldest" + ", and " + name3 + " is the youngest.");
            }
            else {
                System.out.println(name3 + " is the oldest, " + name1 + " is the second oldest" + ", and " + name2 + " is the youngest.");
            }

        }


        }
    }