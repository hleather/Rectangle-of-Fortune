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
    

    public static void playersTurn(int numPlayers){
        String playerListOrder[] = {Player.player1, Player.player2, Player.player3};
        numPlayers = 3;
        for (int i = 0; i <= (numPlayers - 1); i--){
           if(i == 0){
               i = 3; 
           }
           System.out.println(playerListOrder[i]);
        }
        }
}
