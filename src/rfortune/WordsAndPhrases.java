/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import RfortuneTeam.HeatherandLaura.allMenuViews.GamePreferencesView;
import RfortuneTeam.HeatherandLaura.control.GameMenuControl;
import RfortuneTeam.HeatherandLaura.control.MainMenuControl;
import RfortuneTeam.HeatherandLaura.frames.CorrectGuess;
import RfortuneTeam.HeatherandLaura.frames.GameTurn;
import RfortuneTeam.HeatherandLaura.frames.IncorrectGuess;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Heather
 */
public class WordsAndPhrases implements Serializable {

    static CorrectGuess correctGuess = new CorrectGuess();
    static IncorrectGuess incorrectGuess = new IncorrectGuess();
    static GameTurn gameTurn = new GameTurn();
    private static int index;
    private static String phrase;
    private static String parallelPhrase;
    private static char[] charArray;
    private static char[] parallelCharArray;
    private static int correctGuesses;
    private static boolean foundMatch;
    static GameMenuControl gameMenuControl = new GameMenuControl();

    public static int getIndex() {
        return index;
    }

    /**
     * @param aIndex the index to set
     */
    public static void setIndex(int aIndex) {
        index = aIndex;
    }

    /**
     * @return the phrase
     */
    public static String getCurrentPhrase() {
        return phrase;
    }

    /**
     * @param aPhrase the phrase to set
     */
    public static void setCurrentPhrase(String aPhrase) {
        phrase = aPhrase;
    }

    /**
     * @return the parallelPhrase
     */
    public static String getParallelPhrase() {
        return parallelPhrase;
    }

    /**
     * @param aParallelPhrase the parallelPhrase to set
     */
    public static void setParallelPhrase(String aParallelPhrase) {
        parallelPhrase = aParallelPhrase;
    }

    /**
     * @return the charArray
     */
    public static char[] getCharArray() {
        return charArray;
    }

    /**
     * @param aCharArray the charArray to set
     */
    public static void setCharArray(char[] aCharArray) {
        charArray = aCharArray;
    }

    /**
     * @return the parallelCharArray
     */
    public static char[] getParallelCharArray() {
        return parallelCharArray;
    }

    /**
     * @param aParallelCharArray the parallelCharArray to set
     */
    public static void setParallelCharArray(char[] aParallelCharArray) {
        parallelCharArray = aParallelCharArray;
    }

    public static int getCorrectGuesses() {
        return correctGuesses;
    }

    public static void setCorrectGuesses(int aWoots) {
        correctGuesses = aWoots;
    }

    public static void setFoundMatch(boolean match) {
        foundMatch = match;
    }

    public static boolean getFoundMatch() {
        return foundMatch;
    }

    public WordsAndPhrases() {
    }

    public static void setPhrases() {
        String easyPhrases[] = {"BETTER LATE THAN NEVER", "BLOOD IS THICKER THAN WATER",
            "MISERY LOVES COMPANY"};
        String pEasyPhrases[] = {"------ ---- ---- -----", "----- -- ------- "
            + "---- -----", "------ ----- -------"};
        String hardPhrases[] = {"EVERY CLOUD HAS A SILVER LINING", "KNOWLEDGE IS POWER",
            "MUCH IS EXPECTED WHERE MUCH IS GIVEN", "HOP ON POP"};
        String pHardPhrases[] = {"----- ----- --- - ------ ------", "--------- "
            + "-- -----", "---- -- -------- ----- ---- -- -----",
            "--- -- ---"};
        int control = 2;
        if ("H".equals(GamePreferencesView.setDifficulty)) {
            control = 3;
        }

        Random indexLocation = new Random();
        setIndex(1 + indexLocation.nextInt(control));

        if ("E".equals(GamePreferencesView.setDifficulty)) {
            setCurrentPhrase(easyPhrases[getIndex()]);
            setParallelPhrase(pEasyPhrases[getIndex()]);
        }
        if ("H".equals(GamePreferencesView.setDifficulty)) {
            setCurrentPhrase(hardPhrases[getIndex()]);
            setParallelPhrase(pHardPhrases[getIndex()]);
        }
    }

    public static void translatePhraseToChar() {
        setCharArray(getCurrentPhrase().toCharArray());
    }

    public static void translateParallelPhraseToChar() {
        setParallelCharArray(getParallelPhrase().toCharArray());
    }

    public static void searchPhrase(int typeGuess, char guess) {

        int control = 0;
        for (int i = 0; i < getCharArray().length; i++) {
            if (getCharArray()[i] == guess) {
                control++;
                setCorrectGuesses(getCorrectGuesses() + 1);

            }
        }
        if (control > 0) {
            gameMenuControl.correctWindow(String.valueOf(guess));

        } else if (control == 0) {
            incorrectGuess.jtfIncorrectGuess.setText(String.valueOf(guess));
            gameMenuControl.incorrectWindow(String.valueOf(guess));

        }
        if (typeGuess == 1) {
            Bank.updateBankSpinWorth(control);
        }
    }

    public static void updateParallelArray() {
        for (int i = 0; i < getCharArray().length; i++) {
            if (getCharArray()[i] == (CheckGuess.getCurrentGuess())) {
                getParallelCharArray()[i] = CheckGuess.getCurrentGuess();
            }
        }
    }

    public static void checkPhrase(String phraseGuess) {
        String guess = WordsAndPhrases.getCurrentPhrase();
        if (guess.equals(phraseGuess)) {
            Bank.updateBankPhraseGuess();
            gameMenuControl.correctWindow(phraseGuess);
        } else {
            gameMenuControl.incorrectWindow(phraseGuess);
        }

    }

    public static String updateAndTranslateParallelArrayToString() {
        WordsAndPhrases.updateParallelArray();
        String control = String.copyValueOf(WordsAndPhrases.getParallelCharArray());
        return control;
    }
}
