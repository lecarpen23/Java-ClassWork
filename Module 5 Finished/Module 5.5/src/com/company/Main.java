package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < 100; i++) {
            int random = (int)(Math.random() * (4));

            if (random == 0) y += 1;

            if (random == 1) y -= 1;

            if (random == 2) x += 1;

            if (random == 3) x -= 1;
        }
        System.out.println("(" + x + "," + y +")");

    }
}
