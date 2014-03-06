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
    public static long bankPlayerUp;
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
            bankNumberPlayer1 = 1000;
            bankNumberPlayer2 = 2000;
            bankNumberPlayer3 = 3000;
        }
        if (MainMenuControl.setNumPlayers == 2)
        {
            bankNumberPlayer1 = 1000;
            bankNumberPlayer2 = 2000;
        }
        if (MainMenuControl.setNumPlayers == 1)
        {
            bankNumberPlayer1 = 1000;
        }
    }    
    
    
    public static void updateBankPlayer()
    {
        if (MainMenuControl.setNumPlayers == 3)
        {
            bankPlayer1 = Long.toString(Bank.bankNumberPlayer1);
            bankPlayer2 = Long.toString(Bank.bankNumberPlayer2);
            bankPlayer3 = Long.toString(Bank.bankNumberPlayer3);
        }
        if (MainMenuControl.setNumPlayers == 2)
        {
            bankPlayer1 = Long.toString(Bank.bankNumberPlayer1);
            bankPlayer2 = Long.toString(Bank.bankNumberPlayer2);
        }
        if (MainMenuControl.setNumPlayers == 1)
        {
            bankPlayer1 = Long.toString(Bank.bankNumberPlayer1);
        }
    }
    
    /***************************************************************************
    * bankPlayerTurn(). defines whose bank will be adjusted based on which 
    * players turn it currently is.
    ***************************************************************************/
    public static void bankPlayerTurn(){
        if (PlayerTurn.playerUp == 0)
            bankPlayerUp = bankNumberPlayer1;
        else if (PlayerTurn.playerUp == 1)
            bankPlayerUp = bankNumberPlayer2;
        else if (PlayerTurn.playerUp == 2)
            bankPlayerUp = bankNumberPlayer3;       
    }   
    
    /***************************************************************************
    * display the current player's bank amount.
    ***************************************************************************/
    public static void displayPlayerUpBank() {
        if (PlayerTurn.playerUp == 0)
            System.out.println("Bank: " + bankPlayer1);
        else if (PlayerTurn.playerUp == 1)
            System.out.println("Bank: " + bankPlayer2);
        else if (PlayerTurn.playerUp == 2)
            System.out.println("Bank: " + bankPlayer3);
    }
    
    /***************************************************************************
    * display player 1's bank
    ***************************************************************************/
    public static void displayBankPlayer1() {
        System.out.println(bankPlayer1);
    }
    
    /***************************************************************************
    * display player 2's bank
    ***************************************************************************/
    public static void displayBankPlayer2() {
        System.out.println(bankPlayer2);
    }
    
    /***************************************************************************
    * display player 3's bank
    ***************************************************************************/
    public static void displayBankPlayer3() {
        System.out.println(bankPlayer3);
    }
     
    /***************************************************************************
     * updateBankVowelPurchase(). first checks to see if the current player has 
     * enough money to purchase a vowel (250). If the player has enough money
     * to purchase a vowel, this function subtracts 250 from bankPlayerUp. It 
     * will return true or false to let the ***vowel*** function know ***?***.
    ***************************************************************************/
    public static void updateBankVowelPurchase() {
        PlayerTurn.updatePlayersTurn();
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
    public static void spinWorth(){
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
    
    public static void printSpinWorth(){
        System.out.println("Spin Worth: " + Bank.spinWorth);
    }
    
    public static void updateBankSpinWorth() {
        if (Game.foundMatch)
            bankPlayerUp += spinWorth;
    }
    
    /***************************************************************************
     * phraseWorth(). calculates how much guessing the remainder of the phrase is
     * worth and returns that value.
    ***************************************************************************/
    public static void phraseWorth(){
        int phraseLength = WordsAndPhrases.charArray.length;
        int cGuesses = Game.correctGuesses;
        int guessOpenSpaceWorth = 100;
        int openSpaces = phraseLength - cGuesses;
        guessPhraseWorth = openSpaces * guessOpenSpaceWorth;
    }
    
    public String[] sortScores(){
        //Bank.updateBankPlayer();
        String playerListOrder[] = {bankPlayer1, bankPlayer2, bankPlayer3};
        String temp;
        boolean notDone = true;
        while(notDone){
         
            notDone = false;
            for (int i = 0; i < playerListOrder.length-1; i++){
                int compareResult = playerListOrder[i].compareTo(playerListOrder[i+1]);
                if(compareResult > 0){
                    temp = playerListOrder[i];
                    playerListOrder[i] = playerListOrder[i+1];
                    playerListOrder[i+1] = temp;
                    notDone = true;
                  
                }
            }
            
        }
         return playerListOrder;
        
    }

}
