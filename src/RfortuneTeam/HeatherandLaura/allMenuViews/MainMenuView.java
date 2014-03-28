/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.allMenuViews;

import rfortune.Bank;
import rfortune.Game;
import RfortuneTeam.HeatherandLaura.control.MainMenuControl;
import rfortune.Menu;
import rfortune.Player;
import rfortune.PlayersList;
import rfortune.RfortuneError;
import java.util.Scanner;

/**
 * called from: Rfortune
 * @author Heather
 */
public class MainMenuView extends Menu {
    public static String command;  // double check this is used somewhere else 
    private static final String[][] menuItems = {
        {"1", "One player game"},
        {"2", "Two player game"},
        {"3", "Three player game"},
        {"P", "Change game preferences"},
        {"H", "Help"},
        {"X", "Exit Rectangle of Fortune"}
    };       
    PlayersList myList = new PlayersList();
    MainMenuControl mainMenuControl = new MainMenuControl();
    Player myPlayers = new Player();    
    HelpMenuView helpMenuView = new HelpMenuView();
    GamePreferencesView myPrefs = new GamePreferencesView();
    
    public MainMenuView() {
        super(MainMenuView.menuItems);
    }
    
    /***************************************************************************
     * getInput(). displays the multi-dimensional array menuItems and gets the
     * selected input from the user. It passes the number of players as it is 
     * calls getPlayerNames from Player, setScreen from MainMenuControl, 
     * playerTurn from PlayerTurn and numPlayersBank from Bank. Otherwise, it
     * displays the HelpMenu from MainMenuControl, ends the session or displays
     * and error message if the input is invalid.
     * @return command
     **************************************************************************/
        public String getInput() {       
        
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":  
                    mainMenuControl.setNumPlayers(1);
                    myPlayers.getPlayerNames();
                    Bank.numPlayersBank();
                    Game.newGame();
                    mainMenuControl.setScreen();             
                    break;
                case "2":
                    mainMenuControl.setNumPlayers(2);
                    myPlayers.getPlayerNames();
                    Bank.numPlayersBank();
                    Game.newGame();
                    mainMenuControl.setScreen();                    
                    break;
                case "3":
                    mainMenuControl.setNumPlayers(3);
                    myPlayers.getPlayerNames();
                    Bank.numPlayersBank();
                    Game.newGame();
                    mainMenuControl.setScreen();
                    break;
                case "P":
                    myPrefs.getInput();
                    break;
                case "H":
                    helpMenuView.getInput();
                    break;
                case "X":
                    break;
                default: 
                    new RfortuneError().displayError("Invalid command. Please "
                            + "enter a valid command.");
            }
        } while (!command.equals("X"));
        
        return command;
    }

    
}