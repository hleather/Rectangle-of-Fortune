/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.frames;

import RfortuneTeam.HeatherandLaura.control.MainMenuControl;
import rfortune.Player;
import rfortune.PlayerTurn;
import rfortune.PlayersList;
import rfortune.WordsAndPhrases;

/**
 *
 * @author Laura
 */
public class EnterPlayerNames extends javax.swing.JFrame {
    
    MainMenuControl mainMenuControl = new MainMenuControl();
    PlayersList playersList = new PlayersList();
    PlayerTurn playerTurn = new PlayerTurn();
    WordsAndPhrases wordsAndPhrases = new WordsAndPhrases();

    /**
     * Creates new form EnterPlayerNames
     */
    public EnterPlayerNames() {
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcb1PlayerG = new javax.swing.JCheckBox();
        jcb2PlayerG = new javax.swing.JCheckBox();
        jcb3PlayerG = new javax.swing.JCheckBox();
        jtfPlayer1 = new javax.swing.JTextField();
        jtfPlayer2 = new javax.swing.JTextField();
        jtfPlayer3 = new javax.swing.JTextField();
        jbValidate1 = new javax.swing.JButton();
        jbValidate2 = new javax.swing.JButton();
        jbValidate3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbContinuePlayerNames = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enter Player Names");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Player Names");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel2.setText("First select appropriate box:");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel3.setText("Then validate each name before clicking Continue ");

        jcb1PlayerG.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jcb1PlayerG);
        jcb1PlayerG.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jcb1PlayerG.setText("1 Player Game");
        jcb1PlayerG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb1PlayerGActionPerformed(evt);
            }
        });

        jcb2PlayerG.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jcb2PlayerG);
        jcb2PlayerG.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jcb2PlayerG.setText("2 Player Game");
        jcb2PlayerG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb2PlayerGActionPerformed(evt);
            }
        });

        jcb3PlayerG.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jcb3PlayerG);
        jcb3PlayerG.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jcb3PlayerG.setText("3 Player Game");
        jcb3PlayerG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb3PlayerGActionPerformed(evt);
            }
        });

        jbValidate1.setBackground(new java.awt.Color(153, 153, 153));
        jbValidate1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbValidate1.setText("Validate");
        jbValidate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbValidate1ActionPerformed(evt);
            }
        });

        jbValidate2.setBackground(new java.awt.Color(153, 153, 153));
        jbValidate2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbValidate2.setText("Validate");
        jbValidate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbValidate2ActionPerformed(evt);
            }
        });

        jbValidate3.setBackground(new java.awt.Color(153, 153, 153));
        jbValidate3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbValidate3.setText("Validate");
        jbValidate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbValidate3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel4.setText("Players Name");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel5.setText("Players Name");

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel6.setText("Players Name");

        jbContinuePlayerNames.setBackground(new java.awt.Color(153, 153, 153));
        jbContinuePlayerNames.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbContinuePlayerNames.setText("Continue");
        jbContinuePlayerNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContinuePlayerNamesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jcb1PlayerG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jcb3PlayerG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jcb2PlayerG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbContinuePlayerNames, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbValidate1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbValidate2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbValidate3, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel3))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb1PlayerG)
                    .addComponent(jtfPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbValidate1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb2PlayerG)
                    .addComponent(jtfPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbValidate2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcb3PlayerG)
                        .addComponent(jtfPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbValidate3))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jbContinuePlayerNames)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb1PlayerGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb1PlayerGActionPerformed
        mainMenuControl.setNumPlayers(1);
    }//GEN-LAST:event_jcb1PlayerGActionPerformed

    private void jcb2PlayerGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb2PlayerGActionPerformed
        mainMenuControl.setNumPlayers(2);
    }//GEN-LAST:event_jcb2PlayerGActionPerformed

    private void jcb3PlayerGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb3PlayerGActionPerformed
        mainMenuControl.setNumPlayers(3);
    }//GEN-LAST:event_jcb3PlayerGActionPerformed

    private void jbValidate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbValidate1ActionPerformed
        String playerO = jtfPlayer1.getText();
        String player1 = playerO.trim();
        playersList.checkInput(player1);
        Player.setPlayer1(player1);
    }//GEN-LAST:event_jbValidate1ActionPerformed

    private void jbValidate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbValidate2ActionPerformed
        String playerW = jtfPlayer2.getText();
        String player2 = playerW.trim();
        playersList.checkInput(player2);
        Player.setPlayer2(player2);
    }//GEN-LAST:event_jbValidate2ActionPerformed

    private void jbValidate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbValidate3ActionPerformed
        String playerH = jtfPlayer3.getText();
        String player3 = playerH.trim();
        playersList.checkInput(player3);
        Player.setPlayer3(player3);
    }//GEN-LAST:event_jbValidate3ActionPerformed

    private void jbContinuePlayerNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContinuePlayerNamesActionPerformed
        mainMenuControl.setScreen();
        WordsAndPhrases.setPhrases();
        mainMenuControl.startGameMenu();
    }//GEN-LAST:event_jbContinuePlayerNamesActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbContinuePlayerNames;
    private javax.swing.JButton jbValidate1;
    private javax.swing.JButton jbValidate2;
    private javax.swing.JButton jbValidate3;
    private javax.swing.JCheckBox jcb1PlayerG;
    private javax.swing.JCheckBox jcb2PlayerG;
    private javax.swing.JCheckBox jcb3PlayerG;
    private javax.swing.JTextField jtfPlayer1;
    private javax.swing.JTextField jtfPlayer2;
    private javax.swing.JTextField jtfPlayer3;
    // End of variables declaration//GEN-END:variables
}
