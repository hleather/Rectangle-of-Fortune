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
 * @author Laura and Heather
 */
public class BoardView {
    static char[] charArray;
    static char[] parallelCharArray;
    static char guess = 'P';
    
    /***************************************************************************
     * getPhrase(). gets the current random phrase from  *** and translates it
     * into a character array in order to be used in the game process.
     * @param setPhrase
     **************************************************************************/
    public void getPhrase(String setPhrase){  
        String phrase = setPhrase;
        charArray = phrase.toCharArray();
        System.out.println("Character Array: " + Arrays.toString(charArray));           
    }
    
    /***************************************************************************
     * getParallelPhrase(). gets the parallel phrase of the randomly selected
     * current phrase from WordsAndPhrases and translates it into a character 
     * array in order to be used in the game process.
     * @param setParallelArray
     **************************************************************************/
    public void getParallelPhrase(String setParallelArray){
        setParallelArray = "--- -- ---";
        String parallelArray = setParallelArray;
        parallelCharArray = parallelArray.toCharArray();
        System.out.println("Parallel Character Array: " + 
                Arrays.toString(parallelCharArray));
    }
    
    /***************************************************************************
     * defaultDisplayBoard(). gets the parallel phrase of the randomly selected
     * current phrase from WordsAndPhrases and displays it on the screen for the 
     * players to view.
     * @param setParallelArray
     **************************************************************************/
    public void defaultDisplayBoard(String setParallelArray){
        setParallelArray = "--- -- ---";
        String parallelArray = setParallelArray;
        System.out.println("Default Display: " + parallelArray);
    }
    
    /***************************************************************************
     * getCharGuess(). gets the letter guess from the user and stores it as a
     * char variable. This function will be called from GameMenuControl.
     **************************************************************************/
    public void getCharGuess(){
        Scanner charGuess = new Scanner(System.in);    
        System.out.println("Please enter your guess.");
        String newGuess = charGuess.next().toUpperCase();
        guess = newGuess.charAt(0);
    }    
}

