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
    public static int command;
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
            
        
            command = gamePrefsControl.getDifficulty();
                switch (command) {
                    case 1:
                        setDifficulty = "E";
                        break;
                    case 2:
                        setDifficulty = "H";
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