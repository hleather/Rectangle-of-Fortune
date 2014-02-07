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
                + "\n\ttakes a turn by pressing a button to see how much money "
                + "\n\tthey will win for guessing correct letters. They then "
                + "\n\tguess a letter to see if it is in the phrase. If it is  "
                + "\n\tin the phrase, they will earn money and get another turn. "
                + "\n\tIf not, it is the next player's turn. The person with"
                + "\n\tthe most money at the end of the game wins! "
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
                + "\n\twill press the 'Play' button. The board will light up "
                + "\n\tthe value of money earned if the player guesses a letter "
                + "\n\tin the word or phrase. The player then will then enter "
                +  "\n\ta consonant. If it is in the phrase, it will appear "
                + "\n\ton the board where it is located in the phrase. "
                ); 
        displayHelpBorder();
    }
             
    public void displayPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tA location on the board where a player can place their marker"
                ); 
        displayHelpBorder();
    }
   
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
  
}
