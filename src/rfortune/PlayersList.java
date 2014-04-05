/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import RfortuneTeam.HeatherandLaura.control.MainMenuControl;
import java.io.Serializable;

/**
 *
 * @author Heather and Laura
 */
public class PlayersList implements Serializable {

    private static String[] listOfPlayerNames = new String[10];

    /**
     * @return the listOfPlayerNames
     */
    public static String[] getListOfPlayerNames() {
        return listOfPlayerNames;
    }

    /**
     * @param aListOfPlayerNames the listOfPlayerNames to set
     */
    public static void setListOfPlayerNames(String[] aListOfPlayerNames) {
        listOfPlayerNames = aListOfPlayerNames;
    }

    public PlayersList() {

    }

    public String[] checkInput(String playerName) {
        int playerIndex = 0;
        boolean done = false;
        while (playerIndex < 10 && !done) {
            int control = 2;

            if (playerName.length() < 1) {
                new RfortuneError().displayError("\tA name must be at least one "
                        + "character long.");
                control--;
                done = true;
                continue;
            } if (alreadyInList(getListOfPlayerNames(), playerName)) {
                new RfortuneError().displayError("That name has already been "
                        + "entered.");
                control--;
                done = true;
                continue;
            } if(control == 2) {
                new RfortuneError().displayError("Valid.");
                
                done = true;
            }

            PlayersList.getListOfPlayerNames()[playerIndex] = playerName;
            playerIndex++;
            

            if (playerIndex == MainMenuControl.getSetNumPlayers()) {
                done = true;
                break;
            }

        }

        String[] newNameList = new String[playerIndex];
        System.arraycopy(PlayersList.getListOfPlayerNames(), 0, newNameList, 0, playerIndex);

        newNameList = this.sortList(newNameList);
        //this.displayNameList(newNameList);

        return newNameList;
    }

    private String[] sortList(String[] names) {
        String tempName;
        boolean notDone = true;
        while (notDone) {

            notDone = false;
            for (int i = 0; i < names.length - 1; i++) {
                int compareResult = names[i].compareTo(names[i + 1]);
                if (compareResult > 0) {
                    tempName = names[i];
                    names[i] = names[i + 1];
                    names[i + 1] = tempName;
                    notDone = true;
                }
            }
        }

        return names;
    }

    private boolean alreadyInList(String[] list, String value) {
        for (String valueInList : list) {
            if (value.equals(valueInList)) {
                return true;
            }
        }
        return false;
    }

    /*public void displayNameList(String[] names){
     System.out.println("\n\t=========================================");
     System.out.println("\tHere is the list of players in the game:");
            
     for (int i = 0; i <names.length; i++){
     if (names[i] == null){
     break;
     }
                
     int namePosition = i+1;
     System.out.println("\t   " + namePosition + "\t" + names[i]);
                
     }
     System.out.println("\t=========================================");
            
     }*/
}
