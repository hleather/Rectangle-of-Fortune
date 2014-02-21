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
        
    public void setScreen(long numPlayers) {
            numPlayers = numberPlayers;  
            String gameDisplay[][] = {
                {Player.player1, Player.player2, Player.player3},
                {"150", "150", "150"}
            };
            int i;
            System.out.println("\n\t===============================================================");
            for(i = 0; i < numberPlayers; i++) {                
                System.out.println("\t" + gameDisplay[i][0] + "\t\t\t" + gameDisplay[i][1] + "\t\t\t" + gameDisplay[i][2]);     
             }
            System.out.println("\t===============================================================\n");
                            
        GameMenuView mainGameMenu =  new GameMenuView();
        mainGameMenu.getInput();
    }
            
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
}