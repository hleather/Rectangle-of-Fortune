/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import RfortuneTeam.HeatherandLaura.control.MainMenuControl;
import static RfortuneTeam.HeatherandLaura.control.MainMenuControl.getSetNumPlayers;
import RfortuneTeam.HeatherandLaura.frames.EnterPlayerNames1;
import RfortuneTeam.HeatherandLaura.frames.EnterPlayerNames2;
import RfortuneTeam.HeatherandLaura.frames.EnterPlayerNames3;
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
    Player player = null;
    static EnterPlayerNames1 enterPlayerNames1 = new EnterPlayerNames1();
    static EnterPlayerNames2 enterPlayerNames2 = new EnterPlayerNames2();
    static EnterPlayerNames3 enterPlayerNames3 = new EnterPlayerNames3();

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
    public final void getPlayerNames(){
        String[] list = PlayersList.getListOfPlayerNames();
        myList.getInput();
        if (MainMenuControl.getSetNumPlayers() == 3) 
        {
            Player.setPlayer1(list[0]);
            Player.setPlayer2(list[1]);
            Player.setPlayer3(list[2]);
        }
        else if (MainMenuControl.getSetNumPlayers() == 2)
        {
            Player.setPlayer1(list[0]);
            Player.setPlayer2(list[1]);            
        }
        else if (MainMenuControl.getSetNumPlayers() == 1) 
        {
            Player.setPlayer1(list[0]);
        }        
    }     
    
    public final void getPlayerFrames(){
        Player myPlayer = new Player();
        if (getSetNumPlayers() == 1) {
            try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    enterPlayerNames1.setVisible(true);  
                }
            });
        }
        finally {
            if (Player.enterPlayerNames1 != null) {
                Player.enterPlayerNames1.dispose();
            }
        }
        }
        if (getSetNumPlayers() == 2) {
            try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    enterPlayerNames2.setVisible(true);  
                }
            });
        }
        finally {
            if (Player.enterPlayerNames2 != null) {
                Player.enterPlayerNames2.dispose();
            }
        }
        }
        if (getSetNumPlayers() == 3) {
            try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    enterPlayerNames3.setVisible(true);  
                }
            });
        }
        finally {
            if (Player.enterPlayerNames3 != null) {
                Player.enterPlayerNames3.dispose();
            }
        }
        }
    }
   /* public static void displayPlayer1Bank() {

    } */
    public void nothing(){
        
    }
}
