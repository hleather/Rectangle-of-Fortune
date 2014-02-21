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
        int n = 0;
        System.out.println("\nFor this test, please just keep entering T ");
        for (int i = 0; n <= Game.roundNumber; i++){
            if(3 == i){
               i = 0;                
           }
           n++;
           System.out.println("\nIt is " + playerListOrder[i] + "'s turn");
        }

        }
}
