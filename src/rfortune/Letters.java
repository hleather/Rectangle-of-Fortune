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
    static String guess = "c";
    
    
    public Letters() {
        
}
    
    public void getGuess() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your guess: \n\tHint = code ");
        guess = input.next();
    }
    
    public void displayLetter() { 
        if ("code".equals(guess)) {
                System.out.println("code is correct!");
            }
        else {
                System.out.println("Sorry " + guess + " is incorrect.");
            }
        }
    
    
    
}
