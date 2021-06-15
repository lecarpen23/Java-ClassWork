package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many captions do you have? ");
        int size = sc.nextInt();
        String[] captions = new String[size];
        System.out.println("Enter your " + size + " captions: ");
        for (int i = 0; i < size; i++) {
            captions[i] = sc.next();
        }

        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the data (an integer) for " + captions[i] + ":");
            data[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(captions));
        System.out.println(Arrays.toString(data));

        System.out.println("Enter the maximum value possible: ");
        Double maxPos = sc.nextDouble();
        for (int i = 0; i < size; i++) {
            Double scale = (maxPos/data[i]);
            Double asterDouble = (40/scale);
            int asterInt = asterDouble.intValue();
            //System.out.println(asterInt);


            System.out.print(captions[i]);
            for (int j = 1; j <= asterInt; j++) {
                System.out.print("*");
                if (j == asterInt) System.out.print("("+ j +")");
            }
            System.out.println();
        }


    }
}
