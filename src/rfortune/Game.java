/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.io.Serializable;
/**
 *
 * @author Heather and Laura
 */
public class Game implements Serializable {
    private static int roundNumber = 0;
    private static int correctGuesses = 0;
    private static boolean foundMatch = false;
    private static boolean turnOver = false;

    /**
     * @return the roundNumber
     */
    public static int getRoundNumber() {
        return roundNumber;
    }

    /**
     * @param aRoundNumber the roundNumber to set
     */
    public static void setRoundNumber(int aRoundNumber) {
        roundNumber = aRoundNumber;
    }

    /**
     * @return the correctGuesses
     */
    public static int getCorrectGuesses() {
        return correctGuesses;
    }

    /**
     * @param aCorrectGuesses the correctGuesses to set
     */
    public static void setCorrectGuesses(int aCorrectGuesses) {
        correctGuesses = aCorrectGuesses;
    }

    /**
     * @return the foundMatch
     */
    public static boolean isFoundMatch() {
        return foundMatch;
    }

    /**
     * @param aFoundMatch the foundMatch to set
     */
    public static void setFoundMatch(boolean aFoundMatch) {
        foundMatch = aFoundMatch;
    }

    /**
     * @return the turnOver
     */
    public static boolean isTurnOver() {
        return turnOver;
    }

    /**
     * @param aTurnOver the turnOver to set
     */
    public static void setTurnOver(boolean aTurnOver) {
        turnOver = aTurnOver;
    }
    GameTurnView gameTurnView = new GameTurnView();
    
    
    public Game(){
}
    public static void newGame() {
        WordsAndPhrases.setPhrases();
        WordsAndPhrases.translatePhrase();
        WordsAndPhrases.translateParallelPhrase();
    }
    public static void gameRound() {
        if(isFoundMatch())
            setRoundNumber(getRoundNumber() - 1);
    }
    public static void display() {
        if (isFoundMatch()) {
            new RfortuneMessage().displayMessage("You have a match!");
        }
        else if (!isFoundMatch()) {
            new RfortuneMessage().displayMessage("Sorry, that is not in the "
                    + "phrase. Your turn is over.");
            setTurnOver(true);
        }        
    }
    
}
       
   
    

    
    /*public void displayEndingMessage (){
        Bank bank = new Bank();
        
        
        if((Bank.playerListOrder[0])==(Bank.playerListOrder[1])){
        }
        //refers to the two top players in the sorted array
            System.out.println("This game was a tie between " + bank.winningOrder[0] 
                    +" and " + bank.winningOrder[1]);
            else
            System.out.println("Congratulations "+ playerListOrder[0]+ ". You "
                       + "are the winner!" );*/
        
