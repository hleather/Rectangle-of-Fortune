/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

/**
 *
 * @author Heather
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
                + "\n\tis the amount of letters in the word or phrase. When a"
                + "\n\t");
        displayHelpBorder();
    }
    
    
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe objective of the game is to be the first player to mark three "
                + "\n\tsquares vertically, horizontally or diagonally. Each player takes "
                + "\n\tturns placing their marker in one of the locations on the "
                + "\n\tboard. The first player to get \"three-in-a-row\" is the winner."
                ); 
        displayHelpBorder();
    }
            
    public void displayVowelHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA real player manually takes their turn by placing their mark "
                + "\n\tin an unused location on the board."
                ); 
        displayHelpBorder();
    }
    
                   
    public void displayGuessHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA computer based player automatically takes its turn "
                + "\n\timmediatly after a real player in a single player game."
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
