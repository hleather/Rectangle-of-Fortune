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
    public static String[] charArray;
    public static String[] parallelCharArray;    
   
   public WordsAndPhrases(){
   } 
   
   /****************************************************************************
    * setPhrase(). stores the list of different phrase options. There are two
    * separate lists, one for easy phrases and one for hard phrases. This 
    * function passes the difficulty into the different BoardView functions as
    * it initializes them.
    ***************************************************************************/
   public static void storePhrases(){    
       String easyPhrases[] = {"BETTERLATETHANNEVER", "BLOODISTHICKERTHANWATER",
           "MISERYLOVESCOMPANY"};
       String pEasyPhrases[] = {"------ ---- ---- -----", "----- -- ------- "
               + "---- -----", "------ ----- -------"};
       String hardPhrases[] = {"EVERYCLOUDHASASILVERLINING", "KNOWLEDGEISPOWER",
           "MUCHISEXPECTEDWHEREMUCHISGIVEN", "HOPONPOP"};
       String pHardPhrases[] = {"----- ----- --- - ------ ------", "--------- "
               + "-- -----", "---- -- -------- ----- ---- -- -----", 
               "--- -- ---"};
   }
   
   public static void selectPhrase() {       
       Random indexLocation = new Random();
       index = 1 + indexLocation.nextInt(3);
   }


       
       if("E".equals(GamePreferencesView.setDifficulty))
       {                
          charArray[] = easyPhrases[index];
          = pEasyPhrases[index];
       }
       if("H".equals(GamePreferencesView.setDifficulty))
       {
          charArray = hardPhrases[index];
          parallelCharArray = pHardPhrases[index];
       }             
   }
   static char[] charArray;
    static char[] parallelCharArray;
    
    /***************************************************************************
     * getPhrase(). gets the current random phrase from  *** and translates it
     * into a character array in order to be used in the game process.
     * @param setPhrase
     **************************************************************************/
    public static void getPhrase(String setPhrase){  
        String phrase = setPhrase;
        charArray = phrase.toCharArray();
        //System.out.println("Character Array: " + Arrays.toString(charArray));           
    }
    
    /***************************************************************************
     * getParallelPhrase(). gets the parallel phrase of the randomly selected
     * current phrase from WordsAndPhrases and translates it into a character 
     * array in order to be used in the game process.
     * @param setParallelArray
     **************************************************************************/
    public static void getParallelPhrase(String setParallelArray){
        String parallelArray = setParallelArray;
        parallelCharArray = parallelArray.toCharArray();
        //System.out.println("Parallel Character Array: " + 
                //Arrays.toString(parallelCharArray));
    }
    
    /***************************************************************************
     * defaultDisplayBoard(). gets the parallel phrase of the randomly selected
     * current phrase from WordsAndPhrases and displays it on the screen for the 
     * players to view.
     * @param setParallelArray
     **************************************************************************/
    public static void defaultDisplayBoard(String setParallelArray){
        String parallelArray = setParallelArray;
        //System.out.println("Default Display: " + parallelArray);
    }
    
    /***************************************************************************
     * getCharGuess(). gets the letter guess from the user and stores it as a
     * char variable. This function will be called from GameMenuControl.
     **************************************************************************/
   /* public void getCharGuess(){
        Scanner charGuess = new Scanner(System.in);    
        System.out.println("Please enter your guess.");
        String newGuess = charGuess.next().toUpperCase();
        guess = newGuess.charAt(0);
    }    */
}


}



    
    


