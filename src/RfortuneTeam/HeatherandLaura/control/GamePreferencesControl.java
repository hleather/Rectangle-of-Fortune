/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RfortuneTeam.HeatherandLaura.control;

import rfortune.RfortuneMessages;


/**
 *
 * @author Laura
 */
public class GamePreferencesControl {

    private static int difficultyMode = 1;

    public GamePreferencesControl() {
    }

    public void setDifficulty(int mode) {
        difficultyMode = mode;
         if (difficultyMode == 1) {
            new RfortuneMessages().displayMessage("You are in Easy mode.");
        }
        if (difficultyMode == 2) {
            new RfortuneMessages().displayMessage("You are in Hard mode.");
        }
    }

    public static int getDifficulty() {
        return difficultyMode;
    }

}
