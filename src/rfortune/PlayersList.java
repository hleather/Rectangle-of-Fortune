/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import RfortuneTeam.HeatherandLaura.enums.ErrorType;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Heather and Laura
 */
public class PlayersList implements Serializable {

    private static boolean justRight = false;
    

    
    public static boolean getJustRight(){
        return justRight;
    }

    public static void setJustRight(boolean right) {
        justRight = right;
    }

    public PlayersList() {

    }
    
    public void checkInput(String playerName) {
        ArrayList playerList = new ArrayList();
        int control = 0;
        if (playerName.length() < 1) {
            setJustRight(false);
            control++;
            ErrorType.ERROR107.displayErrorType();
        }
        if (playerName.length() > 10) {
            setJustRight(false);
            control++;
            ErrorType.ERROR108.displayErrorType();
        }
        if (playerList.contains(playerName)) {
            setJustRight(false);
            control++;
            ErrorType.ERROR109.displayErrorType();
        } else if (!playerList.contains(playerName) && control == 0) {
            ErrorType.ERROR201.displayErrorType();
            try {
                playerList.add(playerName);
            } catch (Throwable ex) {
                ErrorType.ERROR202.displayErrorType();
            }
            setJustRight(true);
        }
    }

    public void resetList() {
        playerList.clear();
    }

}
