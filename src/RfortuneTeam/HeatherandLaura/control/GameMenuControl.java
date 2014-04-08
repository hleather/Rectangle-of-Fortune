/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.control;

import RfortuneTeam.HeatherandLaura.allMenuViews.GameTurnView;
import RfortuneTeam.HeatherandLaura.frames.GameTurn;
import RfortuneTeam.HeatherandLaura.frames.GuessLetter;
import RfortuneTeam.HeatherandLaura.frames.GuessPhrase;
import RfortuneTeam.HeatherandLaura.frames.GuessVowel;
/**
 *
 * @author Heather
 */
public class GameMenuControl {
    GameMenuControl gameMenuControl = null;
    GameTurnView gameTurnView = new GameTurnView();
    static GameTurn gameTurn = new GameTurn();
    static GuessLetter guessLetter = new GuessLetter();
    static GuessVowel guessVowel = new GuessVowel();
    static GuessPhrase guessPhrase = new GuessPhrase();
    
    public GameMenuControl() {
       
    }

       
    
   public void takeTurn() {
       gameMenuControl.startGameTurn();
   }
   
   public void startGameTurn() {
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
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
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
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
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
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
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
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

}