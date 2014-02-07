/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

/**
 *
 * @author Heather and Laura
 */
public class HelpMenuControl  {
    
    public HelpMenuControl() {
        
    } 

    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Rectangle of Fortune. It consists of a "
                + "\n\tgrid of rectangles. The grid is 4 rows by 4 columns. "
                + "\n\tEach rectangle holds a different monetary value. Blank "
                + "\n\tspaces are also displayed. The number of blank spaces "
                + "\n\tis the amount of letters in the word or phrase."
                );
        displayHelpBorder();
    }
    
    
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe objective of the game is to be the player with the most "
                + "\n\tmoney when the word or phrase is completed. Each player "
                + "\n\ttakes a turn by guessing letters to see if it is in the "
                + "\n\tphrase. If it is in the phrase, they will earn money  "
                + "\n\tand get another turn. If not, it is the next player's "
                + "\n\tturn. The person with the most money at the end of the "
                + "\n\tgame wins! "
                ); 
        displayHelpBorder();
    }
            
    public void displayVowelHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tBuying a Vowel. If a player wants to guess a vowel, then "
               + "\n\tthey must purchase that vowel by selecting the 'buy a "
               + "\n\tvowel' button. A vowel costs $250."
                ); 
        displayHelpBorder();
    }
    
                   
    public void displayGuessHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tMaking a Guess. To make a guess on your turn, the player "
                + "\n\twill press the 'Guess a Consonant' button. The board  "
                + "\n\twill display the value of money earned if the player "
                + "\n\tguesses a correct letter. The player will then enter "
                + "\n\ta consonant. If it is in the phrase, it will appear "
                + "\n\ton the board where it is located in the phrase. "
                ); 
        displayHelpBorder();
    }
             
    public void displayPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tA player takes their turn by selecting the'Guess a Consonant' "
                + "\n\tbutton or the 'Buy a Vowel' button."
                ); 
        displayHelpBorder();
    }
   
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
  
}
