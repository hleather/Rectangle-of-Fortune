 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.allMenuViews;

/**
 *
 * @author Heather and Laura
 */
import rfortune.HelpMenuControl;
import rfortune.Menu;
import rfortune.RfortuneError;
import java.util.Scanner;



/**
 *
 * @author Heather and Laura
 */
public class HelpMenuView extends Menu {
        
    private final static String[][] menuItems = {
        {"B", "About The Board"}, 
        {"R", "About The Rectangle of Fortune game"},
        {"V", "About Buy a Vowel"},
        {"G", "About Make a Guess"},
        {"P", "About The Players"},        
        {"Q", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        super(HelpMenuView.menuItems);
    } 
    
    // display the help menu and get the end users input selection
    public String getInput() {       
              
       String command;
       Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "B":
                    helpMenuControl.displayBoardHelp();
                    break;
                case "R":
                    helpMenuControl.displayGameHelp();
                    break;                  
                case "V":
                    helpMenuControl.displayVowelHelp();
                    break;
                case "G":
                    helpMenuControl.displayGuessHelp();
                    break;
                 case "P":
                    helpMenuControl.displayPlayerHelp();
                    break; 
                case "Q": 
                    break;
                default: 
                    new RfortuneError().displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));  
        return null;
    }

}