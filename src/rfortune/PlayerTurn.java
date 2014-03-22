/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import RfortuneTeam.HeatherandLaura.control.MainMenuControl;
import java.io.Serializable;

/**
 *
 * @author Heather
 */
public class PlayerTurn implements Serializable {
    private static int playerUp; 
    private static String playerUpName; 
    private static String[] playerListOrder;
    
    /***************************************************************************
     * Uses a FOR loop to determine whose turn it is.
     **************************************************************************/
    public static void definePlayerListOrder(){
     
        if (MainMenuControl.getSetNumPlayers() == 3) 
        {
             String player1 = Player.getPlayer1();
             String player2 = Player.getPlayer2();
             String player3 = Player.getPlayer3();
        }
        else if (MainMenuControl.getSetNumPlayers() == 2)
        {
             String player1 = Player.getPlayer1();
             String player2 = Player.getPlayer2();
                 
        }
        else if (MainMenuControl.getSetNumPlayers() == 1) 
        {
             String player1 = Player.getPlayer1();
        }        
    }
    
    public static void updatePlayersTurn(){
        int n = 0;              
        for (int i = 0; n <= Game.getRoundNumber(); i++){
            if(i == MainMenuControl.getSetNumPlayers())
               i = 0;
            n++;
            setPlayerUp(i);
        }    
        
    }
    
    public static void displayPlayerTurn(){
        if (getPlayerUp() == 0) {
            setPlayerUpName(Player.getPlayer1());
            System.out.println(getPlayerUpName());
        }
        if (getPlayerUp() == 1) {
            setPlayerUpName(Player.getPlayer2());
            System.out.println(getPlayerUpName());
        }
        if (getPlayerUp() == 2) {
            setPlayerUpName(Player.getPlayer3());
            System.out.println(getPlayerUpName());
        }
        }    

    /**
     * @return the playerUp
     */
    public static int getPlayerUp() {
        return playerUp;
    }

    /**
     * @param aPlayerUp the playerUp to set
     */
    public static void setPlayerUp(int aPlayerUp) {
        playerUp = aPlayerUp;
    }

    /**
     * @return the playerUpName
     */
    public static String getPlayerUpName() {
        return playerUpName;
    }

    /**
     * @param aPlayerUpName the playerUpName to set
     */
    public static void setPlayerUpName(String aPlayerUpName) {
        playerUpName = aPlayerUpName;
    }

    /**
     * @return the playerListOrder
     */
    public static String[] getPlayerListOrder() {
        return playerListOrder;
    }

    /**
     * @param aPlayerListOrder the playerListOrder to set
     */
    public static void setPlayerListOrder(String[] aPlayerListOrder) {
        playerListOrder = aPlayerListOrder;
    }
    }

