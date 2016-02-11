/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian;

/**
 *
 * @author ARIAN
 */
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1 = 3;
        double x2 = 3 * 3;
        double x3 = Math.sqrt(9);
        System.out.println(x1 + " == " + x3);
        System.out.println(x1 == x2);

        double z1 = 0.5;
        double z2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(z1 + " == " + z2);
        System.out.println(z1 == z2);
    }

}
