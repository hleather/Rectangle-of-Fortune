/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.util.Scanner;

/**
 * THESE (FUNCTIONS) ONLY CHECK TO SEE IF THE CONSONANT OR VOWEL IS A REPEAT AND
 * RETURNS A BOOLEAN VALUE. 
 * THIS CLASS HAS A VARIABLE THAT STORES THE CURRENT GUESS FOR EASY REFERENCE
 * AND A BOOLEAN THAT CAN BE USED TO DETERMINE WHETHER OR NOT TO RUN 
 * SEARCHPHRASE().
 * @author Heather
 */
public class CheckGuess {
    public static char currentGuess = 'j';
    public static boolean checkRepeat;
    
    public static char guessLetter;
    public static char guessVowel;
    
    public static char[] listOfLetterGuesses = new char[21];
    public static char[] listOfVowelGuesses = new char[5];
    public char[] vowel = {'A', 'E', 'I', 'O', 'U'};
    public char[] letter = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
        'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    
    Bank bank = new Bank();
    
    
    
    public CheckGuess(){
    }
    
    public String[] checkLetterGuess(){
        Scanner newLetterGuess = new Scanner(System.in);
        
        System.out.println("\n\t-----------------------------------------------");
        System.out.println("\t You have chosen to guess a consonant!");
        System.out.println("\t-----------------------------------------------");
        
        int guessLetterIndex = 0;
        boolean done = false;
        boolean checkLetter = false;
        
        while (guessLetterIndex <= 26 && !done){
            System.out.println("\tEnter your guess: ");
            if (!checkLetter)
            {
                for (int letterCheck = 0; letterCheck < vowel.length; letterCheck++)
                {
                    if (guessLetter == vowel[letterCheck])
                    {
                        new RfortuneError().displayError("\tSorry, you "
                                + "have to buy a vowel.");
                        System.out.println("\tEnter your guess: ");
                    }       
                }
            }
            guessLetter = newLetterGuess.next().toUpperCase().charAt(0);
            
            if (alreadyInLetterList(listOfLetterGuesses, guessLetter)){
                new RfortuneError().displayError("That letter has already been "
                        + "guessed. Try again.");
                continue;
            }
            CheckGuess.listOfLetterGuesses[guessLetterIndex] = guessLetter;
            guessLetterIndex++;
        }
        
        CheckGuess.currentGuess = guessLetter;
        
        return null;
    }
    private boolean alreadyInLetterList(char[] letterList, char letterValue) {
        for (char valueInLetterList : letterList){
            if(letterValue == valueInLetterList){
                return true;
            }
        }
        return false;
    }
    
    public String[] checkVowelGuess(){
        bank.updateBankVowelPurchase();
        if(Bank.hasEnough){   
        Scanner newVowelGuess = new Scanner(System.in);
        
        System.out.println("\n\t-----------------------------------------------");
        System.out.println("\t You have chosen to buy a vowel!");
        System.out.println("\t-----------------------------------------------");
        
        int guessVowelIndex = 0;
        boolean done = false;
        boolean checkVowel = false;
        
        while (guessVowelIndex <= 26 && !done){
            System.out.println("\tEnter your guess: ");
            if (!checkVowel)
            {
                for (int vowelCheck = 0; vowelCheck < letter.length; vowelCheck++)
                {
                    if (guessVowel == letter[vowelCheck])
                    {
                        new RfortuneError().displayError("That is not a "
                                + "vowel. Please enter a vowel (Y is not a "
                                + "vowel in this game).");
                        System.out.println("\tEnter your guess: ");
                    }       
                }
            }
                guessVowel = newVowelGuess.next().toUpperCase().charAt(0);
            
                      
            
            if (alreadyInVowelList(listOfVowelGuesses, guessVowel)){
                new RfortuneError().displayError("That letter has already been "
                        + "guessed. Try again.");
                continue;
            }
            CheckGuess.listOfVowelGuesses[guessVowelIndex] = guessVowel;
            guessVowelIndex++;
        }
        }
        else
            System.out.println("Sorry, you do not have enough money to buy a "
                    + "vowel.");
        
        CheckGuess.currentGuess = guessVowel;
        
        return null;
    }
    private boolean alreadyInVowelList(char[] vowelList, char vowelValue) {
        for (char valueInVowelList : vowelList){
            if(vowelValue == valueInVowelList){
                return true;
            }
        }
        return false;
    }
    
}