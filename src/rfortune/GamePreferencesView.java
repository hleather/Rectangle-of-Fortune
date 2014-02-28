/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class GamePreferencesView {
    public static String setDifficulty = "E";

    private final static String[][] menuItems = {
        {"E", "Easy"},
        {"H", "Hard"},
        {"Q", "Return to game menu"}
    };
            

    public GamePreferencesView() {
    }

   

    
    public static void getInput() {       
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            GamePreferencesView.display();

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "E":
                    System.out.println("You are in Easy mode.");
                    new GamePreferencesControl().setDifficulty("E");
                    setDifficulty = "E";
                    break;
                case "H":
                    System.out.println("You are in Hard mode.");
                    new GamePreferencesControl().setDifficulty("H");
                    setDifficulty = "H";
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
        for (String[] menuItem : GamePreferencesView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }
 
}
