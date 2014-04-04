/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RfortuneTeam.HeatherandLaura.control;

import RfortuneTeam.HeatherandLaura.allMenuViews.GameMenuView;
import RfortuneTeam.HeatherandLaura.frames.EnterPlayerNames1;
import RfortuneTeam.HeatherandLaura.frames.EnterPlayerNames2;
import RfortuneTeam.HeatherandLaura.frames.EnterPlayerNames3;
import rfortune.Bank;
import rfortune.Player;
import java.io.Serializable;

/**
 *
 * @author Heather
 */
public class MainMenuControl implements Serializable {
    
    MainMenuControl mainMenuControl = null;
    static EnterPlayerNames1 enterPlayerNames1 = new EnterPlayerNames1();
    static EnterPlayerNames2 enterPlayerNames2 = new EnterPlayerNames2();
    static EnterPlayerNames3 enterPlayerNames3 = new EnterPlayerNames3();

    private static int setNumPlayers;

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
       
        String player1 = Player.getPlayer1();
        String player2 = Player.getPlayer2();
        String player3 = Player.getPlayer3();

        String gameDisplay[][] = {
            {player1, player2, player3},
            {Bank.getBankPlayer1(), Bank.getBankPlayer2(), Bank.getBankPlayer3()}
        };
        if (getSetNumPlayers() == 1) {
            try {
            mainMenuControl = new MainMenuControl();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    enterPlayerNames1.setVisible(true);  
                }
            });
        }
        finally {
            if (MainMenuControl.enterPlayerNames1 != null) {
                MainMenuControl.enterPlayerNames1.dispose();
            }
        }
        }
        if (getSetNumPlayers() == 2) {
            try {
            mainMenuControl = new MainMenuControl();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    enterPlayerNames2.setVisible(true);  
                }
            });
        }
        finally {
            if (MainMenuControl.enterPlayerNames2 != null) {
                MainMenuControl.enterPlayerNames2.dispose();
            }
        }
        }
        if (getSetNumPlayers() == 3) {
            try {
            mainMenuControl = new MainMenuControl();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    enterPlayerNames3.setVisible(true);  
                }
            });
        }
        finally {
            if (MainMenuControl.enterPlayerNames3 != null) {
                MainMenuControl.enterPlayerNames3.dispose();
            }
        }
        }
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.getInput(null);

    }
}
