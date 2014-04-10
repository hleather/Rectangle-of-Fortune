/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import RfortuneTeam.HeatherandLaura.control.MainMenuControl;
import RfortuneTeam.HeatherandLaura.frames.GameTurn;
import java.io.Serializable;

/**
 *
 * @author Heather and Laura
 */
public class Game implements Serializable {
    MainMenuControl mainMenuControl = new MainMenuControl();
    PlayerTurn playerTurn = new PlayerTurn();
    static GameTurn gameTurn = new GameTurn();
    private static int roundNumber = 0;
    private static int correctGuesses = 0;

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

    public Game() {
    }
    
    public void newGame() {
        new RfortuneError().displayError("Game.newGame called");
    }

    public void startGame() {
        mainMenuControl.setScreen();
        WordsAndPhrases.setPhrases();
        WordsAndPhrases.translatePhraseToChar();
        WordsAndPhrases.translateParallelPhraseToChar();
    }

    public void updateAllBank() {
        playerTurn.updatePlayersTurn();
        Bank.updateBankPlayer();
        Bank.bankPlayerTurn();        
    }
    
    public String displayPlayerUpBank() {
        return Bank.displayPlayerUpBank();
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
