/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.util.Scanner;

/**
 *
 * @author Heather and Laura
 */
public class Game {
    public static int roundNumber = 0;
    public static int correctGuesses = 0;   
    public static String guessLetter;
        
    
    public Game(){
        
}
    
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
    
    public void buyAVowel(){
        //I will include this once we have a current score created.
        //if(currentScore < 250) {
            new RfortuneError().displayError("You do not have enough money to"
                    + "buy a vowel.");
            //Place code here to return to the playerTurnFunction and stop the 
            //rest of this code from running.
       // }
        char vowel1 = 'a';
        int newVowel1 = (int)('a');
        char vowel2 = 'e';
        int newVowel2 = (int)('e');
        char vowel3 = 'i';
        int newVowel3 = (int)('i');
        char vowel4 = 'o';
        int newVowel4 = (int)('o');
        char vowel5 = 'u';
        int newVowel5 =(int)('u');
        int currentScore = 500;
        //int currentScore = Bank.currentScore;
        
        String newVowel;
        
        
        Scanner vowelGuess = new Scanner(System.in);
        System.out.println("Please enter a vowel:");
        newVowel = vowelGuess.next();
        char checkVowel = newVowel.charAt(0);
       
        if ((checkVowel != newVowel1) & (checkVowel != newVowel2) & 
                (checkVowel != newVowel3) & (checkVowel != newVowel4) & 
                (checkVowel != newVowel5)){
             System.out.println(newVowel + " is invalid. \nPlease enter a vowel.");
        }else{
            int newScore = currentScore - 250;
            //return newScore;
            System.out.println("\tYour new score is " + newScore);   
        }
    }
    
    public void guessPhrase(){ 
        //arrays????
        System.out.println("Please enter your guess: ");
                
                Scanner phraseGuess = new Scanner(System.in);
                newPhrase = phraseGuess.next();
                
       // if (new)
    }
                     
    
    //public void displayWinningMessage (){
        //System.out.println(
           // "\n\t*****************************************************"
           // + "\n\t Congratulations" + this.winner.name + "! You won the game."
            //+ "\n\t You may assume bragging rights for the day!"
            //+ "\n\t******************************************************");
    //}
    
    public void displayTiedMessage (){
        System.out.println(
            "\n\t******************************************************"
            + "\n\t The game is a tie. Play again if you want bragging rights."
            + "\n\t*****************************************************");
    }
    public void displayPlayers(){
        //Do we still need this?????
        System.out.println("\n\tHere are the three default players.");
           //this.playerName1.displayName();
           // this.playerName2.displayName();
           //this.playerName3.displayName();
    }
}
