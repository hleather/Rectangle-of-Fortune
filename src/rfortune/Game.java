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
    GameTurnView gameTurnView = new GameTurnView();
    
    
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
        
         if(Game.foundMatch){
            System.out.println("You have a match.");
        for (int i = 0; i< BoardView.parallelCharArray.length; i++) {
            System.out.println(BoardView.parallelCharArray[i]);
           // while (Game.foundMatch = true){
             //   System.out.println("\t  " + GameTurnView.turnOptions[0] + "\t" + 
               //      GameTurnView.turnOptions[1]);
            }
        }
        if(!Game.foundMatch)
            new RfortuneError().displayError("That is not in the phrase. "
                    + "Your turn is over.");
              //  while (Game.foundMatch = false){
               // PlayerTurn playerTurn = new PlayerTurn();
               // playerTurn.playersTurn();
            }
       
    }
    

    
   /* public void displayEndingMessage (){
        Bank bank = new Bank();
        
        if((Bank.playerListOrder[0])==(Bank.playerListOrder[1])){
        }
        //refers to the two top players in the sorted array
            System.out.println("This game was a tie between " + bank.winningOrder[0] 
                    +" and " + bank.winningOrder[1]);
            else
            System.out.println("Congratulations "+ playerListOrder[0]+ ". You "
                       + "are the winner!" );
        }*/
