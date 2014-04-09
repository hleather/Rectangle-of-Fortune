/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import RfortuneTeam.HeatherandLaura.control.GameMenuControl;
import java.io.Serializable;
import RfortuneTeam.HeatherandLaura.frames.GuessLetter;
import java.util.ArrayList;

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
    private static final char[] vowel = {'A', 'E', 'I', 'O', 'U'};
    private static boolean checkPhraseRepeat;
    private static boolean isVowel;
    private static int guessType = 0;
    private static boolean correctGuessType;
    ArrayList guessList = new ArrayList();

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

    public void checkGuess(int type, char guess) {
        // 1 is letter 2 is vowel
        CheckGuess.setGuessType(type);
        CheckGuess.setCurrentGuess(guess);
        checkVowel();
        checkGuessType();
    }

    private void checkVowel() {
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

    private void checkGuessType() {
        int control = 0;
        if (CheckGuess.getIsVowel()) {
            control = 2;
        } else if (!CheckGuess.getIsVowel()) {
            control = 1;
        }

        if (CheckGuess.getGuessType() == control) {
            CheckGuess.setCorrectGuessType(true);
            checkRepeat(CheckGuess.getCurrentGuess());
        } else if (CheckGuess.guessType != control) {
            CheckGuess.setCorrectGuessType(false);
            new RfortuneError().displayError("You have to purchase a vowel. "
                    + "Enter a letter.");
        }
    }

    private void checkRepeat(char guess) {
        if (guessList.contains(guess)) {
            CheckGuess.setCheckGuessRepeat(true);
            if (CheckGuess.getGuessType() == 1) {
                new RfortuneError().displayError("That letter has already been "
                        + "guessed. Enter a different letter.");
            } else if (CheckGuess.getGuessType() == 2) {
                new RfortuneError().displayError("That vowel has already been "
                        + "guessed. Enter a different vowel.");
            }
        } else {
            CheckGuess.setCheckGuessRepeat(false);
            updateGuessList(guess);
            WordsAndPhrases.searchPhrase(CheckGuess.getGuessType(), guess);
            WordsAndPhrases.updateAndTranslateParallelArrayToString();
        }
    }

    private void updateGuessList(char guess) {
        guessList.add(guess);
    }
}
