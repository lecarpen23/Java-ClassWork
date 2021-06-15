package com.company;

public class Movie {
    private String name;
    private String mpaaRating;
    private int rating;
    private int allRatings[];


    //Constructor
    Movie(String name, String mpaaRating, int rating) {
        this.name = name;
        this.mpaaRating = mpaaRating;
        this.rating = rating; }

        // GETTER
        public String getName () {
            return this.name;
        }
        public String getMpaaRating () {
            return this.mpaaRating;
        }
        public int getRating () {
            return this.rating;
        }

        // SETTER
        public void setName (String newName){
            this.name = newName;
        }
        public void setMpaaRating (String newMpaa){
            this.mpaaRating = newMpaa; }
        public void setRating (int newRating){
            this.rating = newRating;
        }
        //toString
        public String toString () {
            return getName() + " has a MPAA rating of " + getMpaaRating() + ", and a rating of " + getRating() + " stars.";
        }
    }