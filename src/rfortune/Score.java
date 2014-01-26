/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.util.Scanner;

/**
 *
 * @author Heather
 */
public class Score {
    Player player1;
    Player player2;
    Player player3;
    long rGuesses = 0;
    long wGuesses = 0;
    long phrasesCompleted = 0;
    String guess;
    String answer1;
    String answer2;
    String answer3;
    
    public Score() {
    }
        
    public void getAnswer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to see your scores? "
                + "(yes or no): ");
        this.answer1 = input.next();            
        }
   
   
    public void displayScore() {
        switch (this.answer1) {
            case "yes":
            {
                System.out.println("You have guessed letters correctly " + 
                        this.rGuesses + " times. \nYou have guessed letters " + 
                        "incorrectly " + this.wGuesses + " times."
                        + "\nYou have guessed the correct"
                        + " phrase " + this.phrasesCompleted + " times.");
            }
            case "no":
            {
                System.out.println(" ");
            }
        }
    }
    }
