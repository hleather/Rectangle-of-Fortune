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
    String player1 = Rfortune.name;
    String player2 = "Player 2";
    String player3 = "Player 3";
    
    
    public Player() {
}
    
    
    public void getPlayerNames () {
        switch (MainMenuView.command) {
            case "3":
                {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Player 1 is " + player1);                  
                    System.out.println("Enter name of Player 2: ");
                    this.player2 = input.next();
                    System.out.println("Enter name of Player 3: ");
                    this.player3 = input.next();
                    break;
                }
            case "2":
                {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Player 1 is " + Rfortune.name);
                    System.out.println("Enter name of Player 2: ");
                    this.player2 = input.next();
                    break;
                }
            default:
                {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Player 1 is " + Rfortune.name);
                    break;
                }
         }
        
        }     

    }
