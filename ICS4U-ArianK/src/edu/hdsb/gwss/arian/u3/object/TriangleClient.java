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
public class TriangleClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Triangle a = new Triangle(-1,2,3);
        System.out.println(a.toString());
        a.setSideLengthA(0);
        System.out.println(a.toString());
        a.setSideLengthA(10);
        System.out.println(a.getSideLengthA());
    }

}
