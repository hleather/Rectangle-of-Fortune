/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class BoardView {
    
   public void defaultDisplayBoard(){
       System.out.println("_ _ _  _ _  _ _ _");
   }
   
    
    
    public static void searchPhrase(){
        String phrase[] = {"H","o","p","o","n","P","o","p"};
        String parallel[] = {"_","_","_","_","_","_","_","_"};
        boolean foundMatch = false;
        
    System.out.println("Please enter your guess.");
    Scanner input = new Scanner(System.in);
     String guess = input.next().toUpperCase();
          
    for(int i = 0; i  < phrase.length; i++){
        if(phrase[i].equals(guess)){
            parallel[i] = guess;
            foundMatch = true;
        }
    }
    if(foundMatch)
        System.out.println("You have a match.");
    for (int i = 0; i< parallel.length; i++) {
           System.out.println(parallel[i]);
       }
    if(!foundMatch)
        new RfortuneError().displayError("That is not in the phrase. Your turn is over.");
       
    }
    
}
  
