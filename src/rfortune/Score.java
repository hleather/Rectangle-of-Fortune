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
public class Score {
    String name;
    String playerType;
    long rGuesses = 0;
    long wGuesses = 0;
    long phrasesCompleted = 0;
    
    
    public Score() {
    }
        
    public void displayName() {
            System.out.println("\t\tHello " + this.name);
        }
    }
