package com.company;
import java.util.ArrayList;
import java.util.Random;

public class MovieTest {
    public static void main(String[] args) {
        Movie spiderMan = new Movie("SpiderMan", "PG-13", 0);
        spiderMan.setName("The Amazing Spider-Man");
        spiderMan.setMpaaRating("PG");

        Random rand = new Random();
        int newSum = 0;
        ArrayList<Integer> newArr = new ArrayList();
        for (int i = 1; i <= 6; i++) {
            int value = rand.nextInt(5);
            value = value + 1;
            newSum = value + newSum;
            System.out.println(value);
            newArr.add(value);
            System.out.println(newArr);
            int rating1 = (newSum / i);
            System.out.println("\n");
            System.out.println("Spider Man has a rating of: " + rating1);
            spiderMan.setRating(rating1);

        }
        //Showing that the get methods and toString method works.
        System.out.println("\n");
        System.out.println(spiderMan.getName());
        System.out.println(spiderMan.getMpaaRating());
        System.out.println(spiderMan.getRating());
        System.out.println("\n");
        System.out.println(spiderMan.toString());


    }
}

