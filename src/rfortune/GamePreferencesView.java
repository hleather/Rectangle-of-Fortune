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
 * @author Laura
 */
public class GamePreferencesView implements Serializable {
    static String setDifficulty = "E";

    private static String[][] menuItems = {
        {"E", "Easy"},
        {"H", "Hard"},
        {"Q", "Return to game menu"}
    };

    /**
     * @return the setDifficulty
     */
    public static String getSetDifficulty() {
        return setDifficulty;
    }

    /**
     * @param aSetDifficulty the setDifficulty to set
     */
    public static void setSetDifficulty(String aSetDifficulty) {
        setDifficulty = aSetDifficulty;
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
        setMenuItems(aMenuItems);
    }

    /**
     * @param aMenuItems the menuItems to set
     */
    public static void setMenuItems(String[][] aMenuItems) {
        menuItems = aMenuItems;
    }
            

    public GamePreferencesView() {
    }

   

    
    public static void getInput() {       
        String command;
        Scanner inFile = Rfortune.getInputFile();
        
        do {
            GamePreferencesView.display();

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "E":
                    System.out.println("You are in Easy mode.");
                    new GamePreferencesControl().setDifficulty();
                    setSetDifficulty("E");
                    break;
                case "H":
                    System.out.println("You are in Hard mode.");
                    new GamePreferencesControl().setDifficulty();
                    setSetDifficulty("H");
                    break;
                case "Q":
                    break;
                default: 
                    new RfortuneError().displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));
       
    }
    
    
        
    public static final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        for (String[] menuItem : GamePreferencesView.getMenuItems()) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }
 
}
