/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.object;

/**
 *
 * @author 1krasniqiari
 */
public class FractionClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Fraction a = new Fraction(3, 4);
        Fraction b = new Fraction(7, 2);
        Fraction c = new Fraction();

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }

}
