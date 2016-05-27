/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.objectAssignment.summative;

/**
 *
 * @author 1krasniqiari
 */
public class ImproperFraction extends Fraction {

    int numerator;
    int denominator;

    public ImproperFraction() {
    }

    public ImproperFraction(int numerator, int denominator) {
        if (numerator <= denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }


    

    public Fraction toMixed() {

        Fraction f = new Fraction((this.numerator / this.denominator), (this.numerator % this.denominator), this.denominator);

        return f;
    }

}
