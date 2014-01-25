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
public class Letters {
    Score player;
    String guess = "c";
    String wGuesses;
    
    public Letters() {
        
    }
    
    public void getGuess() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your guess: ");
        this.guess = input.next();
    }
    
    public void displayLetter() { 
        if (this.guess != null) {
            System.out.println(this.player.guess + " is correct!");
        }
        else {
            System.out.println("Sorry " + this.guess + " is incorrect.");
        }
    }
    
    
    
}
