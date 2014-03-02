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
   
   public WordsAndPhrases(){
   } 
   
   /****************************************************************************
    * setPhrase(). stores the list of different phrase options. There are two
    * separate lists, one for easy phrases and one for hard phrases. This 
    * function passes the difficulty into the different BoardView functions as
    * it initializes them.
    ***************************************************************************/
   public static void setPhrase(){    
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
       int index = 1 + indexLocation.nextInt(3);

       
       if("E".equals(GamePreferencesView.setDifficulty))
       {                
           new BoardView().getPhrase(easyPhrases[index]);
           new BoardView().getParallelPhrase(pEasyPhrases[index]);
           //new BoardView().defaultDisplayBoard(pEasyPhrases[index]);
       }
       if("H".equals(GamePreferencesView.setDifficulty))
       {
           new BoardView().getPhrase(hardPhrases[index]);
           new BoardView().getParallelPhrase(pHardPhrases[index]);
          //new BoardView().defaultDisplayBoard(pHardPhrases[index]);
       }             
   }   
}



    
    


