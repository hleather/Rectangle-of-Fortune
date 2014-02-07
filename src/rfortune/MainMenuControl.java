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
    
    
     
    public void startGame(long noPlayers) {
                
        if (noPlayers != 1  &&  noPlayers != 2 && noPlayers != 3) {
            new RfortuneError().displayError("startGame - invalid number of players specified.");
            return;
        }
        
        Game game;
        if (noPlayers == 1) {
            game = this.create("ONE_PLAYER");
        }
        else if (noPlayers == 2){
            game = this.create("TWO_PLAYER");
        }
        else {
            game = this.create("THREE_PLAYER");
        }

        GameMenuView gameMenu = new GameMenuView(game);
        gameMenu.getInput();
    }

    
    
    public Game create(String gameType) {
        

    } 
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
}