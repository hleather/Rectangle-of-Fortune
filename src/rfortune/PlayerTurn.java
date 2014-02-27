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
    
    /***************************************************************************
     * playersTurn(). creates the array playerListOrder to store the names of 
     * the current players (from Player) and uses a FOR loop to determine whose
     * turn it is and sends which player's turn it is to bankPlayerTurn in Bank.
     **************************************************************************/
    public static void playersTurn(){
        String playerListOrder[] = {Player.player1, Player.player2, 
            Player.player3};
        playerUp = 0;
        int n = 0;
        int control = 0;
        for (int i = 0; n <= control; i++){
            if(MainMenuControl.setNumPlayers == i){
                i = 0;                
            }
            n++;
            System.out.println("\nIt is " + playerListOrder[i] + "'s turn");
            playerUp = i;
        }  
        Bank.bankPlayerTurn(playerUp);
    }
}
