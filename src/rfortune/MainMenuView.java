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


public class MainMenuView {
    public static String command;
    
    
    private static final String[][] menuItems = {
        {"1", "One player game"},
        {"2", "Two player game"},
        {"3", "Three player game"},
        {"H", "Help"},
        {"X", "Exit Tic-Tac-Toe"}
    }; 
  
    MainMenuControl mainMenuControl = new MainMenuControl();
    Player myPlayers = new Player();
  
        
    public MainMenuView() {
    }
 
    
    public String getInput() {       

        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":
                    this.myPlayers.getPlayerNames(1);
                    this.mainMenuControl.setScreen(1);
                    new PlayerTurn().playersTurn(1);
                    break;
                case "2":
                    this.myPlayers.getPlayerNames(2);
                    this.mainMenuControl.setScreen(2);
                    new PlayerTurn().playersTurn(2);
                    break;
                case "3":
                    this.myPlayers.getPlayerNames(3);
                    this.mainMenuControl.setScreen(3);
                    new PlayerTurn().playersTurn(3);
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();            
                    break;
                case "X":
                    break;
                default: 
                    new RfortuneError().displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("X"));

        return command;
    }
    

    
    
   public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        for (String[] menuItem : MainMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }   
    
}