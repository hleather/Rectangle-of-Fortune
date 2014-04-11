/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Heather and Laura
 */
public class PlayersList implements Serializable {

    private static boolean justRight = false;

    ArrayList playerList = new ArrayList();
    

    
    public static boolean getJustRight(){
        return justRight;
    }
    
    public static void setJustRight(boolean right) {
        justRight = right;
    }

    public PlayersList() {

    }

    public void checkInput(String playerName) {
        int control = 0;
        if (playerName.length() < 1) {
            setJustRight(false);
            control++;
            new RfortuneError().displayError("\tA name must be at least one "
                    + "character long.");
        }
        if (playerName.length() > 10) {
            setJustRight(false);
            control++;
            new RfortuneError().displayError("\tA name cannot be more than 10 "
                    + "characters long.");
        }
            if (playerList.contains(playerName)) {
                setJustRight(false);
                control++;
                new RfortuneError().displayError("That name has already been "
                        + "entered.");
            } else if (!playerList.contains(playerName) && control == 0) {
                new RfortuneError().displayError("Valid.");
                playerList.add(playerName);
                setJustRight(true);
                }
    }
    public void resetList() {
        playerList.clear();
    }

    }

