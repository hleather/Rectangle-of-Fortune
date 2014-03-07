/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.util.Scanner;

/**
 *
 * @author Heather and Laura
 */
public class PlayersList {
    
    public static String[] listOfPlayerNames = new String[10];
    
    public PlayersList(){
        
    }
    
    public String[] getInput(){
        Scanner inFile = Rfortune.getInputFile();
        
        System.out.println("\n\t-----------------------------------------------");
        System.out.println("\t Enter a list of names of those who \n\t will be "
                + "playing Rectangle of Fortune.");
        System.out.println("\t-----------------------------------------------");
        
        int playerIndex = 0;
        boolean done = false;
        while (playerIndex < 10 && !done){
            System.out.println("\tPlease enter the name of a player or enter "
                    + "\"Q\" to quit.");
            String playerName;
            playerName= inFile.nextLine();
            playerName = playerName.trim();
            
            if (playerName.length()< 1){
                new RfortuneError().displayError("\tA name must be at least one "
                        + "character long. Try again or enter \"Q\" to quit.");
                continue;
            }
            
            if (alreadyInList(listOfPlayerNames, playerName)){
                new RfortuneError().displayError("That name has already been "
                        + "entered. Try again or enter \"Q\" to quit.");
                continue;
            }
            
            if (playerName.toUpperCase().equals("Q")){
                done = true;
                break;            
            }
            
            this.listOfPlayerNames[playerIndex] = playerName;
            playerIndex++;
            
            if (playerIndex == MainMenuControl.setNumPlayers)
            {
                done = true;
                break;
            }
                    
        }
            
            String[] newNameList = new String[playerIndex];
            for (int i = 0; i < playerIndex; i++){
                newNameList[i] = this.listOfPlayerNames[i];
            }
            
            newNameList = this.sortList(newNameList);
            //this.displayNameList(newNameList);
            
            return newNameList;
    }
    
    public String[] sortList(String[] names){
        String tempName;
        boolean notDone = true;
        while(notDone){
            
            notDone = false;
            for (int i = 0; i < names.length - 1; i++){
                int compareResult = names[i].compareTo(names[i+1]);
                if (compareResult > 0){
                    tempName = names[i];
                    names[i] = names[i+1];
                    names[i+1] = tempName;
                    notDone = true;
                }
            }
        }
        
        return names;
    }
     
    
    private boolean alreadyInList(String[] list, String value) {
            for (String valueInList : list){
                if(value.equals(valueInList)){
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
   
    

