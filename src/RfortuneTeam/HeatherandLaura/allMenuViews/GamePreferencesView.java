/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.allMenuViews;

import RfortuneTeam.HeatherandLaura.control.GamePreferencesControl;
import RfortuneTeam.HeatherandLaura.customExceptions.MenuException;

/**
 *
 * @author Laura
 */
public class GamePreferencesView extends Menu {
    public static String command;
    public static String setDifficulty = "E";
    GamePreferencesControl gamePrefsControl = new GamePreferencesControl();

    private final static String[][] menuItems = {
        {"E", "Easy"},
        {"H", "Hard"},
        {"Q", "Return to game menu"}
    };
    

    public GamePreferencesView() {
        super(GamePreferencesView.menuItems);
    }

   

        public String getInput() throws MenuException {  
            
        
            command = null;
                switch (command) {
                    case "E":
                        setDifficulty = "E";
                        break;
                    case "H":
                        setDifficulty = "H";
                        break;
                    case "Q":
                        break;
                }
            
        return null;

    }
    
       private void determineDifficultyLevel(){
        
        if (gamePrefsControl.getDifficulty() == 1) {
            System.out.println("You are in Easy mode.");
        }
        if (gamePrefsControl.getDifficulty() == 2) {
            System.out.println("You are in Hard mode.");
        }
       }
        
}