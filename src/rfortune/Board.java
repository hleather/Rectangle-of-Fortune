/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.util.Random;
/**
 *
 * @author Heather
 */
public class Board {
    int lengthPhraseCount = 8;   
    static boolean foundMatch = false;

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
        new RfortuneError().displayError("That is not in the phrase. Your turn is over.");
       
    }
    
  
    
public int spinWorth(){
    Random spin = new Random();
    int guessLworth;
    guessLworth = 25 * (1 + spin.nextInt(8));
    return guessLworth;
}

public int phraseWorth(){
    
    
    int guessPworth = 100;
    
    return guessPworth;
}
    
public void displayBoardView() {
        BoardView myBoardView =  new BoardView();
        myBoardView.getPhrase(null);
        myBoardView.getParallelPhrase(null);
        myBoardView.defaultDisplayBoard(null);
        myBoardView.getCharGuess();
}
}
    
