/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import java.io.Serializable;
import RfortuneTeam.HeatherandLaura.frames.GuessLetter;

/**
 * THESE (FUNCTIONS) ONLY CHECK TO SEE IF THE CONSONANT OR VOWEL IS A REPEAT AND
 * RETURNS A BOOLEAN VALUE. THIS CLASS HAS A VARIABLE THAT STORES THE CURRENT
 * GUESS FOR EASY REFERENCE AND A BOOLEAN THAT CAN BE USED TO DETERMINE WHETHER
 * OR NOT TO RUN SEARCHPHRASE().
 *
 * @author Heather
 */
public class CheckGuess implements Serializable {

    static GuessLetter guessLetter = new GuessLetter();
    private static char currentGuess;
    private static boolean checkGuessRepeat;
    private static char[] listOfGuesses = new char[26];
    private static final char[] vowel = {'A', 'E', 'I', 'O', 'U'};
    private static boolean checkPhraseRepeat;
    private static int guessIndex = 0;
    private static boolean isVowel;
    private static int guessType = 0;
    private static boolean correctGuessType;

    public static void setGuessIndex(int index) {
        guessIndex = index;
    }

    public static int getGuessIndex() {
        return guessIndex;
    }

    public static void setCurrentGuess(char guess) {
        currentGuess = guess;
    }

    public static char getCurrentGuess() {
        return currentGuess;
    }

    public static void setCheckGuessRepeat(boolean repeat) {
        checkGuessRepeat = repeat;
    }

    public static boolean getCheckGuessRepeat() {
        return checkGuessRepeat;
    }

    public static void setCheckPhraseRepeat(boolean repeat) {
        checkPhraseRepeat = repeat;
    }

    public static boolean getCheckPhraseRepeat() {
        return checkPhraseRepeat;
    }

    public static void setListOfGuesses(char[] list) {
        listOfGuesses = list;
    }

    public static char[] getListOfGuesses() {
        return listOfGuesses;
    }

    public static void setIsVowel(boolean vowel) {
        isVowel = vowel;
    }

    public static boolean getIsVowel() {
        return isVowel;
    }

    public static void setGuessType(int gType) {
        guessType = gType;
    }

    public static int getGuessType() {
        return guessType;
    }

    public static void setCorrectGuessType(boolean correct) {
        correctGuessType = correct;
    }

    public static boolean getCorrectGuessType() {
        return correctGuessType;
    }

    public CheckGuess() {
    }

    public static void checkGuess(int type, char guess) {
        // 1 is letter 2 is vowel
        CheckGuess.setGuessType(type);
        CheckGuess.setCurrentGuess(guess);
        CheckGuess.checkVowel();
        CheckGuess.determineCorrectGuessType();
        if (CheckGuess.correctGuessType) {
            CheckGuess.determineGuessRepeat();
        }
        if (!CheckGuess.checkGuessRepeat) {
            CheckGuess.updateGuessList();
            CheckGuess.updateGuessIndex();
        }
    }
     public static void checkVowel() {
         char[] list = new char[5];
         list = vowel;
         char value = CheckGuess.getCurrentGuess();
        for (char valueInList : list) {
            if (value == valueInList) {
                CheckGuess.setIsVowel(true);
            }
        }
        CheckGuess.setIsVowel(false);
    }



    public static void determineCorrectGuessType() {
        int control = 0;
        if (CheckGuess.getIsVowel()) {
            control = 2;
        } else if (!CheckGuess.getIsVowel()) {
            control = 1;
        }

        if (CheckGuess.guessType == control) {
            CheckGuess.setCorrectGuessType(true);
        } else if (CheckGuess.guessType != control) {
            CheckGuess.setCorrectGuessType(false);
            new RfortuneMessage().displayMessage("Failed @ CheckGuess.determine"
                    + "CorrectGuessType");
        }
    }

    public static void determineGuessRepeat() {
        char guess = CheckGuess.getCurrentGuess();
        int index = CheckGuess.getGuessIndex();
        char[] tempList = new char[index];
        tempList = CheckGuess.getListOfGuesses();

        for (int i = 0; i <= index; i++) {
            if (guess == tempList[i]) {
                CheckGuess.setCheckGuessRepeat(true);
                new RfortuneMessage().displayMessage("Failed @ CheckGuess.deter"
                        + "mineGuessRepeat");
            } else if (guess != tempList[i]) {
                CheckGuess.setCheckGuessRepeat(false);
            }
        }
    }

    public static void updateGuessList() {
        //try catch statement here?
        char guess = CheckGuess.getCurrentGuess();
        int index = CheckGuess.getGuessIndex();
        int newIndex = index++;
        char[] newList = new char[26];
        newList = CheckGuess.getListOfGuesses();
        char[] oldList = new char[26];
        oldList = CheckGuess.getListOfGuesses();
        for(int i = 0; i <= newIndex; i++){
            if(oldList[i] != newList[i]){
                newList[i] = guess;
            }
        }
        CheckGuess.setListOfGuesses(newList);
    }
    
    public static void updateGuessIndex(){
        int index = CheckGuess.getGuessIndex();
        int newIndex = index++;
        CheckGuess.setGuessIndex(newIndex);
    }
}
