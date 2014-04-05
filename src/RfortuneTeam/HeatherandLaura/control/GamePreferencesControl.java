/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.control;

/**
 *
 * @author Laura
 */
public class GamePreferencesControl {
    private String difficultyMode = "E";

    public GamePreferencesControl() {
    }
          
    public void setDifficulty(String mode) {    
        difficultyMode = mode;
    }
    
    public String getDifficulty() {
        return difficultyMode;        
    }
    
    
}
