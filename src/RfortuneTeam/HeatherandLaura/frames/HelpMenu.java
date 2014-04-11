/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RfortuneTeam.HeatherandLaura.frames;
import RfortuneTeam.HeatherandLaura.allMenuViews.HelpMenuView;
import RfortuneTeam.HeatherandLaura.allMenuViews.HelpMenuView.displayCommand;
/**
 *
 * @author Laura
 */
public class HelpMenu extends javax.swing.JFrame {
    HelpMenuView helpMenuView = new HelpMenuView();

    /**
     * Creates new form HelpMenu
     */
    public HelpMenu() {
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
        jlSubtitle = new javax.swing.JLabel();
        jpBorder = new javax.swing.JPanel();
        jbObjective = new javax.swing.JButton();
        jbBoard = new javax.swing.JButton();
        jbPlayer = new javax.swing.JButton();
        jbVowel = new javax.swing.JButton();
        jbGuess = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDisplayHelp = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help Menu");

        jpBody.setBackground(new java.awt.Color(0, 102, 102));

        jpTitle.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jpTitleLayout = new javax.swing.GroupLayout(jpTitle);
        jpTitle.setLayout(jpTitleLayout);
        jpTitleLayout.setHorizontalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
        );
        jpTitleLayout.setVerticalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        jlTitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 36)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(153, 153, 153));
        jlTitle.setText("Rectangle of Fortune");

        jlSubtitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jlSubtitle.setForeground(new java.awt.Color(153, 153, 153));
        jlSubtitle.setText("Help Menu");

        jpBorder.setBackground(new java.awt.Color(0, 102, 102));
        jpBorder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));

        jbObjective.setBackground(new java.awt.Color(153, 153, 153));
        jbObjective.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbObjective.setText("Rectangle of Fortune Game");
        jbObjective.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbObjectiveActionPerformed(evt);
            }
        });

        jbBoard.setBackground(new java.awt.Color(153, 153, 153));
        jbBoard.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbBoard.setText("The Board");
        jbBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBoardActionPerformed(evt);
            }
        });

        jbPlayer.setBackground(new java.awt.Color(153, 153, 153));
        jbPlayer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbPlayer.setText("The Players");
        jbPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlayerActionPerformed(evt);
            }
        });

        jbVowel.setBackground(new java.awt.Color(153, 153, 153));
        jbVowel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbVowel.setText("Buying a Vowel");
        jbVowel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVowelActionPerformed(evt);
            }
        });

        jbGuess.setBackground(new java.awt.Color(153, 153, 153));
        jbGuess.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbGuess.setText("Making a Guess");
        jbGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuessActionPerformed(evt);
            }
        });

        jbClose.setBackground(new java.awt.Color(153, 153, 153));
        jbClose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbClose.setText("Back");
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBorderLayout = new javax.swing.GroupLayout(jpBorder);
        jpBorder.setLayout(jpBorderLayout);
        jpBorderLayout.setHorizontalGroup(
            jpBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBorderLayout.createSequentialGroup()
                .addGroup(jpBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBorderLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbVowel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbObjective)))
                    .addGroup(jpBorderLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jbClose)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jpBorderLayout.setVerticalGroup(
            jpBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBorderLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jbObjective)
                .addGap(18, 18, 18)
                .addComponent(jbBoard)
                .addGap(18, 18, 18)
                .addComponent(jbPlayer)
                .addGap(18, 18, 18)
                .addComponent(jbVowel)
                .addGap(18, 18, 18)
                .addComponent(jbGuess)
                .addGap(18, 18, 18)
                .addComponent(jbClose)
                .addGap(19, 19, 19))
        );

        jtaDisplayHelp.setEditable(false);
        jtaDisplayHelp.setBackground(new java.awt.Color(153, 153, 153));
        jtaDisplayHelp.setColumns(20);
        jtaDisplayHelp.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jtaDisplayHelp.setLineWrap(true);
        jtaDisplayHelp.setRows(5);
        jtaDisplayHelp.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtaDisplayHelp);

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBodyLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jlSubtitle)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jpTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jpBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlSubtitle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(39, 39, 39))
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
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbObjectiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbObjectiveActionPerformed
        this.jtaDisplayHelp.setText(displayCommand.GAMEHELP.display());
    }//GEN-LAST:event_jbObjectiveActionPerformed

    private void jbBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBoardActionPerformed
        this.jtaDisplayHelp.setText(displayCommand.BOARDHELP.display());
    }//GEN-LAST:event_jbBoardActionPerformed

    private void jbPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlayerActionPerformed
        this.jtaDisplayHelp.setText(displayCommand.PLAYERHELP.display());
    }//GEN-LAST:event_jbPlayerActionPerformed

    private void jbVowelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVowelActionPerformed
        this.jtaDisplayHelp.setText(displayCommand.VOWELHELP.display());
    }//GEN-LAST:event_jbVowelActionPerformed

    private void jbGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuessActionPerformed
        this.jtaDisplayHelp.setText(displayCommand.GUESSHELP.display());
    }//GEN-LAST:event_jbGuessActionPerformed

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCloseActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbBoard;
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbGuess;
    private javax.swing.JButton jbObjective;
    private javax.swing.JButton jbPlayer;
    private javax.swing.JButton jbVowel;
    private javax.swing.JLabel jlSubtitle;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpBorder;
    private javax.swing.JPanel jpTitle;
    public javax.swing.JTextArea jtaDisplayHelp;
    // End of variables declaration//GEN-END:variables
}
