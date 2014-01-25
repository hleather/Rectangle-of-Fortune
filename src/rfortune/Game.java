/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

/**
 *
 * @author Laura
 */
public class Game {
    
        String phrase; 
        String playerName1;
        String playerName2;
        String playerName3;
        Score winner;
        Score loser;
        String status;
        Board board;
        //Player currentPlayer;
        //Player otherPlayerA;
        //Player otherPlayerB;
        
    
    public Game(){
        
        //this.playerName1 = new Player();
        //this.playerName1.name = "Guy";
        //this.playerName2 = new Player();
        //this.playerName2.name = "Faye";
        //this.playerName3 = new Player();
        //this.playerName3.name = "Lenny";
    }
    
    public void displayWinningMessage (){
        System.out.println(
            "\n\t*****************************************************"
            + "\n\t Congratulations" + this.winner.name + "! You won the game."
            + "\n\t You may assume bragging rights for the day!"
            + "\n\t******************************************************");
    }
    
    public void displayTiedMessage (){
        System.out.println(
            "\n\t******************************************************"
            + "\n\t The game is a tie. Play again if you want bragging rights."
            + "\n\t*****************************************************");
    }
    public void displayPlayers(){
        System.out.println("\n\tHere are the three default players.");
           //this.playerName1.displayName();
           // this.playerName2.displayName();
           //this.playerName3.displayName();
    }
}
