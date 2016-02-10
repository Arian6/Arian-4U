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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        extraLongFactorialsTitleLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        extraLongFactorialsTitleLabel.setForeground(new java.awt.Color(204, 0, 204));
        extraLongFactorialsTitleLabel.setText("Extra Long Factorials");

        programInfoForUserLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        programInfoForUserLabel.setForeground(new java.awt.Color(204, 0, 204));
        programInfoForUserLabel.setText("This program will calculate the factorials of any number no matter the size!");

        userEntersFactorialLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userEntersFactorialLabel.setText("Enter your number: ");

        userNumberChoiceTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        confirmationNumberChoiceButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        confirmationNumberChoiceButton.setText("Enter");
        confirmationNumberChoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmationNumberChoiceButtonActionPerformed(evt);
            }
        });

        finalFactorialLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        finalFactorialLabel.setText("Factorial: ");

        calculatedFactorialAnswerLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        calculatedFactorialAnswerLabel.setText("???");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(programInfoForUserLabel)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(extraLongFactorialsTitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(finalFactorialLabel)
                            .addComponent(userEntersFactorialLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(userNumberChoiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(confirmationNumberChoiceButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(calculatedFactorialAnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(extraLongFactorialsTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(programInfoForUserLabel)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userEntersFactorialLabel)
                    .addComponent(userNumberChoiceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmationNumberChoiceButton))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalFactorialLabel)
                    .addComponent(calculatedFactorialAnswerLabel))
                .addContainerGap(73, Short.MAX_VALUE))
        );

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
    private javax.swing.JLabel calculatedFactorialAnswerLabel;
    private javax.swing.JButton confirmationNumberChoiceButton;
    private javax.swing.JLabel extraLongFactorialsTitleLabel;
    private javax.swing.JLabel finalFactorialLabel;
    private javax.swing.JLabel programInfoForUserLabel;
    private javax.swing.JLabel userEntersFactorialLabel;
    private javax.swing.JTextField userNumberChoiceTextField;
    // End of variables declaration//GEN-END:variables
}
