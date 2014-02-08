/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.util.Scanner;

/**
 *
 * @author Heather
 */
public class Rfortune {
    // Instance variables
    static String name;
    String welcomeMsg = 
              "\n\t************************************************"
            + "\n\t* Welcome to the game, Rectangle of Fortune.    *"
            + "\n\t* You will be playing against one or two other  *"
            + "\n\t* players. The object of the game is to have    *"
            + "\n\t* earned the most money by the end of the game. *"
            + "\n\t* The game ends when a player guesses the word  *"
            + "\n\t* or phrase.                                    *"
            + "\n\t*************************************************"
            + "\n";

    public static void main(String[] args) {
                
        Rfortune myGame = new Rfortune();
        myGame.getName();
        myGame.displayHelp();
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
        
        GamePreferencesView preferencesMenu = new GamePreferencesView();
        preferencesMenu.getInput();


        // TODO code application logic here
    }
    
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        Rfortune.name = input.next();
}
    public void displayHelp() {
        System.out.println("\nHello " + Rfortune.name + "!\n");
        System.out.println(this.welcomeMsg);
    }
    
}
