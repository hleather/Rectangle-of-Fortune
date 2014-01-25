/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

// We will import the design or layout of the game and have the code here

/**
 *
 * @author Heather
 */
public class Board {
    int wordCount; // This needs to be an equation or command that counts the 
                   // amount of letters in the current word or phrase.
    
    String playerName1;
    String playerName2;
    int bank1;
    int bank2;
    
    // Location[][] letterLocations; This code will determine the location of 
    // the letter guessed.
    
    // This class will also include the buttons that will display on the screen:
    // Guess puzzle button
    // Spin button
    // Vowel button
    // Pause/Exit button
    
    int spinButton(){
        int guessWorth; // This would select a random amount of money (using 
                        // some equation or code) that would
                        // be awarded to the player whose turn it is if they
                        // guessed a letter that was in the word/phrase.
        return guessWorth;
    }
    public Board() {
    }
    
    
    public void displaySize() {
        System.out.println("\nThe word or phrase is " + this.wordCount 
                + " long.");
        System.out.println("\n$" + spinButton());
    }
    
}
