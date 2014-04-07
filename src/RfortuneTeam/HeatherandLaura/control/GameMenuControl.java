/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.control;

import RfortuneTeam.HeatherandLaura.allMenuViews.GameTurnView;
import RfortuneTeam.HeatherandLaura.frames.GameTurn;
import rfortune.GameBoardView;

/**
 *
 * @author Heather
 */
public class GameMenuControl {
    GameMenuControl gameMenuControl = null;
    GameTurnView gameTurnView = new GameTurnView();
    static GameTurn gameTurn = new GameTurn();
    GameBoardView gameBoardView = new GameBoardView();
    
    public GameMenuControl() {
       
    }

       
    
   public void takeTurn() {
       gameMenuControl = new GameMenuControl();
       gameMenuControl.startGameTurn();
   }
   
   public void startGameTurn() {
       gameMenuControl = new GameMenuControl();
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    gameTurn.setVisible(true);
                }
            });
        } finally {
            if (GameMenuControl.gameTurn != null) {
                GameMenuControl.gameTurn.dispose();
            }
        }
    }
   
   public void guessLetter() {
        
    }
    
    public void guessVowel() {
        
    }
    
    public void guessPhrase() {
        
    }
   
}