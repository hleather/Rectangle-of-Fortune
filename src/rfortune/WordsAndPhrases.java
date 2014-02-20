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

   
public static void setPhrase(String difficulty){    
    String easyPhrases[] = {"BetterLateThanNever", "Bloodisthickerthanwater", "Miserylovescompany"};
    String hardPhrases[] = {"Everycloudhasasliverlining", "Knowledgeispower", "Muchisexpectedwheremuchisgiven", "HoponPop"};
    //I couldn't figure out how to make this a random selection yet. Will have to save that project for later.
    if("E".equals(difficulty))
            {                
                new BoardView().getPhrase(easyPhrases[0]);
            }
    if("H".equals(difficulty))
            {
                new BoardView().getPhrase(hardPhrases[3]);
            }

    }
      }



    
    


