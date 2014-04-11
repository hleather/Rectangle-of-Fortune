/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.frames;

import RfortuneTeam.HeatherandLaura.control.GameMenuControl;
import RfortuneTeam.HeatherandLaura.allMenuViews.HelpMenuView;
import RfortuneTeam.HeatherandLaura.control.MainMenuControl;
import rfortune.Game;
import rfortune.PlayerTurn;
import rfortune.WordsAndPhrases;

/**
 *
 * @author Laura
 */
public class GameMenu extends javax.swing.JFrame {
    GameMenuControl gameMenuControl = new GameMenuControl();
    HelpMenuView helpMenuView = new HelpMenuView();
    MainMenuControl mainMenuControl = new MainMenuControl();
    static GameTurn gameTurn = new GameTurn();
    PlayerTurn playerTurn = new PlayerTurn();
    Game game = new Game();
    /**
     * Creates new form GameMenu
     */
    public GameMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBody = new javax.swing.JPanel();
        jpTitle = new javax.swing.JPanel();
        jbTakeTurn = new javax.swing.JButton();
        jbHelp = new javax.swing.JButton();
        jbQuit = new javax.swing.JButton();
        jlSubtitle = new javax.swing.JLabel();
        jlTitle = new javax.swing.JLabel();
        jlPlayer1Head = new javax.swing.JLabel();
        jtlPlayerTurn = new javax.swing.JLabel();
        jlPlayer2Head = new javax.swing.JLabel();
        jtfPlayer3Name = new javax.swing.JTextField();
        jtfPlayer1Name = new javax.swing.JTextField();
        jtfPlayer2Name = new javax.swing.JTextField();
        jtfPlayer1Bank = new javax.swing.JTextField();
        jtfPlayer2Bank = new javax.swing.JTextField();
        jtfPlayer3Bank = new javax.swing.JTextField();
        jlPlayer3Head1 = new javax.swing.JLabel();
        jtfPlayerTurnName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpBody.setBackground(new java.awt.Color(0, 102, 102));
        jpBody.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jpTitle.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jpTitleLayout = new javax.swing.GroupLayout(jpTitle);
        jpTitle.setLayout(jpTitleLayout);
        jpTitleLayout.setHorizontalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpTitleLayout.setVerticalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jbTakeTurn.setBackground(new java.awt.Color(153, 153, 153));
        jbTakeTurn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbTakeTurn.setForeground(new java.awt.Color(51, 51, 51));
        jbTakeTurn.setText("Take Turn");
        jbTakeTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTakeTurnActionPerformed(evt);
            }
        });

        jbHelp.setBackground(new java.awt.Color(153, 153, 153));
        jbHelp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbHelp.setForeground(new java.awt.Color(51, 51, 51));
        jbHelp.setText("Help");
        jbHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHelpActionPerformed(evt);
            }
        });

        jbQuit.setBackground(new java.awt.Color(153, 153, 153));
        jbQuit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbQuit.setForeground(new java.awt.Color(51, 51, 51));
        jbQuit.setText("Quit");
        jbQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitActionPerformed(evt);
            }
        });

        jlSubtitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 30)); // NOI18N
        jlSubtitle.setForeground(new java.awt.Color(153, 153, 153));
        jlSubtitle.setText("Game Menu");

        jlTitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 36)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(153, 153, 153));
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setText("Rectangle of Fortune");

        jlPlayer1Head.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jlPlayer1Head.setText("Player One");

        jtlPlayerTurn.setFont(new java.awt.Font("Lucida Sans", 0, 22)); // NOI18N
        jtlPlayerTurn.setText("Player Turn:");

        jlPlayer2Head.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jlPlayer2Head.setText("Player Two");

        jtfPlayer3Name.setEditable(false);
        jtfPlayer3Name.setBackground(new java.awt.Color(255, 255, 255));
        jtfPlayer3Name.setFont(new java.awt.Font("David", 0, 24)); // NOI18N

        jtfPlayer1Name.setEditable(false);
        jtfPlayer1Name.setBackground(new java.awt.Color(255, 255, 255));
        jtfPlayer1Name.setFont(new java.awt.Font("David", 0, 24)); // NOI18N

        jtfPlayer2Name.setEditable(false);
        jtfPlayer2Name.setBackground(new java.awt.Color(255, 255, 255));
        jtfPlayer2Name.setFont(new java.awt.Font("David", 0, 24)); // NOI18N

        jtfPlayer1Bank.setEditable(false);
        jtfPlayer1Bank.setBackground(new java.awt.Color(255, 255, 255));
        jtfPlayer1Bank.setFont(new java.awt.Font("David", 0, 24)); // NOI18N

        jtfPlayer2Bank.setEditable(false);
        jtfPlayer2Bank.setBackground(new java.awt.Color(255, 255, 255));
        jtfPlayer2Bank.setFont(new java.awt.Font("David", 0, 24)); // NOI18N

        jtfPlayer3Bank.setEditable(false);
        jtfPlayer3Bank.setBackground(new java.awt.Color(255, 255, 255));
        jtfPlayer3Bank.setFont(new java.awt.Font("David", 0, 24)); // NOI18N

        jlPlayer3Head1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jlPlayer3Head1.setText("Player Three");

        jtfPlayerTurnName.setEditable(false);
        jtfPlayerTurnName.setBackground(new java.awt.Color(255, 255, 255));
        jtfPlayerTurnName.setFont(new java.awt.Font("David", 0, 30)); // NOI18N

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addComponent(jpTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(455, 455, 455))
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBodyLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jlSubtitle))
                    .addGroup(jpBodyLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtlPlayerTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfPlayer1Bank)
                                .addComponent(jlPlayer1Head, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addComponent(jtfPlayer1Name)))
                        .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpBodyLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbTakeTurn)
                                    .addComponent(jbQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpBodyLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfPlayerTurnName, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpBodyLayout.createSequentialGroup()
                                        .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jlPlayer2Head, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                            .addComponent(jtfPlayer2Name)
                                            .addComponent(jtfPlayer2Bank, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(70, 70, 70)
                                        .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jlPlayer3Head1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtfPlayer3Name)
                                            .addComponent(jtfPlayer3Bank))))))))
                .addGap(79, 100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBodyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addComponent(jpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jlSubtitle)
                .addGap(48, 48, 48)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPlayer1Head, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPlayer2Head, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPlayer3Head1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPlayer3Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPlayer2Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPlayer1Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPlayer1Bank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPlayer3Bank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPlayer2Bank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtlPlayerTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPlayerTurnName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jbTakeTurn)
                .addGap(18, 18, 18)
                .addComponent(jbHelp)
                .addGap(18, 18, 18)
                .addComponent(jbQuit)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbTakeTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTakeTurnActionPerformed
        gameTurn.jtfPhraseDisplay.setText(WordsAndPhrases.updateAndTranslateParallelArrayToString());
        gameTurn.jtfPlayerTurnDisplay.setText(playerTurn.updatePlayersTurn());
        game.updateAllBank();
        gameTurn.jtfBankDisplay.setText("$ " + game.displayPlayerUpBank());
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    gameTurn.setVisible(true);
                }
            });
        } finally {
            if (gameTurn != null) {
                gameTurn.dispose();
            }
        }
        this.dispose();
        
    }//GEN-LAST:event_jbTakeTurnActionPerformed

    private void jbHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHelpActionPerformed
        mainMenuControl.startHelpMenu();
    }//GEN-LAST:event_jbHelpActionPerformed

    private void jbQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jbQuitActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbHelp;
    private javax.swing.JButton jbQuit;
    private javax.swing.JButton jbTakeTurn;
    private javax.swing.JLabel jlPlayer1Head;
    private javax.swing.JLabel jlPlayer2Head;
    private javax.swing.JLabel jlPlayer3Head1;
    private javax.swing.JLabel jlSubtitle;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpTitle;
    public javax.swing.JTextField jtfPlayer1Bank;
    public javax.swing.JTextField jtfPlayer1Name;
    public javax.swing.JTextField jtfPlayer2Bank;
    public javax.swing.JTextField jtfPlayer2Name;
    public javax.swing.JTextField jtfPlayer3Bank;
    public javax.swing.JTextField jtfPlayer3Name;
    public javax.swing.JTextField jtfPlayerTurnName;
    private javax.swing.JLabel jtlPlayerTurn;
    // End of variables declaration//GEN-END:variables
}
