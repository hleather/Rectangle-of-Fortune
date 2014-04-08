/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.control;

import RfortuneTeam.HeatherandLaura.allMenuViews.GameTurnView;
import RfortuneTeam.HeatherandLaura.frames.GameTurn;
/**
 *
 * @author Heather
 */
public class GameMenuControl {
    GameMenuControl gameMenuControl = null;
    GameTurnView gameTurnView = new GameTurnView();
    static GameTurn gameTurn = new GameTurn();
    
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
        System.out.println("Test Letter");
    }
    
    public void guessVowel() {
        System.out.println("Test Vowel");
    }
    
    public void guessPhrase() {
        System.out.println("Test Phrase");
    }

}