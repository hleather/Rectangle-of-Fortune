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
    public static char currentGuess;
    public static boolean checkRepeat;
    
    public static char guessLetter;
    public static char guessVowel;
    
    public static char[] listOfLetterGuesses = new char[26];
    public static char[] listOfVowelGuesses = new char[26];
    public static char[] vowel = {'A', 'E', 'I', 'O', 'U'};
    public static char[] letter = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
        'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    
    Bank bank = new Bank();
    
    
    public CheckGuess(){
    }
    
    public static char[] checkLetterGuess(){
        Scanner newLetterGuess = new Scanner(System.in);
        
        System.out.println("\n\t-----------------------------------------------");
        System.out.println("\t You have chosen to guess a consonant!");
        System.out.println("\t-----------------------------------------------");
        
        int guessLetterIndex = 0;
        boolean done = false;
        checkRepeat = false;
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
                                + "have to buy a vowel. Try again: ");                        
                    }       
                }
            }
            guessLetter = newLetterGuess.next().toUpperCase().charAt(0);
            
            if (alreadyInLetterList(listOfLetterGuesses, guessLetter)){
                new RfortuneError().displayError("That letter has already been "
                        + "guessed. Try again.");
                continue;
            }
            if (!alreadyInLetterList(listOfLetterGuesses, guessLetter)){
                Game.searchPhrase();          
                done = true;
            }               
            
            CheckGuess.listOfLetterGuesses[guessLetterIndex] = guessLetter;
            guessLetterIndex++;
        }        
        char[] newLetterGuessList = new char[guessLetterIndex];
            for (int i = 0; i < guessLetterIndex; i++){
                newLetterGuessList[i] = CheckGuess.listOfLetterGuesses[i];
            }
            
            newLetterGuessList = CheckGuess.sortLetterList(newLetterGuessList);
            
            return newLetterGuessList;
    }
    
    public static char[] checkVowelGuess(){
        Bank.updateBankVowelPurchase();           
        
        if(Bank.hasEnough)
        {
            Scanner newVowelGuess = new Scanner(System.in);
            
            System.out.println("\n\t-----------------------------------------------");
            System.out.println("\t You have chosen to buy a vowel!");
            System.out.println("\t-----------------------------------------------");
            
            int vowelIndex = 0;
            boolean done = false;
            while (vowelIndex < 10 && !done){
                System.out.println("\tEnter your guess: ");
                char vowelGuess;
                vowelGuess = newVowelGuess.next().toUpperCase().charAt(0);
                
                if (!isVowel(vowel, vowelGuess)){
                    new RfortuneError().displayError("That is not a vowel. "
                            + "Please enter a vowel. ");
                    continue;
                }
                
                if (alreadyInVowelList(listOfVowelGuesses, vowelGuess)){
                    new RfortuneError().displayError("That vowel has already "
                            + "been guessed. Try again.");
                    continue;
                }
                
                CheckGuess.listOfVowelGuesses[vowelIndex] = vowelGuess;
                vowelIndex++;
                
                if (!alreadyInVowelList(listOfVowelGuesses, vowelGuess)){
                    done = true;
                    
                    break;
            }            
            }            
                            
            char[] newVowelGuessList = new char[vowelIndex];
            for (int i = 0; i < vowelIndex; i++){
                newVowelGuessList[i] = CheckGuess.listOfVowelGuesses[i];
            }
            
            newVowelGuessList = CheckGuess.sortVowelList(newVowelGuessList);
                Game.searchPhrase();
                        
            return newVowelGuessList;
        }
        else
            System.out.println("Sorry, you do not have enough money to buy a "
                    + "vowel.");
        return null;
    }
    
    public static char[] sortLetterList(char[] letters){
        char tempLetter;
        boolean notDone = true;
        while(notDone){
            
            notDone = false;
            for (int i = 0; i < letters.length - 1; i++){
               if (letters[i] < letters[i + 1])
               {
                   tempLetter = letters[i];
                   letters[i] = letters[i+1];
                   letters[i+1] = tempLetter;;
                   notDone = true;
               }
            }
        }
        
        return letters;
    }
    public static char[] sortVowelList(char[] vowels){
        char tempVowel;
        boolean notDone = true;
        while(notDone){
            
            notDone = false;
            for (int i = 0; i < vowels.length - 1; i++){
               if (vowels[i] < vowels[i + 1])
               {
                   tempVowel = vowels[i];
                   vowels[i] = vowels[i+1];
                   vowels[i+1] = tempVowel;;
                   notDone = true;
               }
            }
        }
        
        return vowels;
    }
       
    private static boolean alreadyInLetterList(char[] list, char value) {
        for (char valueInList : list){
            if(value == valueInList){
                return true;
            }
        }
        return false;
    }
    
    private static boolean alreadyInVowelList(char[] list, char value) {
        for (char valueInList : list){
            if(value == valueInList){
                return true;
            }
        }
        return false;
    }
    
    private static boolean isVowel(char[] list, char value) {
        for (char valueInList : list){
            if(value == valueInList){
                return true;
            }
        }
        return false;
    }
}
