package com.company;

public class RollingDice2 {

    public static void main(String[] args) {
        Die dieA = new Die();
        Die dieB = new Die();
        System.out.println("Die A: " + dieA.getValue());
        System.out.println("Die B: " + dieB.getValue());
        PairOfDice testPair = new PairOfDice(dieA, dieB);
        System.out.println("Current sum: " + testPair.getSum());
        System.out.println("Roll dice...");
        PairOfDice.rollDice(dieA, dieB);
        System.out.println("Die A: " + dieA.getValue());
        System.out.println("Die B: " + dieB.getValue());
        System.out.println("Current sum: " + testPair.getSum());
        System.out.println("Die A value: " + testPair.getFirstDie());
        System.out.println("Die B value: " + testPair.getSecondDie());
        testPair.setFirstDie(7);
        System.out.println("Die A value: " + testPair.getFirstDie());
        testPair.setFirstDie(5);
        System.out.println("Die A value: " + testPair.getFirstDie());
    }
}
