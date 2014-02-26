/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;


/**
 *
 * @author Heather and Laura
 */
public class Rfortune {
    // Instance variables
    String welcomeMsg = 
              "\n\t************************************************"
            + "\n\t* Welcome to the game, Rectangle of Fortune.    *"
            + "\n\t* You will be playing against one or two other  *"
            + "\n\t* players. The object of the game is to have    *"
            + "\n\t* earned the most money by the end of the game. *"
            + "\n\t* The game ends when a player guesses the word  *"
            + "\n\t* or phrase.                                    *"
            + "\n\t*************************************************"
            + "\n";

    public static void main(String[] args) {
        
        //first
        /*Rfortune myGame = new Rfortune();
        myGame.getName();
        myGame.displayHelp(); 
        
        //second
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();*/
        
        //test
        Board newBoard = new Board();
        newBoard.displayBoardView();
        
        /*
        PlayersList playersList = new PlayersList();
        playersList.getInput();
        
        
        PlayerTurn playerTurn = new PlayerTurn();
        playerTurn.playersTurn(MainMenuControl.numberPlayers);

        GameMenuView mainGameMenu =  new GameMenuView();
        mainGameMenu.getInput();
                

        
        BoardView boardView = new BoardView();
        BoardView.searchPhrase();
        
        Letters myVowel = new Letters();
        myVowel.determineVowel();
        

        
        GamePreferencesView preferencesMenu = new GamePreferencesView();
        GamePreferencesView.getInput();
        */
        
        

        
        // TODO code application logic here
    }
    
    public void displayHelp() {
        System.out.println(this.welcomeMsg);
    }
    
}
