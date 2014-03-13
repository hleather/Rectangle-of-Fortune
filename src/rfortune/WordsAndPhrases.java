/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rfortune;
import java.io.Serializable;
import java.util.Random;
/**
 *
 * @author Heather
 */
public class WordsAndPhrases implements Serializable {   
    private static int index;
    private static String phrase;
    private static String parallelPhrase;
    private static char[] charArray;
    private static char[] parallelCharArray;    

    /**
     * @return the index
     */
    public static int getIndex() {
        return index;
    }

    /**
     * @param aIndex the index to set
     */
    public static void setIndex(int aIndex) {
        index = aIndex;
    }

    /**
     * @return the phrase
     */
    public static String getPhrase() {
        return phrase;
    }

    /**
     * @param aPhrase the phrase to set
     */
    public static void setPhrase(String aPhrase) {
        phrase = aPhrase;
    }

    /**
     * @return the parallelPhrase
     */
    public static String getParallelPhrase() {
        return parallelPhrase;
    }

    /**
     * @param aParallelPhrase the parallelPhrase to set
     */
    public static void setParallelPhrase(String aParallelPhrase) {
        parallelPhrase = aParallelPhrase;
    }

    /**
     * @return the charArray
     */
    public static char[] getCharArray() {
        return charArray;
    }

    /**
     * @param aCharArray the charArray to set
     */
    public static void setCharArray(char[] aCharArray) {
        charArray = aCharArray;
    }

    /**
     * @return the parallelCharArray
     */
    public static char[] getParallelCharArray() {
        return parallelCharArray;
    }

    /**
     * @param aParallelCharArray the parallelCharArray to set
     */
    public static void setParallelCharArray(char[] aParallelCharArray) {
        parallelCharArray = aParallelCharArray;
    }
   
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
       if ("H".equals(GamePreferencesView.getSetDifficulty()))
           control = 3;
       
       Random indexLocation = new Random();
        setIndex(1 + indexLocation.nextInt(control));
              
       if("E".equals(GamePreferencesgetSetDifficulty()culty))
       {                
            setPhrase(easyPhrases[getIndex()]);
            setParallelPhrase(pEasyPhrases[getIndex()]);
       }
       if("H".equals(GamePrefergetSetDifficulty()Difficulty))
       {
            setPhrase(hardPhrases[getIndex()]);
            setParallelPhrase(pHardPhrases[getIndex()]);
       }           
       System.out.println(getPhrase());
   }
   
    /***************************************************************************
     * Translates phrase into a character array.
     **************************************************************************/
    public static void translatePhrase(){          
        setCharArray(getPhrase().toCharArray());           
    }
    
    /***************************************************************************
     * Translates parallelPhrase into a character array.
     **************************************************************************/
    public static void translateParallelPhrase(){
        setParallelCharArray(getParallelPhrase().toCharArray());
    }
    
    /***************************************************************************
     * Checks to see if the guessed letter is in the phrase.
     **************************************************************************/
    public static void searchPhrase() {
        if (CheckGuess.isCheckGuess()) {
            for(int i = 0; i  < getCharArray().length; i++){
                if(getCharArray()[i] == (CheckGuess.getCurrentGuess())){
                    Game.setFoundMatch(true);
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
        if (Game.isFoundMatch()) {
            for(int i = 0; i < getCharArray().length; i++) {
                if(getCharArray()[i] == (CheckGuess.getCurrentGuess()))
                    getParallelCharArray()[i] = CheckGuess.getCurrentGuess();
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
        System.out.println(getParallelCharArray());
    }
    
    /***************************************************************************
     * displays the charArray to the screen.
     **************************************************************************/
    public static void displayCharArray(){
        System.out.println(getCharArray());
    }
}



    
    


