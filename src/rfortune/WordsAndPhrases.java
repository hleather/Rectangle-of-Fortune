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
    
        String easyPhrases;
        String hardPhrases;
        Board board;
       
   
   public WordsAndPhrases(){
   }
       
       
   

       /*List easyPhrases = new ArrayList("",
               + , );
         List hardPhrases = new ArrayList();
               System.out.println("\n\tThe phrase is" + board);*/

   
public static void setPhrase(String setDifficulty){    
    String easyPhrases[] = {"BETTERLATETHANNEVER", "BLOODISTHICKERTHANWATER", "MISERYLOVESCOMPANY"};
    String pEasyPhrases[] = {"------ ---- ---- -----", "----- -- ------- ---- -----", "------ ----- -------"};
    String hardPhrases[] = {"EVERYCLOUDHASASILVERLINING", "KNOWLEDGEISPOWER", "MUCHISEXPECTEDWHEREMUCHISGIVEN", "HOPONPOP"};
    String pHardPhrases[] = {"----- ----- --- - ------ ------", "--------- -- -----", "---- -- -------- ----- ---- -- -----", "--- -- ---"};
    
    Random indexLocation = new Random();
    int index = 1 + indexLocation.nextInt(3);
    
    setDifficulty = "H";
    String difficulty = setDifficulty;
    
    if("E".equals(difficulty))
            {                
                new BoardView().getPhrase(easyPhrases[index]);
                new BoardView().getParallelPhrase(pEasyPhrases[index]);
                new BoardView().defaultDisplayBoard(pEasyPhrases[index]);
            }
    if("H".equals(difficulty))
            {
                new BoardView().getPhrase(hardPhrases[index]);
                new BoardView().getParallelPhrase(pHardPhrases[index]);
                new BoardView().defaultDisplayBoard(pHardPhrases[index]);
            }
 

    }





}



    
    


