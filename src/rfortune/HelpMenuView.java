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
 * @author Heather and Laura
 */
/**
 *
 * @author Heather and Laura
 */
public class HelpMenuView  implements Serializable {
    
        
    private static String[][] menuItems = {
        {"B", "About The Board"}, 
        {"R", "About The Rectangle of Fortune game"},
        {"V", "About Buy a Vowel"},
        {"G", "About Make a Guess"},
        {"P", "About The Players"},        
        {"Q", "Quit Help"}        
    };

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
    
    // default constructor
    public HelpMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public static void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            HelpMenuView.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "B":
                    HelpMenuControl.displayBoardHelp();
                    break;
                case "R":
                    HelpMenuControl.displayGameHelp();
                    break;                  
                case "V":
                    HelpMenuControl.displayVowelHelp();
                    break;
                case "G":
                    HelpMenuControl.displayGuessHelp();
                    break;
                 case "P":
                    HelpMenuControl.displayPlayerHelp();
                    break; 
                case "Q": 
                    break;
                default: 
                    new RfortuneError().displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));  
    }

        // displays the help menu
    private static void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        for (String[] menuItem : HelpMenuView.getMenuItems()) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}