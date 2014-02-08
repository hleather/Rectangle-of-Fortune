 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

/**
 *
 * @author Heather and Laura
 */
import java.util.Scanner;



/**
 *
 * @author Heather and Laura
 */
public class HelpMenuView  {
        
    private final static String[][] menuItems = {
        {"B", "The Board"}, 
        {"R", "The Rectangle of Fortune game"},
        {"V", "Buy a Vowel"},
        {"G", "Make a Guess"},
        {"P", "The Players"},        
        {"Q", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "B":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "R":
                    this.helpMenuControl.displayGameHelp();
                    break;                  
                case "V":
                    this.helpMenuControl.displayVowelHelp();
                    break;
                case "G":
                    this.helpMenuControl.displayGuessHelp();
                    break;
                 case "P":
                    this.helpMenuControl.displayPlayerHelp();
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

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}