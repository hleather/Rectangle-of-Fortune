/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import RfortuneTeam.HeatherandLaura.control.MainMenuControl;
import RfortuneTeam.HeatherandLaura.allMenuViews.GamePreferencesView;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Heather
 */
public class Bank implements Serializable {

    private static long bankPlayerUp;
    private static long bankNumberPlayer1;
    private static long bankNumberPlayer2;
    private static long bankNumberPlayer3;
    private static String bankPlayer1 = " ";
    private static String bankPlayer2 = " ";
    private static String bankPlayer3 = " ";
    private static long spinWorth;
    private static boolean hasEnough = false;
    private static long guessPhraseWorth;
    private static int randomSpin;
    private static int random;

    /**
     * @return the bankPlayerUp
     */
    public static long getBankPlayerUp() {
        return bankPlayerUp;
    }

    /**
     * @param aBankPlayerUp the bankPlayerUp to set
     */
    public static void setBankPlayerUp(long aBankPlayerUp) {
        bankPlayerUp = aBankPlayerUp;
    }

    /**
     * @return the bankNumberPlayer1
     */
    public static long getBankNumberPlayer1() {
        return bankNumberPlayer1;
    }

    /**
     * @param aBankNumberPlayer1 the bankNumberPlayer1 to set
     */
    public static void setBankNumberPlayer1(long aBankNumberPlayer1) {
        bankNumberPlayer1 = aBankNumberPlayer1;
    }

    /**
     * @return the bankNumberPlayer2
     */
    public static long getBankNumberPlayer2() {
        return bankNumberPlayer2;
    }

    /**
     * @param aBankNumberPlayer2 the bankNumberPlayer2 to set
     */
    public static void setBankNumberPlayer2(long aBankNumberPlayer2) {
        bankNumberPlayer2 = aBankNumberPlayer2;
    }

    /**
     * @return the bankNumberPlayer3
     */
    public static long getBankNumberPlayer3() {
        return bankNumberPlayer3;
    }

    /**
     * @param aBankNumberPlayer3 the bankNumberPlayer3 to set
     */
    public static void setBankNumberPlayer3(long aBankNumberPlayer3) {
        bankNumberPlayer3 = aBankNumberPlayer3;
    }

    /**
     * @return the bankPlayer1
     */
    public static String getBankPlayer1() {
        return bankPlayer1;
    }

    /**
     * @param aBankPlayer1 the bankPlayer1 to set
     */
    public static void setBankPlayer1(String aBankPlayer1) {
        bankPlayer1 = aBankPlayer1;
    }

    /**
     * @return the bankPlayer2
     */
    public static String getBankPlayer2() {
        return bankPlayer2;
    }

    /**
     * @param aBankPlayer2 the bankPlayer2 to set
     */
    public static void setBankPlayer2(String aBankPlayer2) {
        bankPlayer2 = aBankPlayer2;
    }

    /**
     * @return the bankPlayer3
     */
    public static String getBankPlayer3() {
        return bankPlayer3;
    }

    /**
     * @param aBankPlayer3 the bankPlayer3 to set
     */
    public static void setBankPlayer3(String aBankPlayer3) {
        bankPlayer3 = aBankPlayer3;
    }

    /**
     * @return the spinWorth
     */
    public static long getSpinWorth() {
        return spinWorth;
    }

    /**
     * @param aSpinWorth the spinWorth to set
     */
    public static void setSpinWorth(long aSpinWorth) {
        spinWorth = aSpinWorth;
    }

    /**
     * @return the hasEnough
     */
    public static boolean isHasEnough() {
        return hasEnough;
    }

    /**
     * @param aHasEnough the hasEnough to set
     */
    public static void setHasEnough(boolean aHasEnough) {
        hasEnough = aHasEnough;
    }

    /**
     * @return the guessPhraseWorth
     */
    public static long getGuessPhraseWorth() {
        return guessPhraseWorth;
    }

    /**
     * @param aGuessPhraseWorth the guessPhraseWorth to set
     */
    public static void setGuessPhraseWorth(long aGuessPhraseWorth) {
        guessPhraseWorth = aGuessPhraseWorth;
    }

    /**
     * @return the randomSpin
     */
    public static int getRandomSpin() {
        return randomSpin;
    }

    /**
     * @param aRandomSpin the randomSpin to set
     */
    public static void setRandomSpin(int aRandomSpin) {
        randomSpin = aRandomSpin;
    }

    /**
     * @return the random
     */
    public static int getRandom() {
        return random;
    }

    /**
     * @param aRandom the random to set
     */
    public static void setRandom(int aRandom) {
        random = aRandom;
    }

    public Bank() {
    }

    /**
     * *************************************************************************
     * numPlayersBank(). sets the starting value (0) to the correct number of
     * players in the current game. It only sets the starting value to the
     * specific number of players in order to leave any additional player slots
     * empty for the MainMenuControl.setScreen().gameDisplay array. This
     * function also converts the bank (variable type long) to a String so it
     * can be displayed in the MainMenuControl.setScreen().gameDisplay array.
    **************************************************************************
     */
    public static void numPlayersBank() {
        if (MainMenuControl.getSetNumPlayers() == 3) {
            setBankNumberPlayer1(0);
            setBankNumberPlayer2(0);
            setBankNumberPlayer3(0);
        }
        if (MainMenuControl.getSetNumPlayers() == 2) {
            setBankNumberPlayer1(0);
            setBankNumberPlayer2(0);
        }
        if (MainMenuControl.getSetNumPlayers() == 1) {
            setBankNumberPlayer1(0);
        }
    }

    public static void updateBankPlayer() {
        if (MainMenuControl.getSetNumPlayers() == 3) {
            setBankPlayer1(Long.toString(Bank.getBankNumberPlayer1()));
            setBankPlayer2(Long.toString(Bank.getBankNumberPlayer2()));
            setBankPlayer3(Long.toString(Bank.getBankNumberPlayer3()));
        }
        if (MainMenuControl.getSetNumPlayers() == 2) {
            setBankPlayer1(Long.toString(Bank.getBankNumberPlayer1()));
            setBankPlayer2(Long.toString(Bank.getBankNumberPlayer2()));
        }
        if (MainMenuControl.getSetNumPlayers() == 1) {
            setBankPlayer1(Long.toString(Bank.getBankNumberPlayer1()));
        }
    }

    /**
     * *************************************************************************
     * bankPlayerTurn(). defines whose bank will be adjusted based on which
     * players turn it currently is.
    **************************************************************************
     */
    public static void bankPlayerTurn() {
        if (PlayerTurn.getPlayerUp() == 0) {
            setBankPlayerUp(getBankNumberPlayer1());
        } else if (PlayerTurn.getPlayerUp() == 1) {
            setBankPlayerUp(getBankNumberPlayer2());
        } else if (PlayerTurn.getPlayerUp() == 2) {
            setBankPlayerUp(getBankNumberPlayer3());
        }
    }

    /**
     * *************************************************************************
     * display the current player's bank amount.
    **************************************************************************
     */
    public static void displayPlayerUpBank() {
        if (PlayerTurn.getPlayerUp() == 0) {
            System.out.println("Bank: " + getBankPlayer1());
        } else if (PlayerTurn.getPlayerUp() == 1) {
            System.out.println("Bank: " + getBankPlayer2());
        } else if (PlayerTurn.getPlayerUp() == 2) {
            System.out.println("Bank: " + getBankPlayer3());
        }
    }

    /**
     * *************************************************************************
     * display player 1's bank
    **************************************************************************
     */
    public static void displayBankPlayer1() {
        System.out.println(getBankPlayer1());
    }

    /**
     * *************************************************************************
     * display player 2's bank
    **************************************************************************
     */
    public static void displayBankPlayer2() {
        System.out.println(getBankPlayer2());
    }

    /**
     * *************************************************************************
     * display player 3's bank
    **************************************************************************
     */
    public static void displayBankPlayer3() {
        System.out.println(getBankPlayer3());
    }

    /**
     * *************************************************************************
     * updateBankVowelPurchase(). first checks to see if the current player has
     * enough money to purchase a vowel (250). If the player has enough money to
     * purchase a vowel, this function subtracts 250 from bankPlayerUp. It will
     * return true or false to let the ***vowel*** function know ***?***.
    **************************************************************************
     */
    public static void updateBankVowelPurchase() {
    PlayerTurn playerTurn = new PlayerTurn();
        playerTurn.updatePlayersTurn();
        if (getBankPlayerUp() >= 250) {
            setHasEnough(true);
            long bank = 0;
            long updateBank;
            int control = 0;
            if (PlayerTurn.getPlayerUp() == 0) {
                bank = getBankNumberPlayer1();
                control = 1;
            } else if (PlayerTurn.getPlayerUp() == 1) {
                bank = getBankNumberPlayer2();
                control = 2;
            } else if (PlayerTurn.getPlayerUp() == 2) {
                bank = getBankNumberPlayer3();
                control = 3;
            }
            updateBank = bank - 250;
            if (control == 1) {
                setBankNumberPlayer1(updateBank);
            } else if (control == 2) {
                setBankNumberPlayer2(updateBank);
            } else if (control == 3) {
                setBankNumberPlayer3(updateBank);
            } else if (control == 0) {
                new RfortuneError().displayError("Sorry, there is a problem in Bank "
                        + "Class, updateBankVowelPurchase.");
            }
            Bank.updateBankPlayer();
        }
    }

    /**
     * *************************************************************************
     * spinWorth(). sets the amount the next character guess is worth using a
     * random number generator. The values will be different for Easy and Hard
     * modes and the function returns that value.
    **************************************************************************
     */
    public static void spin() {
        Random spin = new Random();
        setRandom(1 + spin.nextInt(8));
        setRandomSpin(getRandom());
    }

    public static void spinWorth() {
        int amount = 25;
        switch (GamePreferencesView.setDifficulty) {
            case "E":
                amount = 25;
                break;
            case "H":
                amount = 50;
                break;
        }
        setSpinWorth(amount * getRandomSpin());
    }

    public static void printSpinWorth() {
        System.out.println("Guess Worth: " + Bank.getSpinWorth());
    }

    public static void updateBankSpinWorth() {
        int woot = WordsAndPhrases.getWoots();
        long bank = 0;
        long updateBank;
        int control = 0;
        if (PlayerTurn.getPlayerUp() == 0) {
            bank = getBankNumberPlayer1();
            control = 1;
        } else if (PlayerTurn.getPlayerUp() == 1) {
            bank = getBankNumberPlayer2();
            control = 2;
        } else if (PlayerTurn.getPlayerUp() == 2) {
            bank = getBankNumberPlayer3();
            control = 3;
        }
        updateBank = bank + (getSpinWorth() * woot);
        if (control == 1) {
            setBankNumberPlayer1(updateBank);
        } else if (control == 2) {
            setBankNumberPlayer2(updateBank);
        } else if (control == 3) {
            setBankNumberPlayer3(updateBank);
        } else if (control == 0) {
            new RfortuneError().displayError("Sorry, there is a problem in Bank "
                    + "Class, updateBankSpinWorth.");
        }
        Bank.updateBankPlayer();
    }

    /**
     * *************************************************************************
     * phraseWorth(). calculates how much guessing the remainder of the phrase
     * is worth and returns that value.
    **************************************************************************
     */
    public static void phraseWorth() {
        int phraseLength = WordsAndPhrases.getCharArray().length;
        int cGuesses = Game.getCorrectGuesses();
        int guessOpenSpaceWorth = 100;
        int openSpaces = phraseLength - cGuesses;
        setGuessPhraseWorth(openSpaces * guessOpenSpaceWorth);
    }

    public String[] sortScores() {
        Bank.updateBankPlayer();
        String playerListOrder[] = {getBankPlayer1(), getBankPlayer2(), getBankPlayer3()};
        String temp;
        boolean notDone = true;
        while (notDone) {

            notDone = false;
            for (int i = 0; i < playerListOrder.length - 1; i++) {
                int compareResult = playerListOrder[i].compareTo(playerListOrder[i + 1]);
                if (compareResult > 0) {
                    temp = playerListOrder[i];
                    playerListOrder[i] = playerListOrder[i + 1];
                    playerListOrder[i + 1] = temp;
                    notDone = true;

                }
            }

        }
        return playerListOrder;

    }

}
