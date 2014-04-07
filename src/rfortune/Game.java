/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import RfortuneTeam.HeatherandLaura.frames.GameTurn;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Heather and Laura
 */
public class Game implements Serializable {
    PlayerTurn playerTurn = new PlayerTurn();
    static GameTurn gameTurn = new GameTurn();
    private static int roundNumber = 0;
    private static int correctGuesses = 0;
    private static boolean foundMatch = false;
    private static boolean turnOver = false;
    private static String guessedPhrase;

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

    public Game() {
    }

    public static void newGame() {
        WordsAndPhrases.setPhrases();
        WordsAndPhrases.translatePhraseToChar();
        WordsAndPhrases.translateParallelPhraseToChar();
    }

    public static void gameRound() {
        if (isFoundMatch()) {
            setRoundNumber(getRoundNumber() - 1);
        }
    }

    public static void updateFoundMatchTrue() {
        Game.foundMatch = true;
    }

    public static void updateFoundMatchFalse() {
        Game.foundMatch = false;
    }

    public static void display() {
        if (isFoundMatch()) {
            new RfortuneMessage().displayMessage("You have a match!");
        } else if (!isFoundMatch()) {
            new RfortuneMessage().displayMessage("Sorry, that is not in the "
                    + "phrase. Your turn is over.");
            setTurnOver(true);
        }
    }

    public static void setGuessedPhrase() {
        new RfortuneMessage().displayMessage("You have chosen to guess the "
                + "phrase! Please enter your guess: ");
        String guess;
        Scanner inFile = new Scanner(System.in);
        guess = inFile.nextLine();
        guess = guess.trim().toUpperCase();
        guessedPhrase = guess;
    }

    public static String getGuessedPhrase() {
        return guessedPhrase;
    }

    public void updateAllBank() {
        playerTurn.updatePlayersTurn();
        Bank.bankPlayerTurn();
        Bank.updateBankPlayer();
        gameTurn.jtfBankDisplay.setText(Bank.displayPlayerUpBank());

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
