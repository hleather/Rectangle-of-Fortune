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

    ArrayList playerList = new ArrayList();

    public PlayersList() {

    }

    public void checkInput(String playerName) {
        if (playerName.length() < 1) {
            new RfortuneError().displayError("\tA name must be at least one "
                    + "character long.");
        }
        if (playerList.contains(playerName)) {
            new RfortuneError().displayError("That name has already been "
                    + "entered.");
        } else if (!playerList.contains(playerName)) {
            new RfortuneError().displayError("Valid.");
            playerList.add(playerName);
        }

    }
}
