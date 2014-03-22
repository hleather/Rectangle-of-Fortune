/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RfortuneTeam.HeatherandLaura.control;

import RfortuneTeam.HeatherandLaura.allMenuViews.GameMenuView;
import rfortune.Bank;
import rfortune.Player;
import java.io.Serializable;

/**
 *
 * @author Heather
 */
public class MainMenuControl implements Serializable {
    private static int setNumPlayers;

    /**
     * @return the setNumPlayers
     */
    public static int getSetNumPlayers() {
        return setNumPlayers;
    }

    /**
     * @param aSetNumPlayers the setNumPlayers to set
     */
    public static void setSetNumPlayers(int aSetNumPlayers) {
        setNumPlayers = aSetNumPlayers;
    }
    
    /***************************************************************************
     * setNumPlayers(). gets the number of players from MainMenuView and stores
     * puts it into the class (integer) variable numPlayers as a reference for 
     * getPlayerNames in Player, playersTurn in PlayerTurn and numPlayersBank in
     * Bank.
     * @param getNumPlayers 
     **************************************************************************/
    public void setNumPlayers(int getNumPlayers){
        setSetNumPlayers(getNumPlayers);
    }

    /***************************************************************************
     * setScreen(). formats the display of the current players (from Player) and
     * their scores (from Bank).
     **************************************************************************/
    public void setScreen() {  
        Bank.updateBankPlayer();
        String player1 = Player.getPlayer1();
        String player2 = Player.getPlayer2();
        String player3 = Player.getPlayer3();
        
        String gameDisplay[][] = {
            {player1, player2, player3},
            {Bank.getBankPlayer1(), Bank.getBankPlayer2(), Bank.getBankPlayer3()}
        };
        System.out.println("\n\t==========================================="
                + "===================="); 
        if (getSetNumPlayers() == 1)
        {
            System.out.println("\t" + gameDisplay[0][0] + "\n\t" + 
                    gameDisplay[1][0]);
        }
        if (getSetNumPlayers() == 2)
        {
            System.out.println("\t" + gameDisplay[0][0] + "\t\t\t" + 
                    gameDisplay[0][1] + "\n\t" + gameDisplay[1][0] + "\t\t\t" 
                    + gameDisplay[1][1]);
        }
        if (getSetNumPlayers() == 3)
        {
            System.out.println("\t" + gameDisplay[0][0] + "\t\t\t" + 
                    gameDisplay[0][1] + "\t\t\t" + gameDisplay[0][2] + "\n\t" 
                    + gameDisplay[1][0] + "\t\t\t" + gameDisplay[1][1] + 
                    "\t\t\t" + gameDisplay[1][2]);
        }
        System.out.println("\t============================================="
                + "==================\n");
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.getInput();
        
        }
}
