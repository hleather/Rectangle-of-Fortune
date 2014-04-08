/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import java.io.Serializable;
import RfortuneTeam.HeatherandLaura.customExceptions.letterCheckException;
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

    private static boolean checkGuess = false;
    public static char currentGuess;
    private static boolean checkLetterRepeat = true;
    private static boolean checkVowelRepeat = true;
    private static char[] listOfLetterGuesses = new char[26];
    private static char[] listOfVowelGuesses = new char[26];
    private static char[] vowel = {'A', 'E', 'I', 'O', 'U'};
    private static char[] letter = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
        'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    private static boolean checkPhraseGuess = false;

    /**
     * @return the checkGuess
     */
    public static boolean getCheckGuess() {
        return checkGuess;
    }

    /**
     * @param aCheckGuess the checkGuess to set
     */
    public static void setCheckGuess(boolean aCheckGuess) {
        checkGuess = aCheckGuess;
    }

    /**
     * @return the currentGuess
     */
    public static char getCurrentGuess() {
        return currentGuess;
    }

    /**
     * @param aCurrentGuess the currentGuess to set
     */
    public static void setCurrentGuess(char aCurrentGuess) {
        currentGuess = aCurrentGuess;
    }

    /**
     * @return the checkLetterRepeat
     */
    public static boolean isCheckLetterRepeat() {
        return checkLetterRepeat;
    }

    /**
     * @param aCheckLetterRepeat the checkLetterRepeat to set
     */
    public static void setCheckLetterRepeat(boolean aCheckLetterRepeat) {
        checkLetterRepeat = aCheckLetterRepeat;
    }

    /**
     * @return the checkVowelRepeat
     */
    public static boolean isCheckVowelRepeat() {
        return checkVowelRepeat;
    }

    /**
     * @param aCheckVowelRepeat the checkVowelRepeat to set
     */
    public static void setCheckVowelRepeat(boolean aCheckVowelRepeat) {
        checkVowelRepeat = aCheckVowelRepeat;
    }

    /**
     * @return the listOfLetterGuesses
     */
    public static char[] getListOfLetterGuesses() {
        return listOfLetterGuesses;
    }

    /**
     * @param aListOfLetterGuesses the listOfLetterGuesses to set
     */
    public static void setListOfLetterGuesses(char[] aListOfLetterGuesses) {
        listOfLetterGuesses = aListOfLetterGuesses;
    }

    /**
     * @return the listOfVowelGuesses
     */
    public static char[] getListOfVowelGuesses() {
        return listOfVowelGuesses;
    }

    /**
     * @param aListOfVowelGuesses the listOfVowelGuesses to set
     */
    public static void setListOfVowelGuesses(char[] aListOfVowelGuesses) {
        listOfVowelGuesses = aListOfVowelGuesses;
    }

    /**
     * @return the vowel
     */
    public static char[] getVowel() {
        return vowel;
    }

    /**
     * @param aVowel the vowel to set
     */
    public static void setVowel(char[] aVowel) {
        vowel = aVowel;
    }

    /**
     * @return the letter
     */
    public static char[] getLetter() {
        return letter;
    }

    /**
     * @param aLetter the letter to set
     */
    public static void setLetter(char[] aLetter) {
        letter = aLetter;
    }

    public static boolean getCheckPhraseGuess() {
        return checkPhraseGuess;
    }

    public static void setCheckPhraseGuess(boolean checkedGuess) {
        checkPhraseGuess = checkedGuess;
    }

    public CheckGuess() {
    }

    public static char[] checkLetterGuess(char letterGuess) {
        int letterIndex = 0;
        boolean done = false;
        while (letterIndex <= 26 && !done) {
            try {
                if (!isVowel(letter, letterGuess)) {
                    new RfortuneError().displayError("Sorry, you have to buy "
                            + "a vowel. Guess a letter. ");
                    GuessLetter.controlGuess = false;
                    break;
                }

                if (alreadyInLetterList(getListOfLetterGuesses(), letterGuess)) {
                    new RfortuneError().displayError("That letter has already "
                            + "been guessed. Try again.");
                    GuessLetter.controlGuess = false;
                    break;
                }

                CheckGuess.getListOfLetterGuesses()[letterIndex] = letterGuess;
                letterIndex++;

                if (!isCheckLetterRepeat()) {
                    setCurrentGuess(letterGuess);
                    setCheckGuess(true);
                    GuessLetter.controlGuess = true;
                    done = true;

                }
            } catch (letterCheckException e) {
                System.out.println("\n" + e.getMessage());
            }
        }

        char[] newLetterGuessList = new char[letterIndex];
        System.arraycopy(CheckGuess.getListOfLetterGuesses(), 0, newLetterGuessList, 0, letterIndex);

        newLetterGuessList = CheckGuess.sortLetterList(newLetterGuessList);

        return newLetterGuessList;
    }

    public static char[] checkVowelGuess(char vowelGuess) {
        int vowelIndex = 0;
        boolean done = false;
        while (vowelIndex < 10 && !done) {
            try {
                if (isVowel(vowel, vowelGuess)) {
                    new RfortuneError().displayError("That is not a vowel. "
                            + "Please enter a vowel. ");
                    GuessLetter.controlGuess = false;
                    break;
                }

                if (alreadyInVowelList(getListOfVowelGuesses(), vowelGuess)) {
                    new RfortuneError().displayError("That vowel has already "
                            + "been guessed. Try again.");
                    GuessLetter.controlGuess = false;
                    break;
                }

                CheckGuess.getListOfVowelGuesses()[vowelIndex] = vowelGuess;
                vowelIndex++;

                if (!isCheckVowelRepeat()) {
                    setCurrentGuess(vowelGuess);
                    setCheckGuess(true);
                    GuessLetter.controlGuess = true;
                    done = true;
                }
            } catch (letterCheckException e) {
                System.out.println("\n" + e.getMessage());
            }
        }

        char[] newVowelGuessList = new char[vowelIndex];
        System.arraycopy(CheckGuess.getListOfVowelGuesses(), 0, newVowelGuessList, 0, vowelIndex);

        newVowelGuessList = CheckGuess.sortVowelList(newVowelGuessList);

        return newVowelGuessList;
    }

    public static char[] sortLetterList(char[] letters) {
        char tempLetter;
        boolean notDone = true;
        while (notDone) {

            notDone = false;
            for (int i = 0; i < letters.length - 1; i++) {
                if (letters[i] < letters[i + 1]) {
                    tempLetter = letters[i];
                    letters[i] = letters[i + 1];
                    letters[i + 1] = tempLetter;;
                    notDone = true;
                }
            }
        }

        return letters;
    }

    public static char[] sortVowelList(char[] vowels) {
        char tempVowel;
        boolean notDone = true;
        while (notDone) {

            notDone = false;
            for (int i = 0; i < vowels.length - 1; i++) {
                if (vowels[i] < vowels[i + 1]) {
                    tempVowel = vowels[i];
                    vowels[i] = vowels[i + 1];
                    vowels[i + 1] = tempVowel;;
                    notDone = true;
                }
            }
        }

        return vowels;
    }

    private static boolean alreadyInLetterList(char[] list, char value) throws letterCheckException {
        for (char valueInList : list) {
            if (value == valueInList) {
                CheckGuess.setCheckLetterRepeat(true);
                new RfortuneError().displayError("That letter has already been "
                        + "guessed. Guess a different letter.");
            } else {
                setCheckLetterRepeat(false);

                return false;
            }
        }
        return false;
    }

    private static boolean alreadyInVowelList(char[] list, char value) throws letterCheckException {
        for (char valueInList : list) {
            if (value == valueInList) {
                CheckGuess.setCheckVowelRepeat(true);
                new RfortuneError().displayError("That letter has already been "
                        + "guessed. Guess a different letter.");
            }
        }
        setCheckVowelRepeat(false);
        return false;
    }

    private static boolean isVowel(char[] list, char value) {
        for (char valueInList : list) {
            if (value == valueInList) {
                return true;
            }
        }
        return false;
    }
}
