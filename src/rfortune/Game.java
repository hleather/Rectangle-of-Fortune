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
    public static boolean foundMatch = false;
    
    
    public Game(){
}
    
    /***************************************************************************
     * searchPhrase(). goes through the character array of the current phrase
     * and checks to see if the guessed letter from BoardView is in the phrase.
     * If it is, foundMatch is set to true and the function displays the 
     * parallel phrase with the correctly guessed letter instead of the '-'
     * placeholder. If it is not, foundMatch is set to false and the players
     * turn is terminated.
     **************************************************************************/
    public static void searchPhrase(){
        //REMEMBER CHECKVOWELGUESS
        if(CheckGuess.checkRepeat)
        for(int i = 0; i  < BoardView.charArray.length; i++){
            if(BoardView.charArray[i] == (CheckGuess.currentGuess)){
                BoardView.parallelCharArray[i] = CheckGuess.currentGuess;
                Game.foundMatch = true;
            }
        }
        if(Game.foundMatch)
            System.out.println("You have a match.");
        for (int i = 0; i< BoardView.parallelCharArray.length; i++) {
            System.out.println(BoardView.parallelCharArray[i]);
        }
        if(!Game.foundMatch)
            new RfortuneError().displayError("That is not in the phrase. "
                    + "Your turn is over.");
        // *!*Need something here to initiate the next player's turn.*!*
    }
    
   
    
    /*public void buyAVowel(){
        //   *!* VARIABLE = CheckGuess.guessVowel *!*
        
        // all that really needs to be done here is to check to see if it is 
        // in the phrase....I don't think we need this function anymore.
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
    
   /* public void guessPhrase(){ 
        //arrays????
        System.out.println("Please enter your guess: ");
                
                Scanner phraseGuess = new Scanner(System.in);
                newPhrase = phraseGuess.next();
                
       // if (new)
    }*/
    
    public void displayEndingMessage (){
        Bank bank = new Bank();
        bank.sortScores(winningOrder);
        
        if(winningOrder[0]==winningOrder[1]){
        }
        //refers to the two top players in the sorted array
            System.out.println("This game was a tie between " + winningOrder[0] 
                    +" and " + winningOrder);
            else
            System.out.println("Congratulations "+ playerListOrder[0]+ ". You "
                    + "are the winner!" );
        }
}
