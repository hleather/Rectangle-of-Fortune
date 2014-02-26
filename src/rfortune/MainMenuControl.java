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
public class MainMenuControl {
    static int numberPlayers = 3;
    
    /***************************************************************************
     * setScreen(). formats the display of the current players (from Player) and
     * their scores (from Bank).
     * @param numPlayers 
     **************************************************************************/
    public void setScreen(int numPlayers) {
        numPlayers = numberPlayers;  
        String gameDisplay[][] = {
            {Player.player1, Player.player2, Player.player3},
            {Bank.bankPlayer1, Bank.bankPlayer2, Bank.bankPlayer3}
        };
        int i;
        System.out.println("\n\t==========================================="
                + "====================");
        for(i = 0; i < numberPlayers; i++) {                
            System.out.println("\t" + gameDisplay[i][0] + "\t\t\t" + 
                    gameDisplay[i][1] + "\t\t\t" + gameDisplay[i][2]);     
        }
        System.out.println("\t============================================="
                + "==================\n");
        
        GameMenuView mainGameMenu =  new GameMenuView();
        mainGameMenu.getInput();
    }
    
    /***************************************************************************
     * displayHelpMenu(). creates a new instance of HelpMenuView().getInput() 
     * and calls the help menu with the appropriate command as issued from the
     * user.
     **************************************************************************/
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }    
}