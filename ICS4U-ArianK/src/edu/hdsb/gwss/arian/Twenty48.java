/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian;

import javax.swing.JLabel;

/**
 *
 * @author 1krasniqiari
 */
public class Twenty48 extends javax.swing.JFrame {

    JLabel[][] boxes = new JLabel[4][4];
    int[][] values = new int[4][4];

    public Twenty48() {

        initComponents();

        //put jlabels into the array
        boxes[0][0] = boxRow0Column0;
        boxes[0][1] = boxRow0Column1;
        boxes[0][2] = boxRow0Column2;
        boxes[0][3] = boxRow0Column3;
        boxes[1][0] = boxRow1Column0;
        boxes[1][1] = boxRow1Column1;
        boxes[1][2] = boxRow1Column2;
        boxes[1][3] = boxRow1Column3;
        boxes[2][0] = boxRow2Column0;
        boxes[2][1] = boxRow2Column1;
        boxes[2][2] = boxRow2Column2;
        boxes[2][3] = boxRow2Column3;
        boxes[3][0] = boxRow3Column0;
        boxes[3][1] = boxRow3Column1;
        boxes[3][2] = boxRow3Column2;
        boxes[3][3] = boxRow3Column3;
        placeRandomTwo();
        placeRandomTwo();

        //
        updateDisplay();

    }

    private void placeRandomTwo() {

        int random;
        int random2;
        boolean placed = false;

        do {
            random = (int) (Math.random() * 4);
            random2 = (int) (Math.random() * 4);

            if (values[random][random2] == 0) {
                values[random][random2] = 2;
                placed = true;
            }

        } while (!placed);

    }

    private void updateDisplay() {
        for (int r = 0; r < values.length; r++) {
            for (int c = 0; c < values[r].length; c++) {

                if (values[r][c] == 0) {
                    boxes[r][c].setText("");
                } else {

                    boxes[r][c].setText(values[r][c] + "");
                }
            }
        }

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
        boxRow0Column0 = new javax.swing.JLabel();
        boxRow2Column0 = new javax.swing.JLabel();
        boxRow1Column0 = new javax.swing.JLabel();
        boxRow2Column3 = new javax.swing.JLabel();
        boxRow0Column1 = new javax.swing.JLabel();
        boxRow0Column2 = new javax.swing.JLabel();
        boxRow0Column3 = new javax.swing.JLabel();
        boxRow1Column2 = new javax.swing.JLabel();
        boxRow1Column1 = new javax.swing.JLabel();
        boxRow1Column3 = new javax.swing.JLabel();
        boxRow2Column1 = new javax.swing.JLabel();
        boxRow2Column2 = new javax.swing.JLabel();
        boxRow3Column0 = new javax.swing.JLabel();
        boxRow3Column2 = new javax.swing.JLabel();
        boxRow3Column1 = new javax.swing.JLabel();
        boxRow3Column3 = new javax.swing.JLabel();
        moveToTheRightButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 500));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setPreferredSize(new java.awt.Dimension(1000, 500));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setForeground(new java.awt.Color(0, 51, 153));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        boxRow0Column0.setBackground(new java.awt.Color(204, 204, 204));
        boxRow0Column0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow0Column0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow0Column0.setText("2");
        boxRow0Column0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow0Column0.setOpaque(true);

        boxRow2Column0.setBackground(new java.awt.Color(204, 204, 204));
        boxRow2Column0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow2Column0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow2Column0.setText("2");
        boxRow2Column0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow2Column0.setOpaque(true);

        boxRow1Column0.setBackground(new java.awt.Color(204, 204, 204));
        boxRow1Column0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow1Column0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow1Column0.setText("2");
        boxRow1Column0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow1Column0.setOpaque(true);

        boxRow2Column3.setBackground(new java.awt.Color(204, 204, 204));
        boxRow2Column3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow2Column3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow2Column3.setText("2");
        boxRow2Column3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow2Column3.setOpaque(true);

        boxRow0Column1.setBackground(new java.awt.Color(204, 204, 204));
        boxRow0Column1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow0Column1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow0Column1.setText("2");
        boxRow0Column1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow0Column1.setOpaque(true);

        boxRow0Column2.setBackground(new java.awt.Color(204, 204, 204));
        boxRow0Column2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow0Column2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow0Column2.setText("2");
        boxRow0Column2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow0Column2.setOpaque(true);

        boxRow0Column3.setBackground(new java.awt.Color(204, 204, 204));
        boxRow0Column3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow0Column3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow0Column3.setText("2");
        boxRow0Column3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow0Column3.setOpaque(true);

        boxRow1Column2.setBackground(new java.awt.Color(204, 204, 204));
        boxRow1Column2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow1Column2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow1Column2.setText("2");
        boxRow1Column2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow1Column2.setOpaque(true);

        boxRow1Column1.setBackground(new java.awt.Color(204, 204, 204));
        boxRow1Column1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow1Column1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow1Column1.setText("2");
        boxRow1Column1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow1Column1.setOpaque(true);

        boxRow1Column3.setBackground(new java.awt.Color(204, 204, 204));
        boxRow1Column3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow1Column3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow1Column3.setText("2");
        boxRow1Column3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow1Column3.setOpaque(true);

        boxRow2Column1.setBackground(new java.awt.Color(204, 204, 204));
        boxRow2Column1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow2Column1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow2Column1.setText("2");
        boxRow2Column1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow2Column1.setOpaque(true);

        boxRow2Column2.setBackground(new java.awt.Color(204, 204, 204));
        boxRow2Column2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow2Column2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow2Column2.setText("2");
        boxRow2Column2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow2Column2.setOpaque(true);

        boxRow3Column0.setBackground(new java.awt.Color(204, 204, 204));
        boxRow3Column0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow3Column0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow3Column0.setText("2");
        boxRow3Column0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow3Column0.setOpaque(true);

        boxRow3Column2.setBackground(new java.awt.Color(204, 204, 204));
        boxRow3Column2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow3Column2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow3Column2.setText("2");
        boxRow3Column2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow3Column2.setOpaque(true);

        boxRow3Column1.setBackground(new java.awt.Color(204, 204, 204));
        boxRow3Column1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow3Column1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow3Column1.setText("2");
        boxRow3Column1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow3Column1.setOpaque(true);

        boxRow3Column3.setBackground(new java.awt.Color(204, 204, 204));
        boxRow3Column3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boxRow3Column3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boxRow3Column3.setText("2");
        boxRow3Column3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boxRow3Column3.setOpaque(true);

        moveToTheRightButton.setText("Right");
        moveToTheRightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Right(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(moveToTheRightButton)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boxRow0Column0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxRow0Column1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxRow0Column2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxRow0Column3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boxRow1Column0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxRow1Column1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxRow1Column2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxRow1Column3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boxRow2Column0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxRow2Column1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxRow2Column2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxRow2Column3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boxRow3Column0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxRow3Column1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxRow3Column2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxRow3Column3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxRow0Column0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow0Column1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow0Column2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow0Column3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxRow1Column0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow1Column1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow1Column2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow1Column3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moveToTheRightButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxRow2Column0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow2Column1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow2Column2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow2Column3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxRow3Column0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow3Column1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow3Column2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow3Column3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Right(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Right
        // TODO add your handling code here:
        int holder = 2;
        boolean position = false;
        int count = 3;

//        for (int r = 0; r < values.length; r++) {
//            for (int c = 0; c < values[r].length; c++) {
//
//                if (values[r][c] > 0) {
//
//                    int temp = values[r][c];
//
//                    for (int x = 3; x < c; x--) {
//
//                        if (values[r][x] == temp) {
//                            values[r][x] = values[r][c] * 2;
//                            values[r][c] = 0;
//                            break;
//                        } else {
//
//                        }
//
//                    }
//
//                }
//
//            }
//        }
        for (int r = 0; r < values.length; r++) {

            for (int c = 0; c < values[r].length; c++) {

                if (values[r][c] == 0) {
                    boxes[r][c].setText("");
                } else {

                    for (int x = 3; x < values[r].length; x--) {
                        if (x <= c) {
                            break;
                        } else {
                            if (values[r][x] == 0) {
                                boxes[r][c].setText("");
                                boxes[r][x].setText(values[r][c] + "");
                                values[r][x] = values[r][c];
                                values[r][c] = 0;

                            }

                        }

                    }

                }

            }

        }

        int random;
        int random2;
        boolean placed = false;

        do {
            random = (int) (Math.random() * 4);
            random2 = (int) (Math.random() * 4);

            if (values[random][random2] == 0) {
                values[random][random2] = 2;
                boxes[random][random2].setText(values[random][random2] + "");

                placed = true;
            }

        } while (!placed);


    }//GEN-LAST:event_Right

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
            java.util.logging.Logger.getLogger(Twenty48.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Twenty48.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Twenty48.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Twenty48.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Twenty48().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boxRow0Column0;
    private javax.swing.JLabel boxRow0Column1;
    private javax.swing.JLabel boxRow0Column2;
    private javax.swing.JLabel boxRow0Column3;
    private javax.swing.JLabel boxRow1Column0;
    private javax.swing.JLabel boxRow1Column1;
    private javax.swing.JLabel boxRow1Column2;
    private javax.swing.JLabel boxRow1Column3;
    private javax.swing.JLabel boxRow2Column0;
    private javax.swing.JLabel boxRow2Column1;
    private javax.swing.JLabel boxRow2Column2;
    private javax.swing.JLabel boxRow2Column3;
    private javax.swing.JLabel boxRow3Column0;
    private javax.swing.JLabel boxRow3Column1;
    private javax.swing.JLabel boxRow3Column2;
    private javax.swing.JLabel boxRow3Column3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton moveToTheRightButton;
    // End of variables declaration//GEN-END:variables
}
