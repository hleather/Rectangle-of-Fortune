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
public class Game {
    
        String phrase; 
        String player1;
        String player2;
        String player3;
        Score winner;
        Score loser;
        String status;
        Board board;
    private String guess1;
        
        
    
    public Game(){
        
    }
    
    public int determineUserGuess(){
        char valid = 'v';
        int v = (int) valid;        
        char userGuess = 'l';
        int x = (int) userGuess;
        char repeatCheck = 'n';
        int y = (int) repeatCheck;
        char inPhrase = 'l';
        int z = (int) inPhrase;
        int correctGuesses = 0;
        int incorrectGuesses = 0;
        boolean b;
        
        System.out.println("\nPlease enter your guess: ");
        
        System.out.println("\t(Your guess was 9)");
         if (userGuess != v) 
             System.out.println("Sorry, 9 is invalid. Please enter a single "
             + "lower case consonant: ");
         
         System.out.println("\t(Your guess was a)");
         if (userGuess != v) 
             System.out.println("Sorry, a is invalid. Please enter a single "
             + "lower case consonant: ");
         
         System.out.println("\t(Your guess was ff)");
         if (userGuess != v)
             System.out.println("Sorry, ff is invalid. Please enter a single "
             + "lower case consonant: ");
         
         System.out.println("\t(Your guess was n)");
         if ((userGuess == x) && (userGuess != y))
             System.out.println("Sorry, n has already been guessed. Please "
             + "enter a different letter: ");
         
         System.out.println("\t(If your guess was r)");
         if ((userGuess == x) && (userGuess != 'r'))
             b = false;
                System.out.println("Sorry, r is not in the phrase.");
        
         System.out.println("\t(If your guess was l)");
         if ((userGuess == x) && (userGuess == z))
             b = true;
                System.out.println("Good job! l is in the phrase.");
           
         if (b = true)
             return correctGuesses++;
         if (b = false)
             return incorrectGuesses++;
         else return 0;
         
    }
    
    public void buyAVowel(){
    
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
        //int currentScore = Board.guessWorth;
        
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
        System.out.println("\n\tHere are the three default players.");
           //this.playerName1.displayName();
           // this.playerName2.displayName();
           //this.playerName3.displayName();
    }
}
