/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RfortuneTeam.HeatherandLaura.frames;

import RfortuneTeam.HeatherandLaura.control.MainMenuControl;
import rfortune.PlayersList;
import rfortune.Rfortune;

/**
 *
 * @author Heather
 */
public class EndMessage extends javax.swing.JFrame {

    static EnterPlayerNames enterPlayerNames = new EnterPlayerNames();
    PlayersList playersList = new PlayersList();
    MainMenuControl mainMenuControl = new MainMenuControl();

    public EndMessage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfMessage = new javax.swing.JTextField();
        jtfName = new javax.swing.JTextField();
        jtfPlayer1 = new javax.swing.JTextField();
        jtfPlayer2 = new javax.swing.JTextField();
        jtfPlayer3 = new javax.swing.JTextField();
        jtfBank1 = new javax.swing.JTextField();
        jtfBank2 = new javax.swing.JTextField();
        jtfBank3 = new javax.swing.JTextField();
        jbNewGame = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 5));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RECTANGLE OF FORTUNE");

        jtfMessage.setEditable(false);
        jtfMessage.setBackground(new java.awt.Color(0, 102, 102));
        jtfMessage.setFont(new java.awt.Font("Lucida Sans", 0, 48)); // NOI18N
        jtfMessage.setForeground(new java.awt.Color(0, 153, 153));
        jtfMessage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfMessage.setBorder(null);

        jtfName.setEditable(false);
        jtfName.setBackground(new java.awt.Color(0, 102, 102));
        jtfName.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        jtfName.setForeground(new java.awt.Color(0, 153, 153));
        jtfName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfName.setBorder(null);

        jtfPlayer1.setEditable(false);
        jtfPlayer1.setBackground(new java.awt.Color(0, 102, 102));
        jtfPlayer1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jtfPlayer1.setForeground(new java.awt.Color(153, 153, 153));
        jtfPlayer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfPlayer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jtfPlayer2.setEditable(false);
        jtfPlayer2.setBackground(new java.awt.Color(0, 102, 102));
        jtfPlayer2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jtfPlayer2.setForeground(new java.awt.Color(153, 153, 153));
        jtfPlayer2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfPlayer2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jtfPlayer3.setEditable(false);
        jtfPlayer3.setBackground(new java.awt.Color(0, 102, 102));
        jtfPlayer3.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jtfPlayer3.setForeground(new java.awt.Color(153, 153, 153));
        jtfPlayer3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfPlayer3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jtfBank1.setEditable(false);
        jtfBank1.setBackground(new java.awt.Color(0, 102, 102));
        jtfBank1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jtfBank1.setForeground(new java.awt.Color(153, 153, 153));
        jtfBank1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfBank1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jtfBank2.setEditable(false);
        jtfBank2.setBackground(new java.awt.Color(0, 102, 102));
        jtfBank2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jtfBank2.setForeground(new java.awt.Color(153, 153, 153));
        jtfBank2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfBank2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jtfBank3.setEditable(false);
        jtfBank3.setBackground(new java.awt.Color(0, 102, 102));
        jtfBank3.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jtfBank3.setForeground(new java.awt.Color(153, 153, 153));
        jtfBank3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfBank3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jbNewGame.setBackground(new java.awt.Color(153, 153, 153));
        jbNewGame.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jbNewGame.setText("New Game");
        jbNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNewGameActionPerformed(evt);
            }
        });

        jbExit.setBackground(new java.awt.Color(153, 153, 153));
        jbExit.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jbExit.setText("Exit");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtfMessage)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfName)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfBank1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfBank2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtfBank3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtfPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbExit)
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbNewGame)
                        .addGap(254, 254, 254))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPlayer3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfBank1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBank2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBank3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jbNewGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbExit)
                .addGap(0, 29, Short.MAX_VALUE))
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

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        mainMenuControl.exitGame();
    }//GEN-LAST:event_jbExitActionPerformed

    private void jbNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewGameActionPerformed
        playersList.resetList();
        new Rfortune().newGame();
        this.dispose();
    }//GEN-LAST:event_jbNewGameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JSlider jSlider1;
    public javax.swing.JButton jbExit;
    public javax.swing.JButton jbNewGame;
    public javax.swing.JTextField jtfBank1;
    public javax.swing.JTextField jtfBank2;
    public javax.swing.JTextField jtfBank3;
    public javax.swing.JTextField jtfMessage;
    public javax.swing.JTextField jtfName;
    public javax.swing.JTextField jtfPlayer1;
    public javax.swing.JTextField jtfPlayer2;
    public javax.swing.JTextField jtfPlayer3;
    // End of variables declaration//GEN-END:variables
}
