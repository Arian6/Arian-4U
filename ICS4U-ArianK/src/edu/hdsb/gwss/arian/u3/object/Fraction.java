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
public class Fraction {

    private int num;
    private int den;

    public Fraction() {

        this.den = 1;
    }

    public Fraction(int num, int den) {
        this.num = num;
        this.setDen(den);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        if (den <= 0) {
            System.out.println("Invaluid Denominator");
            this.den = 1;
        } else {
            this.den = den;
        }
    }

    @Override
    public String toString() {
        return "Fraction{" + num + "/" + den + '}';
    }
    
    

}
