/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.allMenuViews;

import rfortune.Game;
import RfortuneTeam.HeatherandLaura.control.GameMenuControl;
import RfortuneTeam.HeatherandLaura.customExceptions.MenuException;

/**
 *
 * @author Heather
 */
public class GameMenuView extends Menu {
    public static String command;
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
    
     public String getInput(Object object) {
         do {
            try {
            if (Game.getRoundNumber() == 0)
                menuItems[0][1] = "Start the Game";
           
            this.display(); // display the menu

            // get commaned entered
            command = this.getCommand();
            switch (command) {
                case "T":
                    gameMenuControl.takeTurn();                   
                    break;
                case "H":
                    helpMenuView.getInput(null);
                    break;
                case "Q":                   
                    break;
            }
            }catch (MenuException e) {
                System.out.println("\n" + e.getMessage());
            }
        } while (!command.equals("Q"));
        return command;
    }
}

