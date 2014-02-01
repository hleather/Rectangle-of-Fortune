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
    
        int vowel1 = 'a';
        int vowel2 = 'e';
        int vowel3 = 'i';
        int vowel4 = 'o';
        int vowel5 = 'u';
        int currentScore = Board.guessWorth;
        
        
        Scanner userGuess = new Scanner(System.in);
        int guess1 = Integer.parseInt(userGuess);
        System.out.println("Please enter a vowel:");
        this.guess1 = userGuess.next();
       
        if ((guess1 != vowel1) || (guess1 != vowel2)|| (guess1 != vowel3)
               || (guess1 != vowel4) || (guess1 != vowel5)){
             System.out.println(userGuess + "is invalid. Please enter a vowel.");
        }else{
            int newScore = currentScore - 250;
            return newScore;
            System.out.println("Your new score is " + newScore);   
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
