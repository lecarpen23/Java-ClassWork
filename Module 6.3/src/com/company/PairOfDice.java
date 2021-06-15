package com.company;
import java.lang.*;

public class PairOfDice {

    public Die dieA;
    public Die dieB;

    //Constructor
    PairOfDice(Die a, Die b) {
        this.dieA = a;
        this.dieB = b;
    }

    // get individual
    public int getFirstDie() {
        return this.dieA.value;
    }

    public int getSecondDie() {
        return this.dieB.value;
    }

    // set individual
    public void setFirstDie(int newVal) {
        if (1 <= newVal && newVal <= 6) {
            this.dieA.value = newVal;
        } else System.out.println("ERROR: die value must be between 1-6");
    }

    public void setSecondDie(int newVal) {
        if (1 <= newVal && newVal <= 6) {
            this.dieB.value = newVal;
        } else System.out.println("ERROR: die value must be between 1-6");
    }

    // roll dice
    public static void rollDice(Die dieA, Die dieB) {
        int max = 6;
        int min = 1;
        dieA.value = (int) (Math.random() * (max - min + 1) + min);
        dieB.value = (int) (Math.random() * (max - min + 1) + min);
    }

    public int getSum() {
        int total = this.dieA.value + this.dieB.value;
        return total;
    }
}



