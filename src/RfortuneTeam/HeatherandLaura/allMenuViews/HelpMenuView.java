 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.allMenuViews;

/**
 *
 * @author Heather and Laura
 */
import RfortuneTeam.HeatherandLaura.control.HelpMenuControl;
import rfortune.Menu;
import rfortune.RfortuneError;
import java.util.Scanner;



/**
 *
 * @author Heather and Laura
 */
public class HelpMenuView extends Menu {
        
    private final static String[][] menuItems = {
        {"B", "About The Board"}, 
        {"R", "About The Rectangle of Fortune game"},
        {"V", "About Buy a Vowel"},
        {"G", "About Make a Guess"},
        {"P", "About The Players"},        
        {"Q", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        super(HelpMenuView.menuItems);
    } 
        public enum displayCommand {
        BOARDHELP ("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
            + "\n\tThe game board for Rectangle of Fortune. It consists of  "
                + "\n\tblanks that associate with the word or phrase that needs "
                + "\n\tto be guessed. As a letter is guessed it is displayed in "
                + "\n\tthe board."
    + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"),
        GAMEHELP ("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
            + "\n\tThe objective of the game is to be the player with the most "
                + "\n\tmoney when the word or phrase is completed. Each player "
                + "\n\ttakes a turn by guessing letters to see if it is in the "
                + "\n\tphrase. If it is in the phrase, they will earn money  "
                + "\n\tand get another turn. If not, it is the next player's "
                + "\n\tturn. The person with the most money at the end of the "
                + "\n\tgame wins! "
    + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"),
        VOWELHELP ("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" 
            + "\n\tBuying a Vowel. If a player wants to guess a vowel, then "
               + "\n\tthey must purchase that vowel by selecting the 'buy a "
               + "\n\tvowel' button. A vowel costs $250." 
    + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"),
        GUESSHELP ("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
            + "\n\tMaking a Guess. To make a guess on your turn, the player "
                + "\n\twill press the 'Guess a Consonant' button. The board  "
                + "\n\twill display the value of money earned if the player "
                + "\n\tguesses a correct letter. The player will then enter "
                + "\n\ta consonant. If it is in the phrase, it will appear "
                + "\n\ton the board where it is located in the phrase. "
    + "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"),
        PLAYERHELP ("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "\n\tA player takes their turn by selecting the'Guess a Consonant' "
                + "\n\tbutton or the 'Buy a Vowel' button." + 
                "\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        String message;
        
        private displayCommand(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
        public void display() {
            System.out.println(this.message);
        }
    }
    // display the help menu and get the end users input selection


    public String getInput() {
        

              
       String command;
       Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            
            
            switch (command) {
                case "B":
                    displayCommand.BOARDHELP.display();
                    break;
                case "R":
                   displayCommand.GAMEHELP.display();
                    break;                  
                case "V":
                    displayCommand.VOWELHELP.display();
                    break;
                case "G":
                    displayCommand.GUESSHELP.display();
                    break;
                 case "P":
                    displayCommand.PLAYERHELP.display();
                    break;
                 case "Q": 
                    break;
                 default: 
                     new RfortuneError().displayError("Invalid command. Please enter a valid command.");
            }
            
        } while (!command.equals("Q"));  
        return null;
    }
}
