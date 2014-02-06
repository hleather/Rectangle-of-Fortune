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
                "\tThe game board for Tic-Tac-Toe. It consist of a grid of "
                + "\n\tlocations. Players place their marker on the different locations "
                + "\n\ton the board in an effort to win the game. The default board is "
                + "\n\t3 rows by 3 columns.");
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