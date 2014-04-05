/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.frames;

import RfortuneTeam.HeatherandLaura.allMenuViews.GamePreferencesView;
import RfortuneTeam.HeatherandLaura.allMenuViews.HelpMenuView;
import RfortuneTeam.HeatherandLaura.allMenuViews.MainMenuView;
import RfortuneTeam.HeatherandLaura.control.MainMenuControl;
import rfortune.Player;
import rfortune.PlayersList;


/**
 *
 * @author Laura
 */
public class MainFrame extends javax.swing.JFrame {
    
    PlayersList myList = new PlayersList();
    MainMenuControl mainMenuControl = new MainMenuControl();
    Player myPlayers = new Player();
    HelpMenuView helpMenuView = new HelpMenuView();
    GamePreferencesView myPrefs = new GamePreferencesView();
    MainMenuView mainMenuView = new MainMenuView();
    

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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
        jlTitle = new javax.swing.JLabel();
        jpMenuItems = new javax.swing.JPanel();
        jbStartGame = new javax.swing.JButton();
        jbPreferences = new javax.swing.JButton();
        jbtnHelp = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jtWelcome = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rectangle of Fortune");

        jpBody.setBackground(new java.awt.Color(0, 102, 102));
        jpBody.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jpTitle.setBackground(new java.awt.Color(0, 102, 102));

        jlTitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 36)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(153, 153, 153));
        jlTitle.setText("Rectangle of Fortune");

        jpMenuItems.setBackground(new java.awt.Color(0, 102, 102));
        jpMenuItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));

        jbStartGame.setBackground(new java.awt.Color(153, 153, 153));
        jbStartGame.setFont(new java.awt.Font("Dotum", 0, 12)); // NOI18N
        jbStartGame.setForeground(new java.awt.Color(51, 51, 51));
        jbStartGame.setText("Start Game");
        jbStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbStartGameActionPerformed(evt);
            }
        });

        jbPreferences.setBackground(new java.awt.Color(153, 153, 153));
        jbPreferences.setFont(new java.awt.Font("Dotum", 0, 11)); // NOI18N
        jbPreferences.setForeground(new java.awt.Color(51, 51, 51));
        jbPreferences.setText("Change Game Preferences");
        jbPreferences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPreferencesActionPerformed(evt);
            }
        });

        jbtnHelp.setBackground(new java.awt.Color(153, 153, 153));
        jbtnHelp.setFont(new java.awt.Font("Dotum", 0, 12)); // NOI18N
        jbtnHelp.setForeground(new java.awt.Color(51, 51, 51));
        jbtnHelp.setText("Help");
        jbtnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHelpActionPerformed(evt);
            }
        });

        jbtnExit.setBackground(new java.awt.Color(153, 153, 153));
        jbtnExit.setFont(new java.awt.Font("Dotum", 0, 11)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(51, 51, 51));
        jbtnExit.setText("Exit Rectangle of Fortune");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuItemsLayout = new javax.swing.GroupLayout(jpMenuItems);
        jpMenuItems.setLayout(jpMenuItemsLayout);
        jpMenuItemsLayout.setHorizontalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuItemsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuItemsLayout.createSequentialGroup()
                        .addComponent(jbStartGame)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuItemsLayout.createSequentialGroup()
                        .addComponent(jbtnExit)
                        .addContainerGap())))
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addGroup(jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMenuItemsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbPreferences))
                    .addGroup(jpMenuItemsLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jbtnHelp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMenuItemsLayout.setVerticalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbStartGame)
                .addGap(18, 18, 18)
                .addComponent(jbPreferences)
                .addGap(18, 18, 18)
                .addComponent(jbtnHelp)
                .addGap(18, 18, 18)
                .addComponent(jbtnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Leelawadee", 0, 13)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to the Rectangle of Fortune Game. The object of the game is to earn the most money by the end of the game. The game ends when the entire phrase is guessed correctly.  Good Luck! ");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jtWelcome.setViewportView(jTextArea1);

        javax.swing.GroupLayout jpTitleLayout = new javax.swing.GroupLayout(jpTitle);
        jpTitle.setLayout(jpTitleLayout);
        jpTitleLayout.setHorizontalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitle)
                .addGap(82, 82, 82))
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jpTitleLayout.setVerticalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleLayout.createSequentialGroup()
                .addComponent(jlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addGroup(jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpMenuItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtWelcome))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addComponent(jpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBody, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbStartGameActionPerformed
        // TODO add your handling code here: return 1;
        mainMenuView.initiate();
        this.dispose();
    }//GEN-LAST:event_jbStartGameActionPerformed

    private void jbPreferencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPreferencesActionPerformed
        // TODO add your handling code here: (**Game Preferences View**)
    }//GEN-LAST:event_jbPreferencesActionPerformed

    private void jbtnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHelpActionPerformed
        // TODO add your handling code here: (**Help Menu View**)
    }//GEN-LAST:event_jbtnHelpActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnExitActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbPreferences;
    private javax.swing.JButton jbStartGame;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnHelp;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpMenuItems;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JScrollPane jtWelcome;
    // End of variables declaration//GEN-END:variables
}
