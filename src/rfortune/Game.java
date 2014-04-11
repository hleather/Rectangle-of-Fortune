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
    
        public static void sortScores() {
        Bank.updateBankPlayer();
        long[] playerListOrder = {Bank.getBankNumberPlayer1(), Bank.getBankNumberPlayer2(), Bank.getBankNumberPlayer3()};
        String[] parallelListOrder = {Player.getPlayer1(), Player.getPlayer2(), Player.getPlayer3()};
        long temp;
        String tempName;
        boolean notDone = true;
        while (notDone) {
            notDone = false;
            for (int i = 0; i < playerListOrder.length - 1; i++) {
                Long playerA = new Long(playerListOrder[i]);
                Long playerB = new Long(playerListOrder[i + 1]);
                long compareResult = playerA.compareTo(playerB);
                if (compareResult < 0) {
                    temp = playerListOrder[i];
                    tempName = parallelListOrder[i];
                    playerListOrder[i] = playerListOrder[i + 1];
                    parallelListOrder[i] = parallelListOrder[i + 1];
                    playerListOrder[i + 1] = temp;
                    parallelListOrder[i + 1] = tempName;
                    notDone = true;
                }
            }
        }
        if (playerListOrder[0] > playerListOrder[1]) {
            Bank.endingScreen.jtfWinnerMessage.setText("Congratulations");
            Bank.endingScreen.jtfWinnerName.setText(parallelListOrder[0]);
        } else {
            Bank.endingScreen.jtfWinnerMessage.setText("The game was a tie");
            Bank.endingScreen.jtfWinnerName.setText(null);
        }
    }


public void setEndScreen (){
        Game.sortScores();
        
     
}
}
