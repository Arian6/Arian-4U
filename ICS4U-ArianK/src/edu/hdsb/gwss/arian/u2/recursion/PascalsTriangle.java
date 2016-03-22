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
        // TODO code application logic here

        for (int j = 1; j <= 10; j++) {

            for (int k = 10; k > j; k--) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 10; i++) {
                if (triangle(j, i) > 0) {
                    System.out.print(triangle(j, i) + " ");

                }
            }
            System.out.println("");
        }

    }

    public static int triangle(int row, int col) {

        if (col == 1 || col == row) {
            return 1;
        } else if (col > row) {
            return -1;
        } else {
            return triangle(row - 1, col) + triangle(row - 1, col - 1);
        }

    }

}
