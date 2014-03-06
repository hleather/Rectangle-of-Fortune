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
     * playersTurn(). creates the array playerListOrder to store the names of 
     * the current players (from Player) and uses a FOR loop to determine whose
     * turn it is and sends which player's turn it is to bankPlayerTurn in Bank.
     **************************************************************************/
    public static void playersTurn(){
        int n = 0;              
        for (int i = 0; n <= Game.roundNumber; i++){
            if(i == MainMenuControl.setNumPlayers)
               i = 0;
            n++;
            playerUp = i;
        }    
        
    }
    
    public static void displayPlayerTurn(){
            System.out.println("\nIt is " + playerListOrder[playerUp] + "'s turn");
        if (playerUp == 0)
            playerUpName = Player.player1;
        if (playerUp == 1)
            playerUpName = Player.player2;
        if (playerUp == 2)
            playerUpName = Player.player3;
        }    
    }

