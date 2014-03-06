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
   public static void Phrases(){    
       String easyPhrases[] = {"BETTERLATETHANNEVER", "BLOODISTHICKERTHANWATER",
           "MISERYLOVESCOMPANY"};
       String pEasyPhrases[] = {"------ ---- ---- -----", "----- -- ------- "
               + "---- -----", "------ ----- -------"};
       String hardPhrases[] = {"EVERYCLOUDHASASILVERLINING", "KNOWLEDGEISPOWER",
           "MUCHISEXPECTEDWHEREMUCHISGIVEN", "HOPONPOP"};
       String pHardPhrases[] = {"----- ----- --- - ------ ------", "--------- "
               + "-- -----", "---- -- -------- ----- ---- -- -----", 
               "--- -- ---"};   
       
       Random indexLocation = new Random();
       index = 1 + indexLocation.nextInt(3);
              
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
        //System.out.println("Parallel Character Array: " + 
                //Arrays.toString(parallelCharArray));
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



    
    


