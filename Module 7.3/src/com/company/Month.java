package com.company;

public class Month {
    private int monthNumber;
    private String monthName;
    private int January = 1;
    public void setMonthNumber(int newMonthNumber) { this.monthNumber = (newMonthNumber); }
    public void setMonthName(String monthName) { this.monthName = monthName; }

    Month() {
        monthNumber = 1;
    }

    Month(int monthNumber) {
        setMonthNumber(monthNumber);

        if (monthNumber >= 1 && monthNumber <= 12) {
            if (monthNumber == 1) { monthName = "January";}
            if (monthNumber == 2) { monthName = "February";}
            if (monthNumber == 3) { monthName = "March";}
            if (monthNumber == 4) { monthName = "April";}
            if (monthNumber == 5) { monthName = "May";}
            if (monthNumber == 6) { monthName = "June";}
            if (monthNumber == 7) { monthName = "July";}
            if (monthNumber == 8) { monthName = "August";}
            if (monthNumber == 9) { monthName = "September";}
            if (monthNumber == 10) { monthName = "October";}
            if (monthNumber == 11) { monthName = "November";}
            if (monthNumber == 12) { monthName = "December";} }
        else monthNumber = 1; }
    Month(String monthName) {
        this.monthName = monthName;
        setMonthName(monthName);
        if (monthName == "January") { monthNumber = 1;}
        if (monthName == "February") { monthNumber = 2;}
        if (monthName == "March") { monthNumber = 3;}
        if (monthName == "April") { monthNumber = 4;}
        if (monthName == "May") { monthNumber = 5;}
        if (monthName == "June") { monthNumber = 6;}
        if (monthName == "July") { monthNumber = 7;}
        if (monthName == "August") { monthNumber = 8;}
        if (monthName == "September") { monthNumber = 9;}
        if (monthName == "October") { monthNumber = 10;}
        if (monthName == "November") { monthNumber = 11;}
        if (monthName == "December") { monthNumber = 12;}
        else monthNumber = 1; }

    //Setters
    //public void setMonthNumber(int monthNumber) { this.monthNumber = monthNumber; }
    //public void setMonthName(String monthName) { this.monthName = monthName; }

    //Getters
    public int  getMonthNumber() { return this.monthNumber; }
    public String getMonthName() { return this.monthName; }

    //To String
    public String toString() {return getMonthName(); }

}