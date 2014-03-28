/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import RfortuneTeam.HeatherandLaura.allMenuViews.MainMenuView;
import RfortuneTeam.HeatherandLaura.customExceptions.MenuException;
import RfortuneTeam.HeatherandLaura.customExceptions.RfortuneException;
import java.util.Scanner;


/**
 *
 * @author Heather and Laura
 */
public class Rfortune {
    // Instance variables
    private String welcomeMsg = 
              "\n\t************************************************"
            + "\n\t* Welcome to the game, Rectangle of Fortune.    *"
            + "\n\t* You will be playing against one or two other  *"
            + "\n\t* players. The object of the game is to have    *"
            + "\n\t* earned the most money by the end of the game. *"
            + "\n\t* The game ends when a player guesses the word  *"
            + "\n\t* or phrase.                                    *"
            + "\n\t*************************************************"
            + "\n";
    public static Scanner inFile = new Scanner(System.in);

    public static void main(String[] args) {
        
        //first
        Rfortune myGame = new Rfortune();
        myGame.displayHelp(); 
        
        //second
        /*MainMenuView mainMenuView = new MainMenuView();
         try {
            mainMenuView.getInput(null);
        } catch (MenuException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            Rfortune.inFile.close();
        }
    */

    }
    
    public static Scanner getInputFile() {
        return Rfortune.inFile;
    }
    
    public void displayHelp() {
        System.out.println(this.welcomeMsg);
    }
    
}
