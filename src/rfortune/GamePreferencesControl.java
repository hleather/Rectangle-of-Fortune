/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.awt.Dimension;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Laura
 */
public class GamePreferencesControl {
    private Game game;

    public GamePreferencesControl(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
          
    
    public void setDifficulty() {
        System.out.println("\n\tsetDifficulty called");
   
    }
    
    
}
