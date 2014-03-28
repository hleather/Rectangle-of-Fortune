/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.allMenuViews;

import java.util.Scanner;
import RfortuneTeam.HeatherandLaura.control.GamePreferencesControl;
import rfortune.Menu;
import rfortune.Rfortune;
import rfortune.RfortuneError;

/**
 *
 * @author Laura
 */
public class GamePreferencesView extends Menu {
    public static String setDifficulty = "E";

    private final static String[][] menuItems = {
        {"E", "Easy"},
        {"H", "Hard"},
        {"Q", "Return to game menu"}
    };
            

    public GamePreferencesView() {
        super(GamePreferencesView.menuItems);
    }

   

        public String getInput() {       
        String command;
        Scanner inFile = Rfortune.getInputFile();
        
        do {
            this.display();

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "E":
                    System.out.println("You are in Easy mode.");
                    new GamePreferencesControl().setDifficulty();
                    setDifficulty = "E";
                    break;
                case "H":
                    System.out.println("You are in Hard mode.");
                    new GamePreferencesControl().setDifficulty();
                    setDifficulty = "H";
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