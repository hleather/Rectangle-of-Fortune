/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class GameTurnView {
    private Game game = new Game();
    private HelpMenuView helpMenuView = new HelpMenuView();
    
    private final static String[][]turnOptions = {
        {"G", "Guess a letter"},
        {"V", "Buy a vowel"},
        {"P", "Guess the phrase"},
        {"H", "Help"},
        {"Q", "QUIT"}
    };
    
    public GameTurnView(){
        
    }
    /*********************************************************************
     * Gets input for what player wants to do on their turn.
     *********************************************************************/
    public void getInput(){
        
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();
            
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                //guess a letter.
                case "L":
                    this.game.determineUserGuess();
                    break;
                //guess a vowel
                case "V":
                    this.game.buyAVowel();
                    break;
                //guess the phrase
                case "P":
                    //this.game.guessPhrase();
                //help menu
                case "H":
                    this.helpMenuView.getInput();
                    break;
                //Quit
                case "Q":
                    break;
                default:
                    new RfortuneError().displayError("Invalid command. Please enter a valid command.");
            }
        } while (!command.equals("Q"));
    }
    
    public final void display() {
        System.out.println("\n\t===========================================");
        System.out.println("Enter the letter associated with one of the "
                + "options:");
        for (String[] turnOptions : GameTurnView.turnOptions) {
            System.out.println("\t  " +turnOptions[0] + "\t" + turnOptions[1]);
        }
        System.out.println("\t============================================");
    }
    
}

