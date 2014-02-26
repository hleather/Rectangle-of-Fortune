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
    String difficulty = GamePreferencesView.setDifficulty;
    int amount = 50;
        switch (difficulty) {
            case "E":
                amount = 25;
                break;
            case "H":
                amount = 50;
                break;
        }
    int guessCworth;
    guessCworth = amount * (1 + spin.nextInt(8));
    return guessCworth;
}

public int phraseWorth(){
    int phraseLength = BoardView.charArray.length;
    int cGuesses = Game.correctGuesses;
    int guessPworth = 100;
    int openSpaces = phraseLength - cGuesses;
    for (int i = 0; i <= openSpaces; i++)
    {
        guessPworth = guessPworth + 100;
    }
    
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
    
