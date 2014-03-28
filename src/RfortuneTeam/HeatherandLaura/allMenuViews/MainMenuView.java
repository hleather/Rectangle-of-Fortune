/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RfortuneTeam.HeatherandLaura.allMenuViews;

import rfortune.Bank;
import rfortune.Game;
import RfortuneTeam.HeatherandLaura.control.MainMenuControl;
import RfortuneTeam.HeatherandLaura.customExceptions.MenuException;
import rfortune.Player;
import rfortune.PlayersList;
//import rfortune.Rfortune;
/**
 * called from: Rfortune
 *
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

    /**
     * *************************************************************************
     * getInput(). displays the multi-dimensional array menuItems and gets the
     * selected input from the user. It passes the number of players as it is
     * calls getPlayerNames from Player, setScreen from MainMenuControl,
     * playerTurn from PlayerTurn and numPlayersBank from Bank. Otherwise, it
     * displays the HelpMenu from MainMenuControl, ends the session or displays
     * and error message if the input is invalid.
     *
     * @param object
     * @return command
     *************************************************************************
     */
    
    public String getInput(Object object) {
        do {
            try {
                this.display(); // display the menu

                // get commaned entered
                command = this.getCommand();
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
                       // quitGame();
                        break;
                }
            } catch (MenuException e) {
                System.out.println("\n" + e.getMessage());
            }
        } while (!command.equals("X"));
        return command;
    }
    /*private String quitGame() throws MenuException {
        System.out.println("\n\tAre you sure you want to quit? (Y or N)");
        String answer = this.getCommand();
        switch (answer) {
            case "Y":
                Rfortune.inFile.close();;
            case "N":
                getInput();
            default:
                throw new MenuException("MainMenuView, quitGame - invalid entry.");
        }*/
    }


//}
