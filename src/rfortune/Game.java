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
public class Game {
    public static int roundNumber = 0;
    public static int correctGuesses = 0;
    public static boolean foundMatch = false;
    GameTurnView gameTurnView = new GameTurnView();
    
    
    public Game(){
}
    public static void newGame() {
        WordsAndPhrases.setPhrases();
        WordsAndPhrases.translatePhrase();
        WordsAndPhrases.translateParallelPhrase();
    }
    public static void gameRound() {
        if(foundMatch)
            roundNumber--;
    }
    public static void display() {
        if (foundMatch) {
            new RfortuneMessage().displayMessage("You have a match!");
        }
        else if (!foundMatch) {
            new RfortuneMessage().displayMessage("Sorry, that is not in the "
                    + "phrase. Your turn is over.");
        }        
    }
    
}
       
   
    

    
    /*public void displayEndingMessage (){
        Bank bank = new Bank();
        
        
        if((Bank.playerListOrder[0])==(Bank.playerListOrder[1])){
        }
        //refers to the two top players in the sorted array
            System.out.println("This game was a tie between " + bank.winningOrder[0] 
                    +" and " + bank.winningOrder[1]);
            else
            System.out.println("Congratulations "+ playerListOrder[0]+ ". You "
                       + "are the winner!" );*/
        
