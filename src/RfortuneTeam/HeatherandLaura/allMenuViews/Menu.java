/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.allMenuViews;

import RfortuneTeam.HeatherandLaura.customExceptions.MenuException;
import RfortuneTeam.HeatherandLaura.enums.ErrorType;
import RfortuneTeam.HeatherandLaura.interfaces.DisplayInfo;
import java.util.Scanner;
import rfortune.Rfortune;

/**
 *
 * @author Heather and Laura
 */

public class Menu implements DisplayInfo {

    private String[][] menuItems = null;

    public Menu() {
    }

    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
    
    // This is an abstract function. It specifies that all sub-classes must
    // implement this function.
    public String pullInput() {
        return null;      
        
    }
        
    public String[][] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }

    
    @Override
    public void display() {
    }

    private boolean validCommand(String command) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    protected final String getCommand() throws MenuException {

        Scanner inFile = Rfortune.getInputFile();
        String command;
        boolean valid;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                throw new MenuException(ErrorType.ERROR105.displayErrorType());  
            }
            return command;
                
        } while (!valid);
    }


}