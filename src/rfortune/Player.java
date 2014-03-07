/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.io.Serializable;
/**
 *
 * @author Heather
 */
public class Player implements Serializable {
    private static String player1 = " ";
    private static String player2 = " ";
    private static String player3 = " ";
    //PlayersList myList = new PlayersList();   
    
    /***************************************************************************
     * getPlayerNames(). initiates the function getInput() from PlayersList and
     * gets the names of the players from PlayersList. The amount of players
     * whose names get defined is determined by the number of players (from
     * MainMenuControl).
     **************************************************************************/
    public final void getPlayerNames(){
        myList.getInput();
        if (MainMenuControl.setNumPlayers == 3) 
        {
            Player.player1 = PlayersList.listOfPlayerNames[0];
            Player.player2 = PlayersList.listOfPlayerNames[1];
            Player.player3 = PlayersList.listOfPlayerNames[2];
        }
        else if (MainMenuControl.setNumPlayers == 2)
        {
            Player.player1 = PlayersList.listOfPlayerNames[0];
            Player.player2 = PlayersList.listOfPlayerNames[1];            
        }
        else if (MainMenuControl.setNumPlayers == 1) 
        {
            Player.player1 = PlayersList.listOfPlayerNames[0];
        }        
    }     
    
   /* public static void displayPlayer1Bank() {

    } */
}
