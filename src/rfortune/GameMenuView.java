/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.util.Scanner;

/**
 *
 * @author Heather
 */
public class GameMenuView {
    GameMenuControl gameMenuControl = new GameMenuControl(); 
    HelpMenuView helpMenuView = new HelpMenuView();

    private final static String[][] menuItems = {
        {"T", "Take your turn"},
        //{"D", "Display the board"},
        {"H", "Help"},
        {"Q", "QUIT"}
    };

    public GameMenuView() {        
    }
    
    
    public void getInput() {
   
        String command;
        Scanner inFile = new Scanner(System.in);

        do {
            if (Game.roundNumber == 0)
                menuItems[0][1] = "Start the Game";
            this.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "T":
                    gameMenuControl.takeTurn();                   
                    break;
               /* case "D":
                    gameMenuControl.displayBoard();
                    break; */
                case "H":
                    helpMenuView.getInput();
                    break;
                case "Q":                   
                    break;
                default: 
                    new RfortuneError().displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));
    }
    


    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        for (String[] menuItem : GameMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}
