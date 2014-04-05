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
    private int difficultyMode;

    public GamePreferencesControl() {
    }
          
    public void setDifficulty(int mode) {    
        difficultyMode = mode;
    }
    
    public int getDifficulty() {
        return difficultyMode;        
    }
    
    
}
