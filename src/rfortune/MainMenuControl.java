/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.util.Scanner;
/**
 *
 * @author Heather
 */
public class MainMenuControl {
    
        Player myPlayers = new Player();
        myPlayers.getPlayerNames();
     
    public void startGame(long noPlayers) {
                
        if (noPlayers != 1  &&  noPlayers != 2 && noPlayers != 3) {
            new RfortuneError().displayError("startGame - invalid number of players specified.");
            return;
        }
        
   
    }

    
    
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
}