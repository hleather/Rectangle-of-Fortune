/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class GameTurnView extends Menu {
    HelpMenuView helpMenuView = new HelpMenuView();
    CheckGuess checkGuess = new CheckGuess();
    
    static final String[][]turnOptions = {
        {"L", "Guess a letter"},
        {"V", "Buy a vowel"},
        {"P", "Guess the phrase"},
        {"H", "Help"},
        {"Q", "QUIT"}
    };
    
    public GameTurnView(){
        super(GameTurnView.turnOptions);
    }
    /*********************************************************************
     * Gets input for what player wants to do on their turn.
     * LINKING FUNCTION!
     *********************************************************************/
    @Override
    public static void getInput(){
            String command;
            Scanner inFile = new Scanner(System.in);
        
        do {
            WordsAndPhrases.updateParallelArray();
            WordsAndPhrases.displayParallelArray();
            if (Game.getRoundNumber() == 0 && Game.isFoundMatch()) {
                PlayerTurn.updatePlayersTurn();
                PlayerTurn.displayPlayerTurn();
                Bank.bankPlayerTurn();
                Bank.updateBankPlayer();
                Bank.displayPlayerUpBank();
            }
            if (Game.isTurnOver()) {
                PlayerTurn.updatePlayersTurn();
                PlayerTurn.displayPlayerTurn();
                Bank.bankPlayerTurn();
                Bank.updateBankPlayer();
                Bank.displayPlayerUpBank();
            }
            
            this.display();
            
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                //guess a letter.
                case "L":
                    if(Game.getRoundNumber() != 0) {
                        PlayerTurn.updatePlayersTurn();
                        PlayerTurn.displayPlayerTurn();
                        Bank.bankPlayerTurn();
                        Bank.updateBankPlayer();
                        Bank.displayPlayerUpBank();
                    }
                    PlayerTurn.updatePlayersTurn();
                    Bank.updateBankPlayer();
                    Bank.bankPlayerTurn();
                    Bank.spin();
                    Bank.spinWorth();
                    Bank.printSpinWorth();
                    CheckGuess.checkLetterGuess();
                    WordsAndPhrases.searchPhrase();
                    Game.display();
                    Game.setRoundNumber(Game.getRoundNumber() + 1);
                    Bank.updateBankSpinWorth();
                    Game.gameRound();
                    break;
                //guess a vowel
                case "V":
                    PlayerTurn.updatePlayersTurn();
                    Bank.updateBankPlayer();
                    Bank.bankPlayerTurn();
                    Bank.spin();
                    Bank.spinWorth();
                    CheckGuess.checkVowelGuess();
                    WordsAndPhrases.searchPhrase();
                    Game.setRoundNumber(Game.getRoundNumber() + 1);
                    Game.gameRound();
                    break;
                //guess the phrase
                case "P":
                    PlayerTurn.updatePlayersTurn();
                    Bank.bankPlayerTurn();
                    Bank.phraseWorth();
                    System.out.println("Guess Phrase Command Entered");
                    Game.setRoundNumber(Game.getRoundNumber() + 1);
                    Game.gameRound();
                    break;
                //help menu
                case "H":
                    helpMenuView.getInput();
                    break;
                //Quit
                case "Q":
                    break;
                default:
                    new RfortuneError().displayError("Invalid command. Please "
                            + "enter a valid command.");
            }
        } while (!command.equals("Q"));
    }
}


