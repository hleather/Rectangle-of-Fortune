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



/**
 *
 * @author Heather and Laura
 */
public class HelpMenuView extends Menu {
    public static String command;
    private final static String[][] menuItems = {
        {"B", "About The Board"}, 
        {"R", "About The Rectangle of Fortune game"},
        {"V", "About Buy a Vowel"},
        {"G", "About Make a Guess"},
        {"P", "About The Players"},        
        {"Q", "Quit Help"}        
    };
    
    // default constructor
    public HelpMenuView() {
        super(HelpMenuView.menuItems);
    } 
        public enum displayCommand {
        BOARDHELP ("The game board for Rectangle of Fortune consists of  "
                + "blank spaces that associate with the word or phrase that needs "
                + "to be guessed. When a correct letter is guessed it is displayed on "
                + "the board in it's appropriate location."),
        GAMEHELP ("The objective of the game is to be the player with the most "
                + "money when the word or phrase is completed. Each player "
                + "takes a turn by guessing letters to see if it is in the "
                + "phrase. If it is in the phrase, they will earn money  "
                + "and get another turn. If not, it is the next player's "
                + "turn. The person with the most money at the end of the "
                + "game wins! "),
        VOWELHELP ("If a player wants to guess a vowel on thier turn, then "
               + "they must purchase that vowel by selecting the 'buy a "
               + "vowel' button. A vowel costs $250. If they do not have enough" 
               + " money, they cannot buy a vowel."),
        GUESSHELP ("To make a guess on your turn, the player "
                + "will press the 'Guess a Consonant' button. The board  "
                + "will display the value of money earned if the player "
                + "guesses a correct letter. The player will then enter "
                + "a consonant. If it is in the phrase, it will appear "
                + "on the board where it is located in the phrase. "
                + "A player may also guess the entire phrase on their turn if "
                + "they think they know the answer. To do this the player selects"
                + "the 'Guess the phrase' button and enters their guess."),
        PLAYERHELP ("A player takes their turn by selecting the'Guess a Consonant' "
                +"button, the 'Buy a Vowel' button, or 'Guess the Phrase' button.");
        
        String message;
        
        private displayCommand(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
        public String display() {
            return this.message;
        }
    }
   
}
