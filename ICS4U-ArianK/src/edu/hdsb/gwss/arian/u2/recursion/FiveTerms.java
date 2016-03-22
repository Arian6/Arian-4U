/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u2.recursion;

import java.text.NumberFormat;

/**
 *
 * @author 1krasniqiari
 */
public class FiveTerms {

    /**
     * @param args the command line arguments
     */
    static int count = 2;
    static int[] sequanceOneArray = new int[5];
    static double[] sequanceTwoArray = new double[5];

    public static void main(String[] args) {
        // TODO code application logic here
        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(2);
        decimal.setMaximumFractionDigits(2);

        sequenceOne(count);
        count = 1;
        sequenceTwo(count);

        System.out.println("Sequence One:");
        for (int i = 0; i < 5; i++) {
            System.out.println(sequanceOneArray[i]);
        }

        System.out.println("");
        System.out.println("Sequence Two:");

        for (int i = 0; i < 5; i++) {
            System.out.println(decimal.format(sequanceTwoArray[i]));
        }
    }

    public static void sequenceOne(int count) {

        sequanceOneArray[0] = 1;
        sequanceOneArray[1] = 3;

        if (count < 5) {
            sequanceOneArray[count] = sequanceOneArray[count - 1] + sequanceOneArray[count - 2];
            sequenceOne(count + 1);
        }

    }

    public static void sequenceTwo(int count) {

        NumberFormat decimal = NumberFormat.getNumberInstance();
        decimal.setMinimumFractionDigits(2);
        decimal.setMaximumFractionDigits(2);
        sequanceTwoArray[0] = 2;

        if (count < 5) {

            sequanceTwoArray[count] = Math.sqrt((sequanceTwoArray[count - 1] * 3) + 4);

            sequenceTwo(count + 1);
        }
    }
}
