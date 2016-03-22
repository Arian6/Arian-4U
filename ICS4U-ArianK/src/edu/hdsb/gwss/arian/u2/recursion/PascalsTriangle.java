/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u2.recursion;

/**
 *
 * @author ARIAN
 */
public class PascalsTriangle {

    /**
     * @param args the command line arguments
     */
    static int count = 2;
    static int count2 = 0;
    static int[][] pascalTriangle = new int[10][];

    public static void main(String[] args) {
        // TODO code application logic here

        triangle(count);
    }

    public static void triangle(int count) {
      

        if (count < 10) {

            for (int i = 1; i < count; i++) {
                pascalTriangle[count][i] = pascalTriangle[count - 1][i - 1] + pascalTriangle[count - 1][i];
                System.out.println(pascalTriangle[count][i]);
            }

            triangle(count + 1);
        }

    }

}
