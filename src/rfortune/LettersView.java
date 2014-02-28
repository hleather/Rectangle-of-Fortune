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
public class LettersView {
    public static String[] listOfLetterGuesses = new String[21];
    public String[] vowel = {"A", "E", "I", "O", "U"};

 public String[] getInput(){
        Scanner inFile = new Scanner(System.in);
        String[] vowel = {"A", "E", "I", "O", "U"};
        
        System.out.println("\n\t-----------------------------------------------");
        System.out.println("\t You have chosen to guess a consonant!");
        System.out.println("\t-----------------------------------------------");
        
        int guessIndex = 0;
        boolean done = false;
        boolean checkVowel = true;
        boolean checkRepeat = false;
        while (guessIndex <= 21 && !done && checkVowel){
            System.out.println("\tEnter your guess: ");
            String guessLetter;
            guessLetter = inFile.nextLine();
            guessLetter = guessLetter.trim();            
                            
            if (alreadyInList(listOfLetterGuesses, guessLetter)){
                new RfortuneError().displayError("That letter has already been "
                         + "guessed. Try again.");
                continue;
            }
            
            for (int vowelCheck = 0; vowelCheck < vowel.length; vowelCheck++)
            {
                if (guessLetter.equals(vowel[vowelCheck]))
                {
                    new RfortuneError().displayError("\tSorry, you have to buy a "
                            + " vowel.");
                    checkVowel = false;
                }       
            }
            
            this.listOfLetterGuesses[guessIndex] = guessLetter;
            guessIndex++;
        }   
    return null;
 }
private boolean alreadyInList(String[] list, String value) {
    for (String valueInList : list){
        if(value.equals(valueInList)){
            return true;
        }
    }
return false;
}
}

