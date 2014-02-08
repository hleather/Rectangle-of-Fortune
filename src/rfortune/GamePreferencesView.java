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
                    System.out.println("You are on easy mode.");
                    break;
                case "H":
                    System.out.println("You are on hard mode.");
                    break;
                case "Q":
                    break;
                default: 
                    new RfortuneError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("Q"));

        return;
    }
    
    
        
    public static final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GamePreferencesView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
 
}
