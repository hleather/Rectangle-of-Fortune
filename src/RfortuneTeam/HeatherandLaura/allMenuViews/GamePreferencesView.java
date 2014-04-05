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
    GamePreferencesControl gamePrefs = new GamePreferencesControl();

    private final static String[][] menuItems = {
        {"E", "Easy"},
        {"H", "Hard"},
        {"Q", "Return to game menu"}
    };
    

    public GamePreferencesView() {
        super(GamePreferencesView.menuItems);
    }

   

        public String getInput() throws MenuException {  
            
        
            command = gamePrefs.getDifficulty();
                switch (command) {
                    case "E":
                        setDifficulty = "E";
                        determineDifficultyLevel(1);
                        break;
                    case "H":
                        setDifficulty = "H";
                        determineDifficultyLevel(2);
                        break;
                    case "Q":
                        break;
                }
            
        return null;

    }
    
       private void determineDifficultyLevel(int levelNumber) throws MenuException {
        
        if (levelNumber != 1  &&  levelNumber != 2) {
            throw new MenuException("determineDifficultyLevel - invalid number "
                    + "of players specified.");
        }
        
        if (levelNumber == 1) {
            System.out.println("You are in Easy mode.");
        }
        else if (levelNumber == 2) {
            System.out.println("You are in Hard mode.");
        }
       }
        
}