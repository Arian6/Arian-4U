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
public class MixedFraction extends Fraction {

    int wholeNumber;
    int numerator;
    int denominator;

    public MixedFraction(int wholeNumber, int numerator, int denominator) {

        if (this.numerator >= this.denominator) {
            this.wholeNumber = wholeNumber;
            this.numerator = numerator;
            this.denominator = denominator;
        }

    }

    
    @Override
    public double size() {
        double size = this.wholeNumber + this.numerator / this.denominator;
        
        return size;
    }
    
    
    
    @Override
    public String toString() {
        return "MixedFraction{" + "wholeNumber=" + wholeNumber + ", numerator=" + numerator + ", denominator=" + denominator + '}';
    }

    public Fraction toImproper() {

        Fraction f = new Fraction(this.numerator * this.wholeNumber, this.denominator);

        return f;
    }

}
