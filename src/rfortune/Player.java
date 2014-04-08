/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import RfortuneTeam.HeatherandLaura.frames.EnterPlayerNames;
import java.io.Serializable;
/**
 *
 * @author Heather
 */
public class Player implements Serializable {
    private static String player1 = " ";
    private static String player2 = " ";
    private static String player3 = " ";
    PlayersList myList = new PlayersList();   
    Player myPlayer = null;
    static EnterPlayerNames enterPlayerNames = new EnterPlayerNames();

    /**
     * @return the player1
     */
    public static String getPlayer1() {
        return player1;
    }

    /**
     * @param aPlayer1 the player1 to set
     */
    public static void setPlayer1(String aPlayer1) {
        player1 = aPlayer1;
    }

    /**
     * @return the player2
     */
    public static String getPlayer2() {
        return player2;
    }

    /**
     * @param aPlayer2 the player2 to set
     */
    public static void setPlayer2(String aPlayer2) {
        player2 = aPlayer2;
    }

    /**
     * @return the player3
     */
    public static String getPlayer3() {
        return player3;
    }

    /**
     * @param aPlayer3 the player3 to set
     */
    public static void setPlayer3(String aPlayer3) {
        player3 = aPlayer3;
    }
    
    /***************************************************************************
     * getPlayerNames(). initiates the function getInput() from PlayersList and
     * gets the names of the players from PlayersList. The amount of players
     * whose names get defined is determined by the number of players (from
     * MainMenuControl).
     **************************************************************************/
   
    
    public final void getPlayerFrames(){
        myPlayer = new Player();
            try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    enterPlayerNames.setVisible(true);  
                }
            });
        }
        finally {
            if (Player.enterPlayerNames != null) {
                Player.enterPlayerNames.dispose();
            }
        }
        
    }
   /* public static void displayPlayer1Bank() {

    } */
}
