/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RfortuneTeam.HeatherandLaura.control;

import RfortuneTeam.HeatherandLaura.allMenuViews.GameTurnView;
import RfortuneTeam.HeatherandLaura.frames.CorrectGuess;
import RfortuneTeam.HeatherandLaura.frames.EndMessage;
import RfortuneTeam.HeatherandLaura.frames.GameTurn;
import RfortuneTeam.HeatherandLaura.frames.GuessLetter;
import RfortuneTeam.HeatherandLaura.frames.GuessPhrase;
import RfortuneTeam.HeatherandLaura.frames.GuessVowel;
import RfortuneTeam.HeatherandLaura.frames.IncorrectGuess;
import rfortune.CheckGuess;
import rfortune.Game;
import rfortune.PlayerTurn;

/**
 *
 * @author Heather
 */
public class GameMenuControl {

    Game game = new Game();
    PlayerTurn playerTurn = new PlayerTurn();
    GameMenuControl gameMenuControl = null;
    GameTurnView gameTurnView = new GameTurnView();
    static GameTurn gameTurn = new GameTurn();
    static GuessLetter guessLetter = new GuessLetter();
    static GuessVowel guessVowel = new GuessVowel();
    static GuessPhrase guessPhrase = new GuessPhrase();
    static CorrectGuess correctGuess = new CorrectGuess();
    static IncorrectGuess incorrectGuess = new IncorrectGuess();
    static EndMessage endMessage = new EndMessage();

    public GameMenuControl() {

    }

    public void takeTurn() {
        gameMenuControl.startGameTurn();
    }

    public void startGameTurn() {
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    gameTurn.setVisible(true);
                }
            });
        } finally {
            if (gameTurn != null) {
                gameTurn.dispose();
            }
        }
    }

    public void guessLetter() {
        gameMenuControl = new GameMenuControl();
        try {
            guessLetter.jtfLetterGuess.setText(null);
            correctGuess.jtfCorrectMessage.setText("is in the phrase!");
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    guessLetter.setVisible(true);
                }
            });
        } finally {
            if (GameMenuControl.guessLetter != null) {
                GameMenuControl.guessLetter.dispose();
            }
        }
    }

    public void guessVowel() {
        gameMenuControl = new GameMenuControl();
        try {
            guessVowel.jtfVowelGuess.setText(null);
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    guessVowel.setVisible(true);
                }
            });
        } finally {
            if (GameMenuControl.guessVowel != null) {
                GameMenuControl.guessVowel.dispose();
            }
        }
    }

    public void guessPhrase() {
        gameMenuControl = new GameMenuControl();
        try {
            guessPhrase.jtfPhraseGuess.setText(null);
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    guessPhrase.setVisible(true);
                }
            });
        } finally {
            if (GameMenuControl.guessPhrase != null) {
                GameMenuControl.guessPhrase.dispose();
            }
        }
    }

    public void correctWindow(String guess) {
        gameMenuControl = new GameMenuControl();
        correctGuess.jtfCorrectGuess.setText(guess);
        correctGuess.jtfCorrectMessage.setText("is in the phrase!.");
        if (MainMenuControl.getSetNumPlayers() == 1) {
            correctGuess.jtfCorrectMessage.setText("is in the phrase!");
        }
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    correctGuess.setVisible(true);
                }
            });
        } finally {
            if (GameMenuControl.correctGuess != null) {
                GameMenuControl.correctGuess.dispose();
            }
        }
    }

    public void incorrectWindow() {
        gameMenuControl = new GameMenuControl();
        incorrectGuess.jtfIncorrectGuess.setText(String.valueOf(CheckGuess.getCurrentGuess()));
        incorrectGuess.jtfIncorrectMessage.setText("is not in the phrase. "
                + "Your turn is over.");
        if (MainMenuControl.getSetNumPlayers() == 1) {
            incorrectGuess.jtfIncorrectMessage.setText("is not in the phrase.");
        }
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    incorrectGuess.setVisible(true);
                }
            });
        } finally {
            if (GameMenuControl.incorrectGuess != null) {
                GameMenuControl.incorrectGuess.dispose();
            }
        }
    }
    

}
