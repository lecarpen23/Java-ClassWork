package com.company;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Hangman {
    public String disguisedWord;
    private String secretWord;
    private String secretWord2;
    private int guesses;
    private int wrongGuesses;

    //Constructor
    Hangman() {
        secretWord = "abracadabra";
        disguisedWord = "***********";
        MakeGuess();}
    public void MakeGuess() {
        Scanner guess = new Scanner(System.in);
        System.out.println("Guess a letter: ");
        String guess1 = guess.next();
        //System.out.println(guess1);
        for (int i = 0; i <= secretWord.length(); i++) {
            if (i < secretWord.length() && secretWord.charAt(i) == guess1.charAt(0)) {
                char newChar = secretWord.charAt(i);
                disguisedWord = disguisedWord.substring(0,i)
                +newChar + disguisedWord.substring(i + 1); }

            else if (i < secretWord.length() && secretWord.charAt(i) != guess1.charAt(0)) { continue; }
            else if  (i >= secretWord.length()) {
                ++guesses;
                System.out.println("Guess number: " + getGuessCount()); }
        }
        if (disguisedWord.equalsIgnoreCase(getSecretWord())) {
            System.out.println("Congrats, you won! The word was " + getSecretWord() + ".");
            System.exit(0); }
        MakeGuess();







    }
    public String getDisguisedGuess() {
        return "blank";
    }
    public String getSecretWord() {
        return secretWord;
    }
    public int getGuessCount() {
        return guesses;
    }
    public String isFound() {
        return "Congrats you guessed the right word: " + secretWord;
    }
}

