/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.io.Serializable;
import java.util.Scanner;

/**
 * called from: Rfortune
 * @author Heather
 */
public class MainMenuView implements Serializable {
    private static String command;  // double check this is used somewhere else 
    private static String[][] menuItems = {
        {"1", "One player game"},
        {"2", "Two player game"},
        {"3", "Three player game"},
        {"P", "Change game preferences"},
        {"H", "Help"},
        {"X", "Exit Rectangle of Fortune"}
    };

    /**
     * @return the command
     */
    public static String getCommand() {
        return command;
    }

    /**
     * @param aCommand the command to set
     */
    public static void setCommand(String aCommand) {
        command = aCommand;
    }

    /**
     * @return the menuItems
     */
    public static String[][] getMenuItems() {
        return menuItems;
    }

    /**
     * @param aMenuItems the menuItems to set
     */
    public static void setMenuItems(String[][] aMenuItems) {
        menuItems = aMenuItems;
    }
    private PlayersList myList = new PlayersList();
    private MainMenuControl mainMenuControl = new MainMenuControl();
    private Player myPlayers = new Player();    
    private HelpMenuView helpMenuView = new HelpMenuView();
    
    public MainMenuView() {
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
            setCommand(inFile.nextLine());
            setCommand(getCommand().trim().toUpperCase());
            
            switch (getCommand()) {
                case "1":  
                    getMainMenuControl().setNumPlayers(1);
                    getMyPlayers().getPlayerNames();
                    Bank.numPlayersBank();
                    Game.newGame();
                    getMainMenuControl().setScreen();             
                    break;
                case "2":
                    getMainMenuControl().setNumPlayers(2);
                    getMyPlayers().getPlayerNames();
                    Bank.numPlayersBank();
                    Game.newGame();
                    getMainMenuControl().setScreen();                    
                    break;
                case "3":
                    getMainMenuControl().setNumPlayers(3);
                    getMyPlayers().getPlayerNames();
                    Bank.numPlayersBank();
                    Game.newGame();
                    getMainMenuControl().setScreen();
                    break;
                case "P":
                    GamePreferencesView.getInput();
                    break;
                case "H":
                    getHelpMenuView().getInput();
                    break;
                case "X":
                    break;
                default: 
                    new RfortuneError().displayError("Invalid command. Please "
                            + "enter a valid command.");
            }
        } while (!command.equals("X"));
        
        return getCommand();
    }
    
    
    /***************************************************************************
     * display(). puts the instructions/prompt on the screen for the user.
     **************************************************************************/ 
    public final void display() {
        System.out.println("\n\t==============================================="
                + "================");
        System.out.println("\tEnter the letter associated with one of the "
                + "following commands:");
        for (String[] menuItem : MainMenuView.getMenuItems()) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t================================================="
                + "==============\n");
    }   

    /**
     * @return the myList
     */
    public PlayersList getMyList() {
        return myList;
    }

    /**
     * @param myList the myList to set
     */
    public void setMyList(PlayersList myList) {
        this.myList = myList;
    }

    /**
     * @return the mainMenuControl
     */
    public MainMenuControl getMainMenuControl() {
        return mainMenuControl;
    }

    /**
     * @param mainMenuControl the mainMenuControl to set
     */
    public void setMainMenuControl(MainMenuControl mainMenuControl) {
        this.mainMenuControl = mainMenuControl;
    }

    /**
     * @return the myPlayers
     */
    public Player getMyPlayers() {
        return myPlayers;
    }

    /**
     * @param myPlayers the myPlayers to set
     */
    public void setMyPlayers(Player myPlayers) {
        this.myPlayers = myPlayers;
    }

    /**
     * @return the helpMenuView
     */
    public HelpMenuView getHelpMenuView() {
        return helpMenuView;
    }

    /**
     * @param helpMenuView the helpMenuView to set
     */
    public void setHelpMenuView(HelpMenuView helpMenuView) {
        this.helpMenuView = helpMenuView;
    }
    
}