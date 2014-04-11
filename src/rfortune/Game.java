/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import RfortuneTeam.HeatherandLaura.control.MainMenuControl;
import RfortuneTeam.HeatherandLaura.frames.EndMessage;
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
    static EndMessage endMessage = new EndMessage();

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
        if (MainMenuControl.getSetNumPlayers() == 2) {
            endMessage.jtfPlayer1.setText(Player.getPlayer1());
            endMessage.jtfBank1.setText(Bank.getBankPlayer1());
            endMessage.jtfPlayer3.setText(Player.getPlayer2());
            endMessage.jtfBank3.setText(Bank.getBankPlayer2());
        }
        if (MainMenuControl.getSetNumPlayers() == 3) {
            endMessage.jtfPlayer1.setText(Player.getPlayer1());
            endMessage.jtfBank1.setText(Bank.getBankPlayer1());
            endMessage.jtfPlayer2.setText(Player.getPlayer2());
            endMessage.jtfBank2.setText(Bank.getBankPlayer2());
            endMessage.jtfPlayer3.setText(Player.getPlayer3());
            endMessage.jtfBank3.setText(Bank.getBankPlayer3());
        }
        if (MainMenuControl.getSetNumPlayers() == 1) {
            endMessage.jtfMessage.setText("Congratulations");
            endMessage.jtfName.setText(Player.getPlayer1());
            endMessage.jtfPlayer2.setText(Player.getPlayer1());
            endMessage.jtfBank2.setText(Bank.getBankPlayer1());
        } else {
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
                endMessage.jtfMessage.setText("Congratulations");
                endMessage.jtfName.setText(parallelListOrder[0]);
            } else {
                endMessage.jtfMessage.setText("The game was a tie");
                endMessage.jtfName.setText(null);
            }
        }
    }

    public static void setEndScreen() {
        Game.sortScores();
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    endMessage.setVisible(true);
                }
            });
        } finally {
            if (endMessage != null) {
                endMessage.dispose();
            }
        }

    }
}
