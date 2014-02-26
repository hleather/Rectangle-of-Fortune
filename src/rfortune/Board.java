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
public class Board {
    int lengthPhraseCount = 8;   
    static boolean foundMatch = false;  
    
    /***************************************************************************
     * searchPhrase(). goes through the character array of the current phrase
     * and checks to see if the guessed letter from BoardView is in the phrase.
     * If it is, foundMatch is set to true and the function displays the 
     * parallel phrase with the correctly guessed letter instead of the '-'
     * placeholder. If it is not, foundMatch is set to false and the players
     * turn is terminated.
     **************************************************************************/
    public static void searchPhrase(){
        for(int i = 0; i  < BoardView.charArray.length; i++){
            if(BoardView.charArray[i] == (BoardView.guess)){
                BoardView.parallelCharArray[i] = BoardView.guess;
                Board.foundMatch = true;
            }
        }
        if(Board.foundMatch)
            System.out.println("You have a match.");
        for (int i = 0; i< BoardView.parallelCharArray.length; i++) {
            System.out.println(BoardView.parallelCharArray[i]);
        }
        if(!Board.foundMatch)
            new RfortuneError().displayError("That is not in the phrase. "
                    + "Your turn is over.");
        // *!*Need something here to initiate the next player's turn.*!*
    }
    
    /***************************************************************************
    * displayBoardView(). displays the different items that make up the screen
    * the user sees while playing the game.
    ***************************************************************************/
    public void displayBoardView() {
        BoardView myBoardView =  new BoardView();
        myBoardView.getPhrase(null);
        myBoardView.getParallelPhrase(null);
        myBoardView.defaultDisplayBoard(null);
        myBoardView.getCharGuess();
    }
}
    
