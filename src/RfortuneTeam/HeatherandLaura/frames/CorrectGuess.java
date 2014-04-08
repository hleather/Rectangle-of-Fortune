/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RfortuneTeam.HeatherandLaura.frames;

import rfortune.Game;
import rfortune.PlayerTurn;
import rfortune.WordsAndPhrases;

/**
 *
 * @author Heather
 */
public class CorrectGuess extends javax.swing.JFrame {

    static GameTurn gameTurn = new GameTurn();
    Game game = new Game();
    PlayerTurn playerTurn = new PlayerTurn();

    /**
     * Creates new form CorrectGuess
     */
    public CorrectGuess() {
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

        jPanel1 = new javax.swing.JPanel();
        jlCongrats = new javax.swing.JLabel();
        jtfCorrectGuess = new javax.swing.JTextField();
        jtfCorrectMessage = new javax.swing.JTextField();
        jbCorrectContinue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));

        jlCongrats.setBackground(new java.awt.Color(0, 255, 153));
        jlCongrats.setFont(new java.awt.Font("David", 0, 36)); // NOI18N
        jlCongrats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCongrats.setText("CONGRATULATIONS");

        jtfCorrectGuess.setEditable(false);
        jtfCorrectGuess.setBackground(new java.awt.Color(0, 255, 153));
        jtfCorrectGuess.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        jtfCorrectGuess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfCorrectGuess.setBorder(null);

        jtfCorrectMessage.setEditable(false);
        jtfCorrectMessage.setBackground(new java.awt.Color(0, 255, 153));
        jtfCorrectMessage.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        jtfCorrectMessage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfCorrectMessage.setText("is in the Phrase");

        jbCorrectContinue.setFont(new java.awt.Font("David", 0, 18)); // NOI18N
        jbCorrectContinue.setText("Continue");
        jbCorrectContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCorrectContinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlCongrats, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCorrectGuess)
                    .addComponent(jtfCorrectMessage))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jbCorrectContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlCongrats, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfCorrectGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCorrectMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCorrectContinue)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCorrectContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCorrectContinueActionPerformed
        Game.setRoundNumber(Game.getRoundNumber() + 1);
        Game.gameRound();
        gameTurn.jtfPhraseDisplay.setText(WordsAndPhrases.updateAndTranslateParallelArrayToString());
        gameTurn.jtfPlayerTurnDisplay.setText(playerTurn.updatePlayersTurn());
        game.updateAllBank();
        gameTurn.jtfBankDisplay.setText(game.displayPlayerUpBank());
        GameTurn.controlSpin = 0;
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
    }//GEN-LAST:event_jbCorrectContinueActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel jPanel1;
    public javax.swing.JButton jbCorrectContinue;
    public javax.swing.JLabel jlCongrats;
    public javax.swing.JTextField jtfCorrectGuess;
    public javax.swing.JTextField jtfCorrectMessage;
    // End of variables declaration//GEN-END:variables
}
