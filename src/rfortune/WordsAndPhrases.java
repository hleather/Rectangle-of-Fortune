/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;
import java.util.Random;
/**
 *
 * @author Heather
 */
public class WordsAndPhrases {   
    private static int index;
    private static String phrase;
    private static String parallelPhrase;
    public static char[] charArray;
    public static char[] parallelCharArray;    
   
   public WordsAndPhrases(){
   }    
   /****************************************************************************
    * Stores the list of different phrase options. There are two
    * separate lists, one for easy phrases and one for hard phrases.
    ***************************************************************************/
   public static void setPhrases(){    
       String easyPhrases[] = {"BETTER LATE THAN NEVER", "BLOOD IS THICKER THAN WATER",
           "MISERY LOVES COMPANY"};
       String pEasyPhrases[] = {"------ ---- ---- -----", "----- -- ------- "
               + "---- -----", "------ ----- -------"};
       String hardPhrases[] = {"EVERY CLOUD HAS A SILVER LINING", "KNOWLEDGE IS POWER",
           "MUCH IS EXPECTED WHERE MUCH IS GIVEN", "HOP ON POP"};
       String pHardPhrases[] = {"----- ----- --- - ------ ------", "--------- "
               + "-- -----", "---- -- -------- ----- ---- -- -----", 
               "--- -- ---"};   
       int control = 2;
       if ("H".equals(GamePreferencesView.setDifficulty))
           control = 3;
       
       Random indexLocation = new Random();
       index = 1 + indexLocation.nextInt(control);
              
       if("E".equals(GamePreferencesView.setDifficulty))
       {                
          phrase = easyPhrases[index];
          parallelPhrase = pEasyPhrases[index];
       }
       if("H".equals(GamePreferencesView.setDifficulty))
       {
          phrase = hardPhrases[index];
          parallelPhrase = pHardPhrases[index];
       }           
       System.out.println(phrase);
   }
   
    /***************************************************************************
     * Translates phrase into a character array.
     **************************************************************************/
    public static void translatePhrase(){          
        charArray = phrase.toCharArray();           
    }
    
    /***************************************************************************
     * Translates parallelPhrase into a character array.
     **************************************************************************/
    public static void translateParallelPhrase(){
        parallelCharArray = parallelPhrase.toCharArray();
    }
    
    /***************************************************************************
     * Checks to see if the guessed letter is in the phrase.
     **************************************************************************/
    public static void searchPhrase() {
        if (CheckGuess.checkGuess) {
            for(int i = 0; i  < charArray.length; i++){
                if(charArray[i] == (CheckGuess.currentGuess)){
                    Game.foundMatch = true;
                    Bank.updateBankSpinWorth();
                }
            }
        }
    }
    
    /***************************************************************************
     * replaces the location of the correctly guessed letters in the array with
     * the letter.
     **************************************************************************/
    public static void updateParallelArray() {
        if (Game.foundMatch) {
            for(int i = 0; i < charArray.length; i++) {
                if(charArray[i] == (CheckGuess.currentGuess))
                    parallelCharArray[i] = CheckGuess.currentGuess;
            }
        }
    }
    
    /***************************************************************************
     * compares two strings to see if they are the same.
     **************************************************************************/
    public static void checkPhrase(){
        
    }
    
    /***************************************************************************
     * displays the parallelCharArray to the screen.
     **************************************************************************/
    public static void displayParallelArray(){
        System.out.println(parallelCharArray);
    }
    
    /***************************************************************************
     * displays the charArray to the screen.
     **************************************************************************/
    public static void displayCharArray(){
        System.out.println(charArray);
    }
}



    
    


