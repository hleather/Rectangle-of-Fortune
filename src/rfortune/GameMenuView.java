/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.io.Serializable;

import java.util.Scanner;

/**
 *
 * @author Heather
 */
public class GameMenuView implements Serializable {

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
    private static String[][] menuItems = {
        {"T", "Take your turn"},
        {"H", "Help"},
        {"Q", "QUIT"}
    };

    public GameMenuView() {        
    }
    
    
    public static void getInput() {
        String command;
        Scanner inFile = Rfortune.getInputFile();

        do {
            if (Game.getRoundNumber() == 0)
                getMenuItems()[0][1] = "Start the Game";
            GameMenuView.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "T":
                    GameMenuControl.takeTurn();                   
                    break;
                case "H":
                    HelpMenuView.getInput();
                    break;
                case "Q":                   
                    break;
                default: 
                    new RfortuneError().displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));
    }
    


    private static void display() {
        new RfortuneMessage().displayMessage("Enter the letter associated with "
                + "one of the following commands:");
        
        for (String[] menuItem : GameMenuView.getMenuItems()) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
    }
  
}
