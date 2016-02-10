package edu.hdsb.gwss.arian;

import java.math.BigInteger;

/* Name: ExtraLongFactorials
 * Version: v1
 * Date: February 10 2016
 * Author: Arian Krasniqi
 */
public class ExtraLongFactorials extends javax.swing.JFrame {

    public ExtraLongFactorials() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        extraLongFactorialsTitleLabel = new javax.swing.JLabel();
        programInfoForUserLabel = new javax.swing.JLabel();
        userEntersFactorialLabel = new javax.swing.JLabel();
        userNumberChoiceTextField = new javax.swing.JTextField();
        confirmationNumberChoiceButton = new javax.swing.JButton();
        finalFactorialLabel = new javax.swing.JLabel();
        calculatedFactorialAnswerLabel = new javax.swing.JLabel();
        backgroundImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(635, 308));
        setMinimumSize(new java.awt.Dimension(635, 308));
        setPreferredSize(new java.awt.Dimension(635, 308));
        getContentPane().setLayout(null);

        extraLongFactorialsTitleLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        extraLongFactorialsTitleLabel.setForeground(new java.awt.Color(204, 0, 204));
        extraLongFactorialsTitleLabel.setText("Extra Long Factorials");
        getContentPane().add(extraLongFactorialsTitleLabel);
        extraLongFactorialsTitleLabel.setBounds(211, 18, 209, 28);

        programInfoForUserLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        programInfoForUserLabel.setForeground(new java.awt.Color(204, 0, 204));
        programInfoForUserLabel.setText("This program will calculate the factorials of any number no matter the size!");
        getContentPane().add(programInfoForUserLabel);
        programInfoForUserLabel.setBounds(56, 57, 541, 22);

        userEntersFactorialLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        userEntersFactorialLabel.setForeground(new java.awt.Color(51, 255, 255));
        userEntersFactorialLabel.setText("Enter your number: ");
        getContentPane().add(userEntersFactorialLabel);
        userEntersFactorialLabel.setBounds(93, 138, 160, 22);

        userNumberChoiceTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(userNumberChoiceTextField);
        userNumberChoiceTextField.setBounds(342, 135, 119, 23);

        confirmationNumberChoiceButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        confirmationNumberChoiceButton.setText("Enter");
        confirmationNumberChoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmationNumberChoiceButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmationNumberChoiceButton);
        confirmationNumberChoiceButton.setBounds(495, 134, 63, 25);

        finalFactorialLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        finalFactorialLabel.setForeground(new java.awt.Color(0, 255, 255));
        finalFactorialLabel.setText("Factorial: ");
        getContentPane().add(finalFactorialLabel);
        finalFactorialLabel.setBounds(106, 220, 80, 22);

        calculatedFactorialAnswerLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        calculatedFactorialAnswerLabel.setForeground(new java.awt.Color(0, 255, 255));
        calculatedFactorialAnswerLabel.setText("???");
        getContentPane().add(calculatedFactorialAnswerLabel);
        calculatedFactorialAnswerLabel.setBounds(220, 220, 390, 17);

        backgroundImageLabel.setIcon(new javax.swing.ImageIcon("G:\\MyPortfolio\\ICS4U\\calculator for factorials.jpg")); // NOI18N
        getContentPane().add(backgroundImageLabel);
        backgroundImageLabel.setBounds(0, 0, 640, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmationNumberChoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmationNumberChoiceButtonActionPerformed
        // TODO add your handling code here:
        BigInteger chosenNumber = new BigInteger(userNumberChoiceTextField.getText());

        BigInteger chosenNumber2 = new BigInteger("0");
        BigInteger chosenNumber4 = new BigInteger("1");
        BigInteger kinda = new BigInteger("1");

        BigInteger promise[] = new BigInteger[Integer.parseInt(userNumberChoiceTextField.getText())];

        for (int i = 0; i < Integer.parseInt(userNumberChoiceTextField.getText()); i++) {

            promise[i] = chosenNumber.subtract(chosenNumber2);
            chosenNumber4 = chosenNumber4.multiply(promise[i]);

            chosenNumber2 = chosenNumber2.add(kinda);

        }

        calculatedFactorialAnswerLabel.setText(chosenNumber4.toString());


    }//GEN-LAST:event_confirmationNumberChoiceButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ExtraLongFactorials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExtraLongFactorials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExtraLongFactorials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExtraLongFactorials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExtraLongFactorials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImageLabel;
    private javax.swing.JLabel calculatedFactorialAnswerLabel;
    private javax.swing.JButton confirmationNumberChoiceButton;
    private javax.swing.JLabel extraLongFactorialsTitleLabel;
    private javax.swing.JLabel finalFactorialLabel;
    private javax.swing.JLabel programInfoForUserLabel;
    private javax.swing.JLabel userEntersFactorialLabel;
    private javax.swing.JTextField userNumberChoiceTextField;
    // End of variables declaration//GEN-END:variables
}
