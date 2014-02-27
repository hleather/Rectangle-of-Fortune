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

    
    
    public Letters() {
        
}
    
 
        
        
  
  //********************************************************************
  //This is commented out until we run the other determineVowel function
  //to ensure it is working properly.
  //*********************************************************************
 
 /*public String determineVowel(){
     
     String boundaryCheck = "A";
     String vowelGuess = null;
     boolean valid = false;
     Scanner input = new Scanner(System.in);
     String vowel1 = "A";     
     String vowel2 = "E";        
     String vowel3 = "I";        
     String vowel4 = "O";        
     String vowel5 = "U";
        

     
        while(!valid)
        {                  
            System.out.println("Please enter a vowel: ");
            vowelGuess = input.next().toUpperCase();
        
            if ((!vowelGuess.equals(vowel1)) & (!vowelGuess.equals(vowel2)) & 
                (!vowelGuess.equals(vowel3)) & (!vowelGuess.equals(vowel4)) & 
                (!vowelGuess.equals(vowel5)))
            {
                
                new RfortuneError().displayError("That value is invalid.");
                continue;
            }

        if (boundaryCheck.equals(vowelGuess))
        {
           new RfortuneError().displayError("That letter has already been guessed. Try again.");  
           continue;
        }
        valid = true;
        }
        return vowelGuess;
 }*/
 


}