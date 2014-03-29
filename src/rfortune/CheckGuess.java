/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import java.io.Serializable;
import java.util.Scanner;
import RfortuneTeam.HeatherandLaura.customExceptions.letterCheckException;

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
    static char currentGuess;
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
    public static boolean isCheckGuess() {
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
    
    public static boolean getCheckPhraseGuess(){
        return checkPhraseGuess;
    }
    public static void setCheckPhraseGuess(boolean checkedGuess){
        checkPhraseGuess = checkedGuess;
    }

    public CheckGuess() {
    }

    public static char[] checkLetterGuess() {
        Scanner newLetterGuess = Rfortune.getInputFile();

        System.out.println("\n\t-----------------------------------------------");
        System.out.println("\t You have chosen to guess a consonant!");
        System.out.println("\t-----------------------------------------------");

        int letterIndex = 0;
        boolean done = false;
        while (letterIndex <= 26 && !done) {
            try{
            System.out.println("\tEnter your guess: ");
            char letterGuess;
            letterGuess = newLetterGuess.next().toUpperCase().charAt(0);
            CheckGuess.setCurrentGuess(letterGuess);

            if (!isVowel(letter, letterGuess)) {
                new RfortuneError().displayError("Sorry, you have to buy "
                        + "a vowel. Guess a letter. ");
                continue;
            }

            if (alreadyInLetterList(getListOfLetterGuesses(), letterGuess)) {
                new RfortuneError().displayError("That letter has already "
                        + "been guessed. Try again.");
                continue;
            }

            CheckGuess.getListOfLetterGuesses()[letterIndex] = letterGuess;
            letterIndex++;

            if (!isCheckLetterRepeat()) {
                setCurrentGuess(letterGuess);
                setCheckGuess(true);
                done = true;
            }
            }catch(letterCheckException e){
                System.out.println("\n" + e.getMessage());
            }
        }

        char[] newLetterGuessList = new char[letterIndex];
        System.arraycopy(CheckGuess.getListOfLetterGuesses(), 0, newLetterGuessList, 0, letterIndex);

        newLetterGuessList = CheckGuess.sortLetterList(newLetterGuessList);

        return newLetterGuessList;
    }

    public static char[] checkVowelGuess() {
        Bank.updateBankVowelPurchase();

        if (!Bank.isHasEnough()) {
            System.out.println("Sorry, you do not have enough money to buy a "
                    + "vowel.");
        } else {
            Scanner newVowelGuess = Rfortune.getInputFile();

            System.out.println("\n\t-----------------------------------------------");
            System.out.println("\t You have chosen to buy a vowel!");
            System.out.println("\t-----------------------------------------------");

            int vowelIndex = 0;
            boolean done = false;
            while (vowelIndex < 10 && !done) {
                try{
                System.out.println("\tEnter your guess: ");
                char vowelGuess;
                vowelGuess = newVowelGuess.next().toUpperCase().charAt(0);

                if (!isVowel(vowel, vowelGuess)) {
                    new RfortuneError().displayError("That is not a vowel. "
                            + "Please enter a vowel. ");
                    continue;
                }

                if (alreadyInVowelList(getListOfVowelGuesses(), vowelGuess)) {
                    new RfortuneError().displayError("That vowel has already "
                            + "been guessed. Try again.");
                    continue;
                }

                CheckGuess.getListOfVowelGuesses()[vowelIndex] = vowelGuess;
                vowelIndex++;

                if (!isCheckVowelRepeat()) {
                    setCurrentGuess(vowelGuess);
                    setCheckGuess(true);
                    done = true;
                }
                }catch(letterCheckException e){
                     System.out.println("\n" + e.getMessage());
                }
            }

            char[] newVowelGuessList = new char[vowelIndex];
            System.arraycopy(CheckGuess.getListOfVowelGuesses(), 0, newVowelGuessList, 0, vowelIndex);

            newVowelGuessList = CheckGuess.sortVowelList(newVowelGuessList);

            return newVowelGuessList;
        }
        return null;
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

    private static boolean alreadyInLetterList(char[] list, char value) throws letterCheckException{
        for (char valueInList : list) {
            if (value == valueInList) {
                throw new letterCheckException("That letter is already in the list.");
                //return true;
            }
        }
        setCheckLetterRepeat(false);
        return false;
    }

    private static boolean alreadyInVowelList(char[] list, char value) throws letterCheckException{
        for (char valueInList : list) {
            if (value == valueInList) {
                throw new letterCheckException("That letter is already in the list.");
                //return true;
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
