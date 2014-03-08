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
    private static String[] playerListOrder;
    
    /***************************************************************************
     * Uses a FOR loop to determine whose turn it is.
     **************************************************************************/
    public static void definePlayerListOrder(){
     
        if (MainMenuControl.setNumPlayers == 3) 
        {
             String player1 = Player.getPlayer1();
             String player2 = Player.getPlayer2();
             String player3 = Player.getPlayer3();
        }
        else if (MainMenuControl.setNumPlayers == 2)
        {
             String player1 = Player.getPlayer1();
             String player2 = Player.getPlayer2();
                 
        }
        else if (MainMenuControl.setNumPlayers == 1) 
        {
             String player1 = Player.getPlayer1();
        }        
    }
    
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
            playerUpName= Player.getPlayer1();
        if (playerUp == 1)
            playerUpName = Player.getPlayer2();
        if (playerUp == 2)
            playerUpName = Player.getPlayer3();
        }    
    }

