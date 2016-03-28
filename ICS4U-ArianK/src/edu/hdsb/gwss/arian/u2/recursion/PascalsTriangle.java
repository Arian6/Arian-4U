/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u2.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ARIAN
 */
public class PascalsTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        row(7);
    }

    public static void row(int row) {

        if (row >= 1) {
            row(row - 1);

        }

        for (int j = 7; j > row; j--) {
            System.out.print("  ");
        }

        for (int j = 0; j <= row; j++) {

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
