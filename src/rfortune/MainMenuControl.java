/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;
/**
 *
 * @author Heather
 */
public class MainMenuControl {
    public static int setNumPlayers;
    
    /***************************************************************************
     * setNumPlayers(). gets the number of players from MainMenuView and stores
     * puts it into the class (integer) variable numPlayers as a reference for 
     * getPlayerNames in Player, playersTurn in PlayerTurn and numPlayersBank in
     * Bank.
     * @param getNumPlayers 
     **************************************************************************/
    public void setNumPlayers(int getNumPlayers){
        setNumPlayers = getNumPlayers;
    }

    /***************************************************************************
     * setScreen(). formats the display of the current players (from Player) and
     * their scores (from Bank).
     **************************************************************************/
    public void setScreen() {  
        Bank.updateBankPlayer();
        
        String gameDisplay[][] = {
            {Player.player1, Player.player2, Player.player3},
            {Bank.bankPlayer1, Bank.bankPlayer2, Bank.bankPlayer3}
        };
        System.out.println("\n\t==========================================="
                + "===================="); 
        if (setNumPlayers == 1)
        {
            System.out.println("\t" + gameDisplay[0][0] + "\n\t" + 
                    gameDisplay[1][0]);
        }
        if (setNumPlayers == 2)
        {
            System.out.println("\t" + gameDisplay[0][0] + "\t\t\t" + 
                    gameDisplay[0][1] + "\n\t" + gameDisplay[1][0] + "\t\t\t" 
                    + gameDisplay[1][1]);
        }
        if (setNumPlayers == 3)
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
