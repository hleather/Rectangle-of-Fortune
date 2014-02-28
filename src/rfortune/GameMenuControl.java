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

    
    public GameMenuControl(Game game) {

    }

       
    
   public void takeTurn() {
       //Would this work to call the getInput function from the GameTurnView class?
        GameTurnView gameTurnView = new GameTurnView();
        gameTurnView.getInput();
        
        System.out.println("The next letter guess is worth " + Bank.spinWorth);
    }
   
       
   public void displayBoard() {
        System.out.println("\n\tdisplayBoard() called");
    }
   
   
    public void startNewGame() {
        System.out.println("\n\tstartNewGame() called");
    }
    
    
            
    public void displayPreferencesMenu() {
        //Is this written correctly?
        GamePreferencesView PreferencesMenu = new GamePreferencesView();
        GamePreferencesView.getInput();
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    

    
    
    
}

