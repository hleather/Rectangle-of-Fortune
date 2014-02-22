/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class BoardView {
    static char[] charArray;
    static char[] parallelCharArray;
    static char guess = 'P';
    
   public void getPhrase(String setPhrase){  
       setPhrase = "HOPONPOP";
       String phrase = setPhrase;
        charArray = phrase.toCharArray();
        System.out.println("Character Array: " + Arrays.toString(charArray));           
    }
   
   public void getParallelPhrase(String setParallelArray){
       setParallelArray = "--- -- ---";
       String parallelArray = setParallelArray;
       parallelCharArray = parallelArray.toCharArray();
       System.out.println("Parallel Character Array: " + Arrays.toString(parallelCharArray));
   }
   public void defaultDisplayBoard(String setParallelArray){
       setParallelArray = "--- -- ---";
       String parallelArray = setParallelArray;
       System.out.println("Default Display: " + parallelArray);
   }
       
    public void getCharGuess(){
        Scanner charGuess = new Scanner(System.in);    
        System.out.println("Please enter your guess.");
        String newGuess = charGuess.next().toUpperCase();
        guess = newGuess.charAt(0);
    }
   
}
  
