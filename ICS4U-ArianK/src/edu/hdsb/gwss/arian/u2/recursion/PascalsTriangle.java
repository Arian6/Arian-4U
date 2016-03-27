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
        if (row > 0) {
            row(row - 1);
        }

//        for (int j = 0; j < 7; j++) {
//            System.out.format("%" + (7 - j) * 2 + "s", "");
//        }
        for (int i = 0; i <= row; i++) {

            System.out.format("%" + term(row, i) + "s", "");
            System.out.format("%4s", term(row, i));

        }

        System.out.println();

//        
//         int rows = 10;
//
//        for (int i = 0; i < rows; i++) {
//
//            int number = 1;
//
//            System.out.format("%" + (rows - i) * 2 + "s", "");
//
//            for (int j = 0; j <= i; j++) {
//
//                System.out.format("%4d", number);
//
//                number = number * (i - j) / (j + 1);
//
//            }
//
//            System.out.println();
//
//        }
//
//    }
    }

    public static int term(int row, int col) {

        if (col == 0 || col == row) {
            return 1;
        } else {
            return term(row - 1, col) + term(row - 1, col - 1);
        }

    }

}
