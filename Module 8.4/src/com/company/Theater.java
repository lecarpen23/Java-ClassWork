package com.company;
import java.util.Scanner;

public class Theater {
    public static void main(String[] args) {
        int price;
        int usersRow;
        int usersCol;
        int[][] seats = new int[9][10];
        int[][] movieSeats = new int[9][10];

        for (int row = 0; row < seats.length; ++row) {
            for (int col = 0; col < seats[row].length; ++col) {
                if (row <= 2) seats[row][col] = 10;
                if (row > 2 && row <= 5 && col <= 1) seats[row][col] = 10;
                if (row > 2 && row <= 5 && col >= 8) seats[row][col] = 10;
                if (row > 2 && row <= 5 && col > 1 && col < 8) seats[row][col] = 20;
                if (row == 6 && col <= 1 || col >= 8 && row == 6) seats[row][col] = 20;
                if (row == 6 && col == 2 || row == 6 && col == 3 || row == 6 && col == 6 || row == 6 && col == 7)
                    seats[row][col] = 30;
                if (row == 6 && col == 4 || row == 6 && col == 5) seats[row][col] = 40;
                if (row == 7 && col == 0 || row == 7 && col == 9) seats[row][col] = 20;
                if (row == 7 && col > 0 && col < 3 || row == 7 && col < 9 && col > 6) seats[row][col] = 30;
                if (row == 7 && col == 3 || row == 7 && col == 6) seats[row][col] = 40;
                if (row == 7 && col >= 4 && col <= 5) seats[row][col] = 50;
                if (row > 7) seats[row][col] = 50;
                if (row > 7 && col == 1 || row > 7 && col == 8) seats[row][col] = 40;
                if (row > 7 && col == 0 || row > 7 && col == 9) seats[row][col] = 30;


            }
        }
        for (int row = 0; row < seats.length; ++row) {
            for (int col = 0; col < seats[row].length; ++col) {
                System.out.print(seats[row][col] + " ");
            }
            System.out.print("\n");
        }
        System.out.println();
        for (int row = 0; row < seats.length; ++row) {
            for (int col = 0; col < seats[row].length; ++col) {
                movieSeats[row][col] = seats[row][col];
                //System.out.print(movieSeats[row][col] + " ");
            }
            //System.out.print("\n");
        }
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        String in;
        System.out.println("Do you want to pick by seat or price? Type S for seat or $ for price. ");
        in = sc.next();
        int userPrice;
        //while counter is an arbitrary limit to end the code. In real life it could be a time or button maybe.
        while (counter < 4) {
            if (in.equalsIgnoreCase("S")) {
                System.out.println("Pick your row (top being 1): ");
                usersRow = (sc.nextInt() - 1);
                System.out.println("Pick your column (left being 1): ");
                usersCol = (sc.nextInt() - 1);

                if (usersRow < 0 || usersRow > 8 || usersCol < 0 || usersCol > 9) {
                    System.out.println("Error: Out of range, there are 9 rows and 10 columns. ");
                }

                if (movieSeats[usersRow][usersCol] != 0) {
                    System.out.print("Price: " + movieSeats[usersRow][usersCol]);
                    movieSeats[usersRow][usersCol] = 0;
                } else if (movieSeats[usersRow][usersCol] == 0)
                    System.out.println("That seat is taken, please choose another.");
                System.out.println();
                counter = ++counter;
            }
            int counter2 = 0;
            if (in.equals("$")) {
                System.out.println("Price options are 10, 20, 30, 40, and 50. Please type the price you want.");
                userPrice = sc.nextInt();
                if (userPrice != 10 && userPrice != 20 && userPrice != 30 && userPrice != 40 && userPrice != 50) {
                    System.out.println("Error, price not available");
                    continue;
                }
                for (int row = 0; row < seats.length; ++row) {
                    for (int col = 0; col < seats[row].length; ++col) {
                        if (movieSeats[row][col] == userPrice) {
                            System.out.print(movieSeats[row][col] + " ");
                        }
                        if (movieSeats[row][col] != userPrice) {
                            System.out.print("X ");
                        }
                        //System.out.print(movieSeats[row][col] + " ");
                    }
                    System.out.println();
                }

                for (int row = 0; row < seats.length; ++row) {
                    for (int col = 0; col < seats[row].length; ++col) {
                        while (counter2 < 1) {
                            System.out.println("Select a seat based on whats available at your price. ");
                            System.out.println("Pick your row (top row being 1): ");
                            usersRow = (sc.nextInt() - 1);
                            System.out.println("Pick your column (left column being 1): ");
                            usersCol = (sc.nextInt() - 1);

                            if (usersRow < 0 || usersRow > 8 || usersCol < 0 || usersCol > 9) {
                                System.out.println("Error: Out of range, there are 9 rows and 10 columns. ");
                            }

                            if (movieSeats[usersRow][usersCol] != 0) {
                                movieSeats[usersRow][usersCol] = 0;
                            } else if (movieSeats[usersRow][usersCol] == 0) {
                                System.out.println("That seat is taken, please choose another.");
                            }
                            ++counter2;
                            ++counter;
                            System.out.println();
                        }
                    }
                }
            }
        }
        //Test to make sure seats that were chosen are unavailable
        for (int row = 0; row < seats.length; ++row) {
            for (int col = 0; col < seats[row].length; ++col) {
                System.out.print(movieSeats[row][col] + " ");
            }
            System.out.println();
        }
    }
}
