/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RfortuneTeam.HeatherandLaura.control;

import static RfortuneTeam.HeatherandLaura.control.GameMenuControl.exit;
import RfortuneTeam.HeatherandLaura.frames.GameMenu;
import RfortuneTeam.HeatherandLaura.frames.GamePrefs;
import RfortuneTeam.HeatherandLaura.frames.HelpMenu;
import rfortune.Bank;
import rfortune.Player;
import java.io.Serializable;
import rfortune.PlayerTurn;

/**
 *
 * @author Heather
 */
public class MainMenuControl implements Serializable {

    private static int setNumPlayers;
    MainMenuControl mainMenuControl = null;
    static GamePrefs gamePrefs = new GamePrefs();
    static GameMenu gameMenu = new GameMenu();
    PlayerTurn playerTurn = new PlayerTurn();
    static HelpMenu helpMenu = new HelpMenu();

    /**
     * @return the setNumPlayers
     */
    public static int getSetNumPlayers() {
        return setNumPlayers;
    }

    /**
     * @param aSetNumPlayers the setNumPlayers to set
     */
    public static void setSetNumPlayers(int aSetNumPlayers) {
        setNumPlayers = aSetNumPlayers;
    }

    /**
     * *************************************************************************
     * setNumPlayers(). gets the number of players from MainMenuView and stores
     * puts it into the class (integer) variable numPlayers as a reference for
     * getPlayerNames in Player, playersTurn in PlayerTurn and numPlayersBank in
     * Bank.
     *
     * @param getNumPlayers 
     *************************************************************************
     */
    public void setNumPlayers(int getNumPlayers) {
        setSetNumPlayers(getNumPlayers);
    }

    /**
     * *************************************************************************
     * setScreen(). formats the display of the current players (from Player) and
     * their scores (from Bank).
     *************************************************************************
     */
    public void setScreen() {
        Bank.updateBankPlayer();
        if (getSetNumPlayers() == 1) {
            gameMenu.jtfPlayer1Name.setText(Player.getPlayer1());
    
            gameMenu.jtfPlayer1Bank.setText("$ " + Bank.getBankPlayer1());

        }
        if (getSetNumPlayers() == 2) {
            gameMenu.jtfPlayer1Name.setText(Player.getPlayer1());
            gameMenu.jtfPlayer2Name.setText(Player.getPlayer2());
            
            gameMenu.jtfPlayer1Bank.setText("$ " + Bank.getBankPlayer1());
            gameMenu.jtfPlayer2Bank.setText("$ " + Bank.getBankPlayer2());
        }
        if (getSetNumPlayers() == 3) {
            gameMenu.jtfPlayer1Name.setText(Player.getPlayer1());
            gameMenu.jtfPlayer2Name.setText(Player.getPlayer2());
            gameMenu.jtfPlayer3Name.setText(Player.getPlayer3());
            
            gameMenu.jtfPlayer1Bank.setText("$ " + Bank.getBankPlayer1());
            gameMenu.jtfPlayer2Bank.setText("$ " + Bank.getBankPlayer2());
            gameMenu.jtfPlayer3Bank.setText("$ " + Bank.getBankPlayer3());
        }
        
        gameMenu.jtfPlayerTurnName.setText(playerTurn.updatePlayersTurn());
        
    }

    public void startGamePrefs() {
        mainMenuControl = new MainMenuControl();
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    gamePrefs.setVisible(true);
                }
            });
        } finally {
            if (MainMenuControl.gamePrefs != null) {
                MainMenuControl.gamePrefs.dispose();
            }
        }
    }

    public void startGameMenu() {
        mainMenuControl = new MainMenuControl();
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    gameMenu.setVisible(true);
                }
            });
        } finally {
            if (MainMenuControl.gameMenu != null) {
                MainMenuControl.gameMenu.dispose();
            }
        }
    }
    
     public void startHelpMenu() {
        mainMenuControl = new MainMenuControl();
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    helpMenu.setVisible(true);
                }
            });
        } finally {
            if (MainMenuControl.helpMenu != null) {
                MainMenuControl.helpMenu.dispose();
            }
        }
    }
     
     
    public void exitGame() {
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    exit.setVisible(true);
                }
            });
        } finally {
            if (GameMenuControl.exit != null) {
                GameMenuControl.exit.dispose();
            }
        }
    }
}
