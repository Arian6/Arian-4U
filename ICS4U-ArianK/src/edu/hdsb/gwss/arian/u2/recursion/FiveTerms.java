/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u2.recursion;

import java.text.DecimalFormat;

/**
 *
 * @author 1krasniqiari
 */
public class FiveTerms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat formatter = new DecimalFormat("0.00");

        System.out.println("Sequence One: ");

        for (int i = 1; i <= 5; i++) {
            System.out.println(sequenceOne(i));
        }

        System.out.println("");
        System.out.println("Sequence Two: ");

        for (int i = 1; i <= 5; i++) {
            System.out.println(formatter.format(sequenceTwo(i)));
        }
    }

    public static int sequenceOne(int term) {

        if (term == 1) {
            return 1;
        } else if (term == 2) {
            return 3;
        } else {
            return sequenceOne(term - 1) + sequenceOne(term - 2);
        }

    }

    public static double sequenceTwo(double term) {

        if (term == 1) {
            return 2;
        } else {

            return Math.sqrt(((3 * sequenceTwo(term - 1)) + 4));

        }

    }
}
