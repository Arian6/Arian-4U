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
public class ProperFraction extends Fraction {

    int numerator;
    int denominator;

    public ProperFraction(int numerator, int denominator) {
        
        if (this.numerator >= this.denominator) {
            this.numerator = numerator;
            this.denominator = denominator;

        }
    }

    
   

}
