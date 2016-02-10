package edu.hdsb.gwss.arian;

/* Name: EasterComes
 * Version: v1
 * Date: February 10 2016
 * Author: Arian Krasniqi
 */
public class EasterComes extends javax.swing.JFrame {

    public EasterComes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        easterComesTitleLabel = new javax.swing.JLabel();
        userInfroLabel = new javax.swing.JLabel();
        enterYearLabel = new javax.swing.JLabel();
        userYearChoiceTextField = new javax.swing.JTextField();
        userYearCHoiceConfirmationButton = new javax.swing.JButton();
        easterIsOnLabel = new javax.swing.JLabel();
        easterFinalDateCalculatedLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(570, 399));
        setMinimumSize(new java.awt.Dimension(570, 399));
        setPreferredSize(new java.awt.Dimension(570, 399));
        getContentPane().setLayout(null);

        easterComesTitleLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        easterComesTitleLabel.setForeground(new java.awt.Color(0, 255, 255));
        easterComesTitleLabel.setText("Easter Comes!");
        getContentPane().add(easterComesTitleLabel);
        easterComesTitleLabel.setBounds(210, 30, 141, 28);

        userInfroLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userInfroLabel.setText("This program will calculate the month and day of easter when given the year");
        getContentPane().add(userInfroLabel);
        userInfroLabel.setBounds(50, 70, 434, 17);

        enterYearLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        enterYearLabel.setText("Enter Year:");
        getContentPane().add(enterYearLabel);
        enterYearLabel.setBounds(160, 120, 63, 17);

        userYearChoiceTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(userYearChoiceTextField);
        userYearChoiceTextField.setBounds(280, 120, 73, 23);

        userYearCHoiceConfirmationButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userYearCHoiceConfirmationButton.setText("Enter");
        userYearCHoiceConfirmationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userYearCHoiceConfirmationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(userYearCHoiceConfirmationButton);
        userYearCHoiceConfirmationButton.setBounds(370, 120, 63, 25);

        easterIsOnLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        easterIsOnLabel.setText("Easter will be on...");
        getContentPane().add(easterIsOnLabel);
        easterIsOnLabel.setBounds(160, 170, 106, 17);

        easterFinalDateCalculatedLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        easterFinalDateCalculatedLabel.setText("???");
        getContentPane().add(easterFinalDateCalculatedLabel);
        easterFinalDateCalculatedLabel.setBounds(300, 170, 18, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\MyPortfolio\\ICS4U\\easter_background_04.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, 0, 580, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userYearCHoiceConfirmationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userYearCHoiceConfirmationButtonActionPerformed
        // TODO add your handling code here:
        int year = Integer.parseInt(userYearChoiceTextField.getText());

        if (year < 0) {

            System.err.println("Invalid Year");
        }

        if (year >= 0) {

            int a = year % 19;

            int b = year / 100;
            int c = year % 100;

            int d = b / 4;
            int e = b % 4;

            int f = (b + 8) / 25;

            int g = (b - f + 1) / 3;

            int h = (19 * a + b - d - g + 15) % 30;

            int i = c / 4;
            int k = c % 4;

            int j = (32 + 2 * e + 2 * i - h - k) % 7;

            int m = (a + 11 * h + 22 * j) / 451;

            int month = (h + j - 7 * m + 114) / 31;
            int p = (h + j - 7 * m + 114) % 31;

            int day = p + 1;

            easterIsOnLabel.setText("Easter date in " + year + ":");

            if (month == 4) {
                easterFinalDateCalculatedLabel.setText("April, " + day);
            }

            if (month == 3) {
                easterFinalDateCalculatedLabel.setText("March, " + day);
            }
        }

    }//GEN-LAST:event_userYearCHoiceConfirmationButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EasterComes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EasterComes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EasterComes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EasterComes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EasterComes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel easterComesTitleLabel;
    private javax.swing.JLabel easterFinalDateCalculatedLabel;
    private javax.swing.JLabel easterIsOnLabel;
    private javax.swing.JLabel enterYearLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel userInfroLabel;
    private javax.swing.JButton userYearCHoiceConfirmationButton;
    private javax.swing.JTextField userYearChoiceTextField;
    // End of variables declaration//GEN-END:variables
}
