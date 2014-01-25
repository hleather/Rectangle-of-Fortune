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
    int lengthPhraseCount = 4;     
    Score player;
    Score amountMoney;
    
    int spinWorth(){
        int guessWorth = 100;
        return guessWorth;
    }
    
    public Board() {
    
    }  
    
    public void displaySize() {
        System.out.println("\nThe word or phrase is " + this.lengthPhraseCount 
                + " characters long.");
        System.out.println("\n$" + spinWorth());
        System.out.println("\n" + this.player + " has $" + this.amountMoney);
    }    
}
