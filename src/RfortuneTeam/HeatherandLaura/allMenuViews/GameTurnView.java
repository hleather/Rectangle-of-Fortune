/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RfortuneTeam.HeatherandLaura.allMenuViews;

import rfortune.Bank;
import rfortune.CheckGuess;
import rfortune.Game;
import rfortune.PlayerTurn;
import rfortune.WordsAndPhrases;
import RfortuneTeam.HeatherandLaura.frames.GameTurn;

/**
 *
 * @author Laura
 */
public class GameTurnView extends Menu {
    public static String command;
    HelpMenuView helpMenuView = new HelpMenuView();
    CheckGuess checkGuess = new CheckGuess();
    PlayerTurn playerTurn = new PlayerTurn();
    static GameTurn gameTurn = new GameTurn();

    private static final String[][] turnOptions = {
        {"L", "Guess a letter"},
        {"V", "Buy a vowel"},
        {"P", "Guess the phrase"},
        {"H", "Help"},
        {"Q", "QUIT"}
    };

    public GameTurnView() {
        super(GameTurnView.turnOptions);
    }

    /**
     * *******************************************************************
     * Gets input for what player wants to do on their turn. LINKING FUNCTION!
     *
     * @param object
     * @return
     * *******************************************************************
     */
    public String getInput(Object object) {

        do {
            WordsAndPhrases.updateParallelArray();
            WordsAndPhrases.displayParallelArray();
            if (Game.getRoundNumber() == 0 && Game.isFoundMatch()) {
                playerTurn.updatePlayersTurn();
                Bank.displayPlayerUpBank();
            }
            if (Game.isTurnOver()) {
                playerTurn.updatePlayersTurn();
                Bank.bankPlayerTurn();
                Bank.updateBankPlayer();
                Bank.displayPlayerUpBank();
            }
            this.display();
            switch (command) {
                //guess a letter.
                case "L":
                    if (Game.getRoundNumber() != 0) {
                        Bank.displayPlayerUpBank();
                    }
                    playerTurn.updatePlayersTurn();
                    Bank.spin();
                    Bank.spinWorth();
                    Bank.printSpinWorth();
                    //CheckGuess.checkLetterGuess();
                    WordsAndPhrases.searchPhrase(1);
                    Game.display();
                    Game.setRoundNumber(Game.getRoundNumber() + 1);
                    Game.gameRound();
                    break;
                    //guess a vowel
                case "V":
                    playerTurn.updatePlayersTurn();
                    Bank.updateBankPlayer();
                    Bank.bankPlayerTurn();
                    Bank.spin();
                    Bank.spinWorth();
                   // CheckGuess.checkVowelGuess();
                    WordsAndPhrases.searchPhrase(2);
                    Game.setRoundNumber(Game.getRoundNumber() + 1);
                    Game.gameRound();
                    break;
                    //guess the phrase
                case "P":
                    playerTurn.updatePlayersTurn();
                    Bank.bankPlayerTurn();
                    Bank.phraseWorth();
                    Game.setGuessedPhrase();
                    
                    Game.setRoundNumber(Game.getRoundNumber() + 1);
                    Game.gameRound();
                    break;
                    //help menu
                case "H":
                    helpMenuView.getInput(null);
                    break;
                    //Quit
                case "Q":
                    break;

            }
        } while (!command.equals("Q"));
        return null;
    }
    
    
}
