/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.frames;

import RfortuneTeam.HeatherandLaura.control.MainMenuControl;

/**
 *
 * @author Laura
 */
public class GameTurn extends javax.swing.JFrame {
    MainMenuControl mainMenuControl = new MainMenuControl();

    /**
     * Creates new form GameTurn
     */
    public GameTurn() {
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

        jDialog1 = new javax.swing.JDialog();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfPlayerTurnDisplay = new javax.swing.JTextField();
        jtfBankDisplay = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jtfPhraseDisplay = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jtfGuessVowel = new javax.swing.JTextField();
        jbSubmitLetterGuess = new javax.swing.JButton();
        jtfGuessLetter = new javax.swing.JTextField();
        jtfGuessPhrase = new javax.swing.JTextField();
        jbSubmitPhraseGuess = new javax.swing.JButton();
        jbSubmitVowelGuess = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbHelp = new javax.swing.JButton();
        jbQuit = new javax.swing.JButton();
        jbSpin = new javax.swing.JButton();
        jtfSpinWorth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setFont(new java.awt.Font("David", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rectangle of Fortune");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 5));

        jLabel3.setFont(new java.awt.Font("David", 0, 18)); // NOI18N
        jLabel3.setText("Player Turn:");

        jLabel4.setFont(new java.awt.Font("David", 0, 18)); // NOI18N
        jLabel4.setText("Bank:");

        jtfPlayerTurnDisplay.setEditable(false);
        jtfPlayerTurnDisplay.setBackground(new java.awt.Color(0, 153, 153));
        jtfPlayerTurnDisplay.setFont(new java.awt.Font("David", 0, 30)); // NOI18N
        jtfPlayerTurnDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtfBankDisplay.setEditable(false);
        jtfBankDisplay.setBackground(new java.awt.Color(0, 153, 153));
        jtfBankDisplay.setFont(new java.awt.Font("David", 0, 30)); // NOI18N
        jtfBankDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jInternalFrame1.setBackground(new java.awt.Color(0, 153, 204));
        jInternalFrame1.setBorder(null);
        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setFont(new java.awt.Font("David", 0, 18)); // NOI18N
        jInternalFrame1.setVisible(false);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jtfPhraseDisplay.setEditable(false);
        jtfPhraseDisplay.setBackground(new java.awt.Color(0, 153, 153));
        jtfPhraseDisplay.setFont(new java.awt.Font("David", 0, 60)); // NOI18N
        jtfPhraseDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfPhraseDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setFont(new java.awt.Font("David", 0, 18)); // NOI18N

        jRadioButton1.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("David", 0, 18)); // NOI18N
        jRadioButton1.setText("Guess a letter");

        jRadioButton2.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("David", 0, 18)); // NOI18N
        jRadioButton2.setText("Buy a vowel");

        jRadioButton3.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("David", 0, 18)); // NOI18N
        jRadioButton3.setText("Guess the phrase");

        jtfGuessVowel.setFont(new java.awt.Font("David", 0, 14)); // NOI18N

        jbSubmitLetterGuess.setFont(new java.awt.Font("David", 0, 14)); // NOI18N
        jbSubmitLetterGuess.setText("Submit");
        jbSubmitLetterGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubmitLetterGuessActionPerformed(evt);
            }
        });

        jtfGuessLetter.setFont(new java.awt.Font("David", 0, 14)); // NOI18N

        jtfGuessPhrase.setFont(new java.awt.Font("David", 0, 14)); // NOI18N

        jbSubmitPhraseGuess.setFont(new java.awt.Font("David", 0, 14)); // NOI18N
        jbSubmitPhraseGuess.setText("Submit");
        jbSubmitPhraseGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubmitPhraseGuessActionPerformed(evt);
            }
        });

        jbSubmitVowelGuess.setFont(new java.awt.Font("David", 0, 14)); // NOI18N
        jbSubmitVowelGuess.setText("Submit");
        jbSubmitVowelGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubmitVowelGuessActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("David", 0, 11)); // NOI18N
        jLabel2.setText("(Costs 250)");

        jbHelp.setFont(new java.awt.Font("David", 0, 18)); // NOI18N
        jbHelp.setText("Help");
        jbHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHelpActionPerformed(evt);
            }
        });

        jbQuit.setFont(new java.awt.Font("David", 0, 18)); // NOI18N
        jbQuit.setText("Quit");
        jbQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jtfGuessPhrase, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSubmitPhraseGuess))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButton2)))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfGuessLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfGuessVowel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbSubmitVowelGuess, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbSubmitLetterGuess)))
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbQuit)
                    .addComponent(jbHelp))
                .addGap(319, 319, 319))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfGuessLetter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbSubmitLetterGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton1)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfGuessVowel)
                    .addComponent(jbSubmitVowelGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfGuessPhrase)
                    .addComponent(jbSubmitPhraseGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbHelp)
                .addGap(18, 18, 18)
                .addComponent(jbQuit)
                .addGap(18, 18, 18))
        );

        jbSpin.setBackground(new java.awt.Color(255, 255, 51));
        jbSpin.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        jbSpin.setText("SPIN");
        jbSpin.setBorderPainted(false);

        jtfSpinWorth.setEditable(false);
        jtfSpinWorth.setBackground(new java.awt.Color(0, 153, 153));
        jtfSpinWorth.setFont(new java.awt.Font("David", 0, 24)); // NOI18N
        jtfSpinWorth.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("David", 0, 21)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Spin Worth:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfPhraseDisplay)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtfPlayerTurnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(jtfBankDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbSpin, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jtfSpinWorth))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfPhraseDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfPlayerTurnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jtfBankDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(jbSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSpinWorth, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHelpActionPerformed
        mainMenuControl.startHelpMenu();
    }//GEN-LAST:event_jbHelpActionPerformed

    private void jbQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitActionPerformed
       this.dispose();
    }//GEN-LAST:event_jbQuitActionPerformed

    private void jbSubmitLetterGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubmitLetterGuessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSubmitLetterGuessActionPerformed

    private void jbSubmitVowelGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubmitVowelGuessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSubmitVowelGuessActionPerformed

    private void jbSubmitPhraseGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubmitPhraseGuessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSubmitPhraseGuessActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JButton jbHelp;
    private javax.swing.JButton jbQuit;
    private javax.swing.JButton jbSpin;
    private javax.swing.JButton jbSubmitLetterGuess;
    private javax.swing.JButton jbSubmitPhraseGuess;
    private javax.swing.JButton jbSubmitVowelGuess;
    public javax.swing.JTextField jtfBankDisplay;
    private javax.swing.JTextField jtfGuessLetter;
    private javax.swing.JTextField jtfGuessPhrase;
    private javax.swing.JTextField jtfGuessVowel;
    public javax.swing.JTextField jtfPhraseDisplay;
    public javax.swing.JTextField jtfPlayerTurnDisplay;
    public javax.swing.JTextField jtfSpinWorth;
    // End of variables declaration//GEN-END:variables
}
