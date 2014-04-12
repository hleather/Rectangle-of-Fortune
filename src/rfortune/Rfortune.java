/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfortune;

import RfortuneTeam.HeatherandLaura.frames.EnterPlayerNames;
import RfortuneTeam.HeatherandLaura.frames.GameMenu;
import RfortuneTeam.HeatherandLaura.frames.MainFrame;
import java.util.Scanner;

/**
 *
 * @author Heather and Laura
 */
public class Rfortune {

    // Instance variables
    public static Scanner inFile = new Scanner(System.in);
    static MainFrame mainFrame = new MainFrame();
    static Rfortune rFortune = null;
    PlayersList playersList = new PlayersList();
    static GameMenu gameMenu = new GameMenu();

    public static void main(String[] args) {

        //second
        try {
            rFortune = new Rfortune();

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    MainFrame mainFrame = new MainFrame();

                    mainFrame.setVisible(true);
                }
            });
        } catch (Throwable ex) {
                    //Need to do: Add error display message
            //Need to do: Add any other desired action
        } finally {
            Rfortune.inFile.close();
            if (Rfortune.mainFrame != null) {
                Rfortune.mainFrame.dispose();
            }

        }
    }

    public static Scanner getInputFile() {
        return Rfortune.inFile;
    }

    public void newGame() {
        playersList.resetList();
        EnterPlayerNames.control = 0;
        Bank.setBankNumberPlayer1(0);
        Bank.setBankNumberPlayer2(0);
        Bank.setBankNumberPlayer3(0);
        gameMenu.jtfPlayer1Bank.setText(" ");
        gameMenu.jtfPlayer2Bank.setText(" ");
        gameMenu.jtfPlayer3Bank.setText(" ");
        gameMenu.jtfPlayer1Name.setText(" ");
        gameMenu.jtfPlayer2Name.setText(" ");
        gameMenu.jtfPlayer3Name.setText(" ");

        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    MainFrame mainFrame = new MainFrame();

                    mainFrame.setVisible(true);
                }
            });
        } 
         finally {
            Rfortune.inFile.close();
            if (Rfortune.mainFrame != null) {
                Rfortune.mainFrame.dispose();
            }

        }
    }
}
