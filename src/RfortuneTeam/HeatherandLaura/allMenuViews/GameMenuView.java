/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.allMenuViews;

import rfortune.Game;
import RfortuneTeam.HeatherandLaura.control.GameMenuControl;
import rfortune.Menu;
import rfortune.Rfortune;
import rfortune.RfortuneError;
import java.util.Scanner;

/**
 *
 * @author Heather
 */
public class GameMenuView extends Menu {

    private static final String[][] menuItems = {
        {"T", "Take your turn"},
        {"H", "Help"},
        {"Q", "QUIT"}
    };
    HelpMenuView helpMenuView = new HelpMenuView();
    GameMenuControl gameMenuControl = new GameMenuControl();

    public GameMenuView() {      
        super(GameMenuView.menuItems);
    }
    
            public String getInput() {
        String command;
        Scanner inFile = Rfortune.getInputFile();

        do {
            if (Game.getRoundNumber() == 0)
                menuItems[0][1] = "Start the Game";
            this.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "T":
                    gameMenuControl.takeTurn();                   
                    break;
                case "H":
                    helpMenuView.getInput();
                    break;
                case "Q":                   
                    break;
                default: 
                    new RfortuneError().displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));
        return null;
    }

}