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
    
    String welcomeMsg = 
              "\n\t************************************************"
            + "\n\t* Welcome to the game, Rectangle of Fortune     *"
            + "\n\t* You will be playing against one or two other  *"
            + "\n\t* players. The object of the game is to have    *"
            + "\n\t* earned the most money by the end of the game. *"
            + "\n\t* The game ends when a player guesses the word  *"
            + "\n\t* or phrase.                                    *"
            + "\n\t*************************************************"
            + "\n";
    
    
    public Rfortune(){
        
    }
    

   
    public static void main(String[] args) {
        Rfortune rfortune = new Rfortune();
        rfortune.display();
        
             
    
    }
    
    private void display(){
        System.out.println(this.welcomeMsg);
    }
    
}