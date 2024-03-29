/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConnectFourStatFrame.java
 *
 * Created on Nov 23, 2011, 12:08:15 PM
 */
package connectfour;

/**
 *
 * @author Jorge
 */
public class ConnectFourStatFrame extends javax.swing.JFrame {
    static ConnectFourFrame currentGame;
    /** Creates new form ConnectFourStatFrame */
    public ConnectFourStatFrame(ConnectFourFrame game) {
        currentGame = game;
//        //setGameCount("1");
//        setP1AvgMoves("0");
//        setP2AvgMoves("0");
//        setP1MoveCount("0");
//        setP2MoveCount("0");
//        setP1WinCount("0");
//        setP2WinCount("0");
        initComponents();
    }
    
    public void setP1MoveCount(String count){
        lblP1MoveCount.setText(count);
    }
    public void setP2MoveCount(String count){
        lblP2MoveCount.setText(count);
    }
    public void setGameCount(String gamecount){
        lblGameCount.setText(gamecount);
    }
//    public String getStringGameCount(){
//        
//    }
    public int getGameCount(){
        return Integer.parseInt(lblGameCount.getText());
    }
    public void setP1AvgMoves(String avg){
        lblP1AvgMoves.setText(avg);
    }
    public void setP2AvgMoves(String avg){
        lblP2AvgMoves.setText(avg);
    }
    public void setP1WinCount(String wins){
        lblP1Wins.setText(wins);
    }
    public void setP2WinCount(String wins){
        lblP2Wins.setText(wins);
    }
    public void setWinnerLabel(String winner){
        lblWinner.setText(winner);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblP1Wins = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblP1AvgMoves = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblP2Wins = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblP2AvgMoves = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        lblWinner = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblGameCount = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblP1MoveCount = new javax.swing.JLabel();
        lblP2MoveCount = new javax.swing.JLabel();
        btnReplay = new javax.swing.JButton();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Player 1 Stats", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setText("Total Wins");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 23, -1, 24));

        lblP1Wins.setText("0         ");
        jPanel1.add(lblP1Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 29, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel5.setText("Moves/Game");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 53, -1, 24));

        lblP1AvgMoves.setText("0         ");
        jPanel1.add(lblP1AvgMoves, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 59, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 213, 94));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Player 2 Stats", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setText("Total Wins");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 23, -1, 24));

        lblP2Wins.setText("0         ");
        jPanel2.add(lblP2Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 29, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel6.setText("Moves/Game");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 53, -1, 24));

        lblP2AvgMoves.setText("0         ");
        jPanel2.add(lblP2AvgMoves, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 59, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 11, 213, 94));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 272, 136, -1));

        lblWinner.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWinner.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Winner", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14))); // NOI18N
        getContentPane().add(lblWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 188, 444, 78));

        btnExit.setText("Exit");
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 272, 136, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("Game Count");

        lblGameCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGameCount.setText("1");

        jLabel13.setText("P1 Move Count");

        jLabel14.setText("P2 Move Count");

        lblP1MoveCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP1MoveCount.setText("0");

        lblP2MoveCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblP2MoveCount.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblGameCount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(lblP1MoveCount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(lblP2MoveCount, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel14)
                        .addGap(34, 34, 34))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblP2MoveCount, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGameCount)
                    .addComponent(lblP1MoveCount))
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, 440, 70));

        btnReplay.setText("Play Again");
        btnReplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplayActionPerformed(evt);
            }
        });
        getContentPane().add(btnReplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 272, 136, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i<currentGame.pnlArray.length; i++){
            for(int j=0; j<currentGame.pnlArray[0].length; j++){
                currentGame.pnlArray[i][j].setColor('w');
                currentGame.pnlArray[i][j].setCounter(5);
            }
        }
        currentGame.setP1Count(0);
        currentGame.setP2Count(0);
        currentGame.setWinner(false);
        currentGame.repaint();
        setP1MoveCount("0");
        setP2MoveCount("0");
        setWinnerLabel("");
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnReplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplayActionPerformed
        // TODO add your handling code here:
        int count = getGameCount();
        count++;
        setGameCount(String.valueOf(count));
        btnReset.doClick();
    }//GEN-LAST:event_btnReplayActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConnectFourStatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectFourStatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectFourStatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectFourStatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ConnectFourStatFrame(currentGame).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReplay;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblGameCount;
    private javax.swing.JLabel lblP1AvgMoves;
    private javax.swing.JLabel lblP1MoveCount;
    private javax.swing.JLabel lblP1Wins;
    private javax.swing.JLabel lblP2AvgMoves;
    private javax.swing.JLabel lblP2MoveCount;
    private javax.swing.JLabel lblP2Wins;
    private javax.swing.JLabel lblWinner;
    // End of variables declaration//GEN-END:variables
}
