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
public class PlayerTurn {
    public static int playerUp; 
    public static String playerUpName; 
    private static String[] playerListOrder = {Player.player1, Player.player2, 
            Player.player3};
    
    /***************************************************************************
     * Uses a FOR loop to determine whose turn it is.
     **************************************************************************/
    public static void updatePlayersTurn(){
        int n = 0;              
        for (int i = 0; n <= Game.getRoundNumber(); i++){
            if(i == MainMenuControl.setNumPlayers)
               i = 0;
            n++;
            playerUp = i;
        }    
        
    }
    
    public static void displayPlayerTurn(){
            System.out.println(playerListOrder[playerUp]);
        if (playerUp == 0)
            playerUpName = Player.player1;
        if (playerUp == 1)
            playerUpName = Player.player2;
        if (playerUp == 2)
            playerUpName = Player.player3;
        }    
    }

