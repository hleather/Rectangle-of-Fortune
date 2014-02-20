/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

/**
 *
 * @author Laura
 */
public class GamePreferencesControl {

    public GamePreferencesControl() {
    }
          
    public void setDifficulty(String difficulty) {
        new WordsAndPhrases().setPhrase(difficulty);           
    }
    
    
}
