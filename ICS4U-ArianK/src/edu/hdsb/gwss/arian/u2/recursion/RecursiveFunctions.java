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
public class RecursiveFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("First Algorithm : f(x,y)");
        System.out.println("f(5,3): " + firstFunction(5, 3));
        System.out.println("f(2,2): " + firstFunction(2, 2));
        System.out.println("f(1,4): " + firstFunction(1, 4));
        System.out.println("f(-5,-2): " + firstFunction(-5, -2));

        System.out.println("Ackermann's Function : a(m,n)");
        System.out.println("a(1,1): " + ackermann(1, 1));
        System.out.println("a(2,1): " + ackermann(2, 1));
        System.out.println("a(5,5): " + ackermann(5, 5));

    }

    public static int firstFunction(int x, int y) {

        if (x < y) {
            return -firstFunction(y, x);
        } else if (x == y) {
            return 0;
        } else {
            return 1 + firstFunction(x - 1, y);
        }

    }

    public static int ackermann(int m, int n) {

        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }

    }
}
