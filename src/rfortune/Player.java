/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;

import java.util.Scanner;

/**
 *
 * @author Heather
 */
public class Player {
    public static final String player1 = Rfortune.name;
    public static String player2 = " ";
    public static String player3 = " ";
    Board newBoard = new Board();
    
    public Player() {
}
    
    
    public final int getPlayerNames (long numPlayers) {
        
        if (numPlayers == 3) 
        {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter name of Player 2: ");
                    Player.player2 = input.next();
                    System.out.println("Enter name of Player 3: ");
                    Player.player3 = input.next();
                    
         }
        else if (numPlayers == 2)
        {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter name of Player 2: ");
                    Player.player2 = input.next();
        }
        else 
        {
                    Scanner input = new Scanner(System.in);
        }
return 0;
        
        }     
 }
