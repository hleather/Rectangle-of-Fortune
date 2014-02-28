/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.util.Scanner;

/**
 * called from: Rfortune
 * @author Heather
 */
public class MainMenuView {
    public static String command;   
    private static final String[][] menuItems = {
        {"1", "One player game"},
        {"2", "Two player game"},
        {"3", "Three player game"},
        {"P", "Change game preferences"},
        {"H", "Help"},
        {"X", "Exit Tic-Tac-Toe"}
    };       
    PlayersList myList = new PlayersList();
    MainMenuControl mainMenuControl = new MainMenuControl();
    Player myPlayers = new Player();    
    
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
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":  
                    mainMenuControl.setNumPlayers(1);
                    myPlayers.getPlayerNames();
                    Bank.numPlayersBank();
                    mainMenuControl.setScreen();             
                    break;
                case "2":
                    mainMenuControl.setNumPlayers(2);
                    myPlayers.getPlayerNames();
                    Bank.numPlayersBank();
                    mainMenuControl.setScreen();                    
                    break;
                case "3":
                    mainMenuControl.setNumPlayers(3);
                    myPlayers.getPlayerNames();
                    Bank.numPlayersBank();
                    mainMenuControl.setScreen();
                    break;
                case "P":
                    GamePreferencesView.getInput();
                    break;
                case "H":
                    mainMenuControl.displayHelpMenu();            
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
    
    
    /***************************************************************************
     * display(). puts the instructions/prompt on the screen for the user.
     **************************************************************************/ 
    public final void display() {
        System.out.println("\n\t==============================================="
                + "================");
        System.out.println("\tEnter the letter associated with one of the "
                + "following commands:");
        for (String[] menuItem : MainMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t================================================="
                + "==============\n");
    }   
    
}