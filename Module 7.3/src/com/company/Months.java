package com.company;

//Dont think this problem was meant to use a enum so please disregard.
public enum Months {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(2),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private int value;
    private Months(int value){
        this.value = value;
    }
}

