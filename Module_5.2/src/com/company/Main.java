package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String userInput = keyboard.nextLine();
        for (int i = 0; i < userInput.length(); i++) {
            System.out.println(userInput.charAt(i));
        }
    }
}
