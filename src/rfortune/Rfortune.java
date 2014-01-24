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
public class Rfortune {
class GameBoard {
    char wordsPhrases;
    char playerTurn;
    int equations;
}
class Players {
    char name;
    int score;
}
class Menu {
    char welcomeScreen;
    char mMain;
    char mHelp;
    char mGame;
}

   
    class displayName {
public static void main(String args[]) {

       Players player1 = new Players();
       Players player2 = new Players();
       
       //assign values to the fields in player1
       player1.name = "Sally";
       player1.score = 100;
       
       //assign values to the fields in player2
       player2.name = "Bob";
       player2.score = 50;
       
       System.out.print("Player 1, " + player1.name + " has a score of " 
       + player1.score + " . ");
       System.out.print("Player 2, " + player2.name + " has a score of " 
               + player2.score + " . ");

    }
    
}
}