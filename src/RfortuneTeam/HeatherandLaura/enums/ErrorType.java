/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RfortuneTeam.HeatherandLaura.enums;

import javax.swing.JOptionPane;

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
    ERROR107("A name must be at least one character long."),
    ERROR108("A name cannot be more than 10 characters long."),
    ERROR109("That name has already been entered."),
    ERROR201("Valid."),
    ERROR202("PlayerList error");
    String message;

    private ErrorType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String displayErrorType() {
        JOptionPane.showMessageDialog(null, this.message);
        return null;
}

}
