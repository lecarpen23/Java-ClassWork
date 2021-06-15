package com.company;
import java.lang.*;

public class Die {

    public int value;

    //Constructor
    Die() {
        int max = 6;
        int min = 1;
        int randomInt = (int) (Math.random() * (max - min + 1) + min);
        this.value = randomInt;
    }

    public int getValue() {
        return this.value;
    }
}

