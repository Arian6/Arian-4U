/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian;

import com.sun.glass.events.KeyEvent;
import javax.swing.JLabel;

/**
 *
 * @author 1krasniqiari
 */
public class Twenty48 extends javax.swing.JFrame {

    int score = 0;
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

        int r, c;
        boolean placed = false;

        do {
            r = (int) (Math.random() * 4);
            c = (int) (Math.random() * 4);

            // EMPTY!
            if (values[r][c] == 0) {
                values[r][c] = 2;
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
        scoreText.setText("" + score);

    }

    private void shiftRight() {

        // FOR EACH ROW
        for (int row = 0; row < values.length; row++) {

            for (int pass = 0; pass < values[row].length - 1; pass++) {

                // LOOK LEFT
                for (int col = 0; col < values[row].length - 1 - pass; col++) {
                    if (values[row][col + 1] == 0) {
                        values[row][col + 1] = values[row][col];
                        values[row][col] = 0;
                    }
                }
            }
        }

    }

    private void compressRight() {

        // FOR EACH ROW
        for (int row = 0; row < values.length; row++) {
            // LOOK LEFT
            for (int col = values[row].length - 1; col > 0; col--) {
                if (values[row][col] == values[row][col - 1]) {
                    values[row][col] = values[row][col] * 2;
                    score = score + values[row][col];
                    values[row][col - 1] = 0;
                }
            }
        }

    }

    private void shiftLeft() {

        // FOR EACH ROW
        for (int row = 0; row < values.length; row++) {

            for (int pass = 0; pass < values[row].length - 1; pass++) {

                // LOOK LEFT
                for (int col = 3; col >= values[row].length - 1 - pass; col--) {
                    if (values[row][col - 1] == 0) {
                        values[row][col - 1] = values[row][col];
                        values[row][col] = 0;
                    }
                }
            }
        }

    }

    private void compressLeft() {

        // FOR EACH ROW
        for (int row = 0; row < values.length; row++) {
            // LOOK LEFT
            for (int col = values[row].length - 1; col > 0; col--) {
                if (values[row][col] == values[row][col - 1]) {
                    values[row][col] = values[row][col] * 2;
                    score = score + values[row][col];
                    values[row][col - 1] = 0;
                }
            }
        }

    }

    private void shiftUp() {

        // FOR EACH column
        for (int row = 0; row < values.length; row++) {

            for (int pass = 0; pass < values[row].length - 1; pass++) {

                // LOOK up
                for (int col = 3; col >= values[row].length - 1 - pass; col--) {
                    if (values[col - 1][row] == 0) {
                        values[col - 1][row] = values[col][row];
                        values[col][row] = 0;
                    }
                }
            }
        }

    }

    private void compressUp() {

        // FOR EACH ROW
        for (int row = 0; row < values.length; row++) {
            // LOOK LEFT
            for (int col = values[row].length - 1; col > 0; col--) {
                if (values[col][row] == values[col - 1][row]) {
                    values[col][row] = values[col][row] * 2;
                    score = score + values[col][row];
                    values[col - 1][row] = 0;
                }
            }
        }

    }

    private void shiftDown() {

        // FOR EACH column
        for (int row = 0; row < values.length; row++) {

            for (int pass = 0; pass < values[row].length - 1; pass++) {

                // LOOK up
                for (int col = 0; col < values[row].length - 1 - pass; col++) {
                    if (values[col + 1][row] == 0) {
                        values[col + 1][row] = values[col][row];
                        values[col][row] = 0;
                    }

                }
            }
        }

    }

    private void compressDown() {

        // FOR EACH ROW
        for (int row = 0; row < values.length; row++) {
            // LOOK LEFT
            for (int col = values[row].length - 1; col > 0; col--) {
                if (values[col][row] == values[col - 1][row]) {
                    values[col][row] = values[col][row] * 2;
                    score = score + values[col][row];
                    values[col - 1][row] = 0;
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
        scoreText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 500));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setPreferredSize(new java.awt.Dimension(1000, 500));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setForeground(new java.awt.Color(0, 51, 153));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

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

        scoreText.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(scoreText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
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
                    .addComponent(boxRow0Column3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxRow1Column0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow1Column1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow1Column2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxRow1Column3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

        switch (evt.getKeyCode()) {
            case KeyEvent.VK_UP:
                shiftUp();
                compressUp();
                shiftUp();
                break;
            case KeyEvent.VK_DOWN:
                shiftDown();
                compressDown();
                shiftDown();

                break;
            case KeyEvent.VK_LEFT:
                shiftLeft();
                compressLeft();
                shiftLeft();
                break;
            case KeyEvent.VK_RIGHT:
                shiftRight();
                compressRight();
                shiftRight();
                break;
        }
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_UP:

                updateDisplay();
            case KeyEvent.VK_DOWN:
                updateDisplay();
            case KeyEvent.VK_LEFT:

                updateDisplay();

            case KeyEvent.VK_RIGHT:
                placeRandomTwo();
                updateDisplay();
                break;
        }
    }//GEN-LAST:event_formKeyPressed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
//
//        switch (evt.getKeyCode()) {
//            case KeyEvent.VK_UP:
//                break;
//            case KeyEvent.VK_DOWN:
//                break;
//            case KeyEvent.VK_LEFT:
//                break;
//            case KeyEvent.VK_RIGHT:
//                shiftRight();
//                compressRight();
//                shiftRight();
//                break;
//        }
//        switch (evt.getKeyCode()) {
//            case KeyEvent.VK_UP:
//            case KeyEvent.VK_DOWN:
//            case KeyEvent.VK_LEFT:
//            case KeyEvent.VK_RIGHT:
//                placeRandomTwo();
//                updateDisplay();
//                break;
//        }
    }//GEN-LAST:event_jPanel1KeyPressed

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
    private javax.swing.JLabel scoreText;
    // End of variables declaration//GEN-END:variables
}
