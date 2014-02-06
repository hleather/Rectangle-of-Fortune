/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

/**
 *
 * @author Heather
 */
public class Board {
    int lengthPhraseCount = 14;     
    int amountMoney = 150;
    
public int spinWorth(){
        int guessWorth = 100;
        return guessWorth;
}
    
    public Board() {
    
    }  
    
    public void displaySize() {
        System.out.println("\nThe word or phrase is " + this.lengthPhraseCount 
                + " characters long.");
        System.out.println("\nIf you guess correctly, you get $" + spinWorth());
        System.out.println("\nPlayer 1 has $" + this.amountMoney);
    }    
}
