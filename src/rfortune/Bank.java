/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

/**
 *
 * @author Laura
 */
public class Bank {
    
    String name;
    long rGuesses = 0;
    long wGuesses = 0;
    int amountMoney = 0;
    
    public Bank(){   
        
    }
    
    public void displayPlayer1(){
        System.out.println("\n\tHello" + this.name + "you currently have"
            + this.amountMoney +"money.");
    }
}

    