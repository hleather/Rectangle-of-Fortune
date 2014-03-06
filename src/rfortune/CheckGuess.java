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
    private static boolean checkRepeat;
    
    private static char guessLetter;
    private static char guessVowel;
    
    private static char[] listOfLetterGuesses = new char[26];
    private static char[] listOfVowelGuesses = new char[26];
    private static char[] vowel = {'A', 'E', 'I', 'O', 'U'};
    private static char[] letter = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
        'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    
    Bank bank = new Bank();
    
    
    public CheckGuess(){
    }
    
    public static char[] checkLetterGuess(){
        Scanner newLetterGuess = new Scanner(System.in);
            
            System.out.println("\n\t-----------------------------------------------");
            System.out.println("\t You have chosen to guess a consonant!");
            System.out.println("\t-----------------------------------------------");
            
            int letterIndex = 0;
            boolean done = false;
            while (letterIndex <= 26 && !done){
                System.out.println("\tEnter your guess: ");
                char letterGuess;
                letterGuess = newLetterGuess.next().toUpperCase().charAt(0);
                CheckGuess.currentGuess = letterGuess;
                
                if (!isVowel(letter, letterGuess)){
                    new RfortuneError().displayError("Sorry, you have to buy "
                            + "a vowel. Guess a letter. ");
                    continue;
                }
                
                if (alreadyInLetterList(listOfLetterGuesses, letterGuess)){
                    new RfortuneError().displayError("That letter has already "
                            + "been guessed. Try again.");
                    continue;
                }
                
                CheckGuess.listOfLetterGuesses[letterIndex] = letterGuess;
                letterIndex++;
                
                if (!alreadyInLetterList(listOfLetterGuesses, letterGuess)){
                    done = true;                    
                    
                    break;
            }            
            }            
                            
            char[] newLetterGuessList = new char[letterIndex];
            for (int i = 0; i < letterIndex; i++){
                newLetterGuessList[i] = CheckGuess.listOfLetterGuesses[i];
            }
            
            newLetterGuessList = CheckGuess.sortLetterList(newLetterGuessList);
                //Game.searchPhrase();
                        
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
                //Game.searchPhrase();
                        
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
