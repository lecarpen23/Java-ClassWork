package com.company;
import java.util.Random;

public class TestArray {
    public static void main(String[] args) {
        int[][] testArr = new int[5][3];

        Random rando = new Random();
        for (int row = 0; row < testArr.length; ++row) {
            for (int col = 0; col < testArr[row].length; ++col) {
                testArr[row][col] = rando.nextInt(10);
                System.out.print(testArr[row][col] + " ");
            }
            System.out.print("\n");
        }
        getTotal(testArr);
        getAvg(testArr);
        getRowTotal(testArr, 1);
        getColumnTotal(testArr, 1);
        getHighestinRow(testArr, 2);
        getLowestinRow(testArr, 3);
    }


    public static int getTotal(int[][] arr) {
        int sum = 0;
        for (int row = 0; row < arr.length; ++row) {
            for (int col = 0; col < arr[row].length; ++col) {
                sum = sum + arr[row][col];
            }
        }
        System.out.println("The total of all the values in the array is: " + sum);
        return sum;
    }

    public static int getAvg(int[][] arr) {
        int sum = 0;
        int count = 0;
        int avg = 0;
        for (int row = 0; row < arr.length; ++row) {
            for (int col = 0; col < arr[row].length; ++col) {
                sum = sum + arr[row][col];
                ++count;
                avg = sum / count;
            }
        }
        System.out.println("The average value of the array is: " + avg);
        return avg;
    }

    public static int getRowTotal(int[][] arr, int userRow) {
        int sum = 0;
        userRow = userRow - 1;
        for (int row = 0; row < arr.length; ++row) {
            for (int col = 0; col < arr[row].length; ++col) {
                if (row == userRow) {
                    sum = sum + arr[userRow][col];
                }
            }
        }
        System.out.println("The total of the values for the row are: " + sum);
        return sum;
    }

    public static int getColumnTotal(int[][] arr, int userCol) {
        int sum = 0;
        userCol = userCol - 1;
        for (int row = 0; row < arr.length; ++row) {
            for (int col = 0; col < arr[row].length; ++col) {
                if (col == userCol) {
                    sum = sum + arr[row][col];
                }
            }
        }
        System.out.println("The total of the values for the column is: " + sum);
        return sum;
    }
    public static int getHighestinRow(int[][] arr, int userRow) {
        int max = 0;
        userRow = userRow - 1;
        for (int row = 0; row < arr.length; ++row) {
            for (int col = 0; col < arr[row].length; ++col) {
                if (row == userRow && max < arr[row][col]) {
                    max = arr[row][col];
                }
            }
        }
        System.out.println("The highest value in the row is: " + max);
        return max;
     }



    public static int getLowestinRow(int[][] arr, int userRow) {
        int min = 100;
        userRow = userRow - 1;
        for (int row = 0; row < arr.length; ++row) {
            for (int col = 0; col < arr[row].length; ++col) {
                if (row == userRow && min > arr[row][col]) {
                    min = arr[row][col];
                }
            }
        }
        System.out.println("The lowest value in the row is: " + min);
        return min;
    }
}
