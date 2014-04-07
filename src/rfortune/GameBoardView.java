/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import RfortuneTeam.HeatherandLaura.frames.GameTurn;

/**
 *
 * @author Heather
 */
public class GameBoardView {
    GameBoardView gameBoardView = null;
    static GameTurn gameTurn = new GameTurn();
    PlayerTurn playerTurn = new PlayerTurn();
    Game game = new Game();
    
    public void updateBoardView() {
        //gameTurn.jtfPhraseDisplay.setText(WordsAndPhrases.updateAndTranslateParallelArrayToString());
        gameTurn.jtfPlayerTurnDisplay.setText(playerTurn.updatePlayersTurn());
        gameTurn.jtfBankDisplay.setText(playerTurn.updatePlayersTurn());
        game.updateAllBank(); 
        System.out.println(WordsAndPhrases.updateAndTranslateParallelArrayToString());
    }
    
    
}
