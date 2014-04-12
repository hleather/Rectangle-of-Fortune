/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RfortuneTeam.HeatherandLaura.enums;

/**
 *
 * @author Heather
 */
public enum ErrorType {

    ERROR101("Sorry, there is a problem in Bank Class, updateBankVowelPurchase."),
    ERROR102("Sorry, you need $250 to purchase."),
    ERROR103("Sorry, there is a problem in BankClass, updateBankSpinWorth."),
    ERROR104("You have to purchase a vowel. Enter a letter."),
    ERROR105("Invalid command. Please enter a valid command."),
    ERROR106("That letter has already been guessed. Enter a different guess."),
    ERROR107("Game.newGame called."),
    ERROR108("A name must be at least one character long."),
    ERROR109("A name cannot be more than 10 characters long."),
    ERROR201("That name has already been entered."),
    ERROR202("Valid.");
    String message;

    ErrorType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public static void displayErrorMsg(String errorMessage) {
        String fullMessage = "\t+ ERROR: " + errorMessage + " +";
        int dividerLineLength = fullMessage.length();
        StringBuilder dividerLine = new StringBuilder(dividerLineLength);
        for (int i = 0; i < dividerLineLength; i++) {
            dividerLine.insert(i, '+');
        }
        System.out.println("\t" + dividerLine.toString());
        System.out.println(fullMessage);
        System.out.println("\t" + dividerLine.toString());
    }

}
