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
public class Bank {
    static long bankPlayerUp;
    public static long bankNumberPlayer1;
    public static long bankNumberPlayer2;
    public static long bankNumberPlayer3;
    public static String bankPlayer1 = " ";
    public static String bankPlayer2 = " ";
    public static String bankPlayer3 = " ";
    public static long spinWorth;
    public static boolean hasEnough = false;
    public static long guessPhraseWorth;
    
    public Bank(){   
    }
    
    /***************************************************************************
    * numPlayersBank(). sets the starting value (0) to the correct number of 
    * players in the current game. It only sets the starting value to the 
    * specific number of players in order to leave any additional player slots
    * empty for the MainMenuControl.setScreen().gameDisplay array. This function
    * also converts the bank (variable type long) to a String so it 
    * can be displayed in the MainMenuControl.setScreen().gameDisplay array.
    ***************************************************************************/    
    public static void numPlayersBank() {
        if (MainMenuControl.setNumPlayers == 3)
        {
            bankNumberPlayer1 = 0;
            bankNumberPlayer2 = 0;
            bankNumberPlayer3 = 0;
        }
        if (MainMenuControl.setNumPlayers == 2)
        {
            bankNumberPlayer1 = 0;
            bankNumberPlayer2 = 0;
        }
        if (MainMenuControl.setNumPlayers == 1)
        {
            bankNumberPlayer1 = 500;
        }
        
        bankPlayer1 = Long.toString(Bank.bankNumberPlayer1);
        bankPlayer2 = Long.toString(Bank.bankNumberPlayer2);
        bankPlayer3 = Long.toString(Bank.bankNumberPlayer3);
    }    
    
    /***************************************************************************
    * bankPlayerTurn(). defines whose bank will be adjusted based on which 
    * players turn it currently is.
    ***************************************************************************/
    static void bankPlayerTurn(){
        if (PlayerTurn.playerUp == 0)
            bankPlayerUp = bankNumberPlayer1;
        else if (PlayerTurn.playerUp == 1)
            bankPlayerUp = bankNumberPlayer2;
        else if (PlayerTurn.playerUp == 2)
            bankPlayerUp = bankNumberPlayer3;       
    }    
    
    /***************************************************************************
     * updateBankVowelPurchase(). first checks to see if the current player has 
     * enough money to purchase a vowel (250). If the player has enough money
     * to purchase a vowel, this function subtracts 250 from bankPlayerUp. It 
     * will return true or false to let the ***vowel*** function know ***?***.
    ***************************************************************************/
    public void updateBankVowelPurchase() {
        if (bankPlayerUp >= 250)
        {
            hasEnough = true;
            bankPlayerUp = bankPlayerUp - 250;
        }            
    }    
    
    /***************************************************************************
     * spinWorth(). sets the amount the next character guess is worth using a 
     * random number generator. The values will be different for Easy and Hard
     * modes and the function returns that value.
    ***************************************************************************/
    public void spinWorth(){
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
        spinWorth = amount * (1 + spin.nextInt(8));        
    }
    
    /***************************************************************************
     * phraseWorth(). calculates how much guessing the remainder of the phrase is
     * worth and returns that value.
    ***************************************************************************/
    public void phraseWorth(){
        int phraseLength = BoardView.charArray.length;
        int cGuesses = Game.correctGuesses;
        int guessOpenSpaceWorth = 100;
        int openSpaces = phraseLength - cGuesses;
        guessPhraseWorth = openSpaces * guessOpenSpaceWorth;
    }
    
    public void determineWinner(){
        
    }
}



    
