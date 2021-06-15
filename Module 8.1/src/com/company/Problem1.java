package com.company;
import java.util.Random;
import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            Random rando = new Random();
            arr[i] = rando.nextInt(100);
            //System.out.println(arr[i]);
        }
        int last = arr.length - 1;

        String arrString = Arrays.toString(arr);
        System.out.println(arrString);
        int sum = 0;
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
            if (i % 2 == 0){
                System.out.print(arr[i]);
                sumEven = arr[i] + sumEven;
                if (i < arr.length - 2) System.out.print(", ");
            }
            if (i % 2 != 0) {
                sumOdd = arr[i] + sumOdd;
            }
        }
        System.out.println("\n");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { System.out.print((arr[i]) + ", "); }
        }

        System.out.println("\n");

        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println("\n");
        System.out.println("First: " + arr[0] + " Last: " + arr[last]);
        //System.out.println("\n");

        int max = -1;
        for (int j : arr) {
            if (max == j) System.out.println("There is more than one max.");
            if (max < j) max = j;
        }
        System.out.println("The max is " + max + ".");

        int min = 101;
        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) System.out.println("There is more than one min.");
            if (min > arr[i]) min = arr[i];
        }
        System.out.println("The min is " + min + ".");
        System.out.println("The sum is " + sum + ".");
        System.out.println("The alternating sum is " + (sumEven - sumOdd) + ".");

    }
}
