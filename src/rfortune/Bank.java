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
    
    public Bank(){   
    }
    
    /***************************************************************************
    * numPlayersBank(). sets the starting value (0) to the correct number of 
    * players in the current game. It only sets the starting value to the 
    * specific number of players in order to leave any additional player slots
    * empty for the MainMenuControl.setScreen().gameDisplay array.
    ***************************************************************************/    
    void numPlayersBank(int numPlayers) {
        if (numPlayers == 3)
        {
            bankNumberPlayer1 = 0;
            bankNumberPlayer2 = 0;
            bankNumberPlayer3 = 0;            
        }
        if (numPlayers == 2)
        {
            bankNumberPlayer1 = 0;
            bankNumberPlayer2 = 0;            
        }
        if (numPlayers == 1)
        {
            bankNumberPlayer1 = 0;   
        }            
    }    
    
    /***************************************************************************
    * longToString(). converts the bank (variable type long) to a String so it 
    * can be displayed in the MainMenuControl.setScreen().gameDisplay array.
    ***************************************************************************/
    public void longToString(){
        bankPlayer1 = Long.toString(Bank.bankNumberPlayer1);
        bankPlayer2 = Long.toString(Bank.bankNumberPlayer2);
        bankPlayer3 = Long.toString(Bank.bankNumberPlayer3);
    }    
    
    /***************************************************************************
    * bankPlayerTurn(). defines whose bank will be adjusted based on which 
    * players turn it currently is.
    ***************************************************************************/
    static void bankPlayerTurn(int playerUp){
        if (playerUp == 0)
            bankPlayerUp = bankNumberPlayer1;
        else if (playerUp == 1)
            bankPlayerUp = bankNumberPlayer2;
        else if (playerUp == 2)
            bankPlayerUp = bankNumberPlayer3;       
    }    
    
    /***************************************************************************
     * updateBankVowelPurchase(). first checks to see if the current player has 
     * enough money to purchase a vowel (250). If the player has enough money
     * to purchase a vowel, this function subtracts 250 from bankPlayerUp. It 
     * will return true or false to let the ***vowel*** function know ***?***.
     * @return 
    ***************************************************************************/
    public boolean updateBankVowelPurchase() {
        boolean hasEnough = false;
        if (bankPlayerUp >= 250)
        {
            hasEnough = true;
            bankPlayerUp = bankPlayerUp - 250;
        }
        return hasEnough;            
    }    
    
    /***************************************************************************
     * spinWorth(). sets the amount the next character guess is worth using a 
     * random number generator. The values will be different for Easy and Hard
     * modes and the function returns that value.
     * @return 
    ***************************************************************************/
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
    
    /***************************************************************************
     * phraseWorth(). calculates how much guessing the remainder of the phrase is
     * worth and returns that value.
     * @return 
    ***************************************************************************/
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
}



    
