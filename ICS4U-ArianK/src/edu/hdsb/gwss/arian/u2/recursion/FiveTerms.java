/* Name: FiveTerms
 * Version: v1
 * Date: March 30 2016
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.arian.u2.recursion;

import java.text.DecimalFormat;

public class FiveTerms {

    public static void main(String[] args) {
        //formatter
        DecimalFormat formatter = new DecimalFormat("0.00");

        //print sequence one
        System.out.println("Sequence One: ");

        for (int i = 1; i <= 5; i++) {
            System.out.println(sequenceOne(i));
        }

        System.out.println("");
        //print sequence two
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
