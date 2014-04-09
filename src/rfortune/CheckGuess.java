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
        CheckGuess.checkGuessType();
        if (CheckGuess.correctGuessType) {
            CheckGuess.checkRepeat();
        }
        if (!CheckGuess.checkGuessRepeat) {
            CheckGuess.updateGuessList(CheckGuess.getListOfGuesses(), CheckGuess.getGuessIndex(), CheckGuess.getCurrentGuess());
        }
    }

    public static void checkVowel() {
        int control = 0;
        char value = CheckGuess.getCurrentGuess();
        for (char valueInList : vowel) {
            if (value == valueInList) {
                control++;
            }
        }
        if (control == 0) {
            CheckGuess.setIsVowel(false);
        } else if (control > 0) {
            CheckGuess.setIsVowel(true);
        }
    }

    public static void checkGuessType() {
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

    public static void checkRepeat() {
        int control = 0;
        char value = CheckGuess.getCurrentGuess();
        for (char valueInList : CheckGuess.getListOfGuesses()) {
            if (value == valueInList) {
                control++;
            }
        }
        if (control == 0) {
            CheckGuess.setCheckGuessRepeat(false);
            new RfortuneMessage().displayMessage("CheckRepeat.control == 0");
        } else if (control > 0) {
            CheckGuess.setCheckGuessRepeat(true);
            new RfortuneMessage().displayMessage("CheckRepeat.control > 0");
        }
    }

    public static void updateGuessList(char[] oldList, int index, char guess) {
        char[] newList = new char[oldList.length + 1];
        for (int i = 0; i < newList.length; i++) {
            if (i == index) {
                newList[index] = guess;
            }
            if (i < index) {
                oldList[i] = newList[i];
            }
            if (i > index) {
                oldList[i - 1] = newList[i];
            }
        }
        CheckGuess.setListOfGuesses(newList);
        new RfortuneError().displayError("Test: " + CheckGuess.getGuessIndex());
        CheckGuess.setGuessIndex(CheckGuess.getGuessIndex() + 1);
        new RfortuneError().displayError(" Test: " + CheckGuess.getGuessIndex());
        
    }

}

