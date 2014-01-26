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
    String numPlayers;
    String player1 = "Player 1";
    String player2 = "Player 2";
    String player3 = "Player 3";
    
    
    public Player() {
    }
    
    public void getNumberPlayers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of players (one, two, or three): ");
        this.numPlayers = input.next();       
    }
    
    public void getPlayerNames () {
        switch (this.numPlayers) {
            case "three":
                {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter name of Player 1: ");
                    this.player1 = input.next();
                    System.out.println("Enter name of Player 2: ");
                    this.player2 = input.next();
                    System.out.println("Enter name of Player 3: ");
                    this.player3 = input.next();
                    break;
                }
            case "two":
                {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter name of Player 1: ");
                    this.player1 = input.next();
                    System.out.println("Enter name of Player 2: ");
                    this.player2 = input.next();
                    break;
                }
            default:
                {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter name of Player 1: ");
                    this.player1 = input.next();
                    break;
                }
         }
        
        }     
 
    }
