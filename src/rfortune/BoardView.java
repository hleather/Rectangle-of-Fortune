/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;
import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class BoardView {
    
   public void defaultDisplayBoard(){
       System.out.println("_ _ _  _ _  _ _ _");
   }
   
    
    
    public static void searchPhrase(){
        String sPhrase[] = {"H","o","p","o","n","P","o","p"};
        Scanner Guess = new Scanner(System.in);
        boolean found = false;
          
    }
    
    for (String x : sPhrase){
        if(x == Guess){
            found = true;
            break;
        }
    } 
    if (found)
        System.out.println("Value found!");
}
