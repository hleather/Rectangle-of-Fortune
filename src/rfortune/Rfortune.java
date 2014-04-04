/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import RfortuneTeam.HeatherandLaura.allMenuViews.MainMenuView;
import RfortuneTeam.HeatherandLaura.customExceptions.MenuException;
import RfortuneTeam.HeatherandLaura.frames.MainFrame;
import java.util.Scanner;

/**
 *
 * @author Heather and Laura
 */
public class Rfortune {

    // Instance variables
    private String welcomeMsg
            = "\n\t************************************************"
            + "\n\t* Welcome to the game, Rectangle of Fortune.    *"
            + "\n\t* You will be playing against one or two other  *"
            + "\n\t* players. The object of the game is to have    *"
            + "\n\t* earned the most money by the end of the game. *"
            + "\n\t* The game ends when a player guesses the word  *"
            + "\n\t* or phrase.                                    *"
            + "\n\t*************************************************"
            + "\n";
    public static Scanner inFile = new Scanner(System.in);
    MainFrame mainFrame = new MainFrame();

    public static void main(String[] args) {
        Rfortune rFortune = null;
        

        //first
       // Rfortune myGame = new Rfortune();
        //myGame.displayHelp();

        //second
        try {
            rFortune = new Rfortune();
            
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    MainFrame mainFrame = new MainFrame();
                    
                    mainFrame.setVisible(true);
                }
            });



        } finally {
            Rfortune.inFile.close();
          //  if(Rfortune.mainFrame != null) {
            //    Rfortune.mainFrame.dispose();
            }
            
        }

    public static Scanner getInputFile() {
        return Rfortune.inFile;
    }

    public void displayHelp() {
        System.out.println(this.welcomeMsg);
    }

}
