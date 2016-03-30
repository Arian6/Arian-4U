/* Name: Pascals Triangle
 * Version: v1
 * Date: March 30 2016
 * Author: Arian Krasniqi
 */
package edu.hdsb.gwss.arian.u2.recursion;

public class PascalsTriangle {

    public static void main(String[] args) {
        //call recursion for 7 rows of pascals 
        row(7);
    }

    public static void row(int row) {

        if (row >= 1) {
            row(row - 1);

        }

        //space out to middle decreasing each time
        for (int j = 7; j > row; j--) {
            System.out.print("  ");
        }

        for (int j = 0; j <= row; j++) {

            //format and special cases for 2 digit integers
            if (term(row, j) > 9) {
                System.out.format(term(row, j) + "  ");
            } else {
                System.out.format(term(row, j) + "   ");
            }

        }

        System.out.println();

    }

    public static int term(int row, int col) {

        if (col == 0 || col == row) {
            return 1;
        } else {
            return term(row - 1, col) + term(row - 1, col - 1);
        }

    }

}
