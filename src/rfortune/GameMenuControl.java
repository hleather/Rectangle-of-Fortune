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
public class GameMenuControl {
    GameTurnView gameTurnView = new GameTurnView();

    
    public GameMenuControl() {
       
    }

       
    
   public void takeTurn() {
       //ONLY PART THAT NEEDS WORK
       gameTurnView.getInput();
   }
   
     /*public void displayBoard() {
        System.out.println("\n\tdisplayBoard() called");
   }*/
}