/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;
/**
 *
 * @author Heather
 */
public class Player {
    public static String player1 = " ";
    public static String player2 = " ";
    public static String player3 = " ";    
    PlayersList myList = new PlayersList();   
    
    /***************************************************************************
     * getPlayerNames(). gets the names of the players from PlayersList. The 
     * amount of names pulled depends on the number of players that is a
     * a parameter from MainMenuView.
     * @param numPlayers
     * @return 
     **************************************************************************/
    public final int getPlayerNames (int numPlayers) {        
        if (numPlayers == 3) 
        {
            Player.player1 = myList.listOfPlayerNames[0];
            Player.player2 = myList.listOfPlayerNames[1];
            Player.player3 = myList.listOfPlayerNames[2];
        }
        else if (numPlayers == 2)
        {
            Player.player1 = myList.listOfPlayerNames[0];
            Player.player2 = myList.listOfPlayerNames[1];            
        }
        else 
        {
            Player.player1 = myList.listOfPlayerNames[0];
        }
        return numPlayers;        
    }     
}
