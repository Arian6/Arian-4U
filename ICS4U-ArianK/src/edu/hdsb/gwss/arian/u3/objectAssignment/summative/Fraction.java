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
public class Fraction implements FractionInterface {

    private int numerator;
    private int denominator;
    private int wholeNumber;

    public Fraction() {

    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int wholeNumber, int numerator, int denominator) {
        this.wholeNumber = wholeNumber;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getWholeNumber() {
        return wholeNumber;
    }

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        } else {
            return gcd(q, p % q);
        }
    }

    public double size() {

        double exactValue = (double) this.numerator / this.denominator;

        return exactValue;
    }

    public Fraction Larger(Fraction f) {

        double fraction1 = f.size();

        if (this.size() >= fraction1) {

            return this;
        } else {
            return f;
        }

    }

    public Fraction Larger(Fraction f, Fraction g) {

        double fraction1 = f.size();
        double fraction2 = g.size();

        if (fraction1 >= fraction2) {

            return f;
        } else {
            return g;
        }

    }

    public Fraction times(Fraction f) {

        int newNumerator = this.numerator * f.numerator;
        int newDenominator = this.denominator * f.denominator;

        Fraction k = new Fraction(newNumerator, newDenominator);

        return k;

    }

    public Fraction times(Fraction f, Fraction g) {

        int newNumerator = f.numerator * g.numerator;
        int newDenominator = f.denominator * g.denominator;

        Fraction k = new Fraction(newNumerator, newDenominator);

        return k;

    }

    public void reduce() {

        this.numerator = this.numerator / gcd(this.numerator, this.denominator);
        this.denominator = this.denominator / gcd(this.numerator, this.denominator);

    }

    @Override
    public String toString() {
        return "Fraction{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }

    public boolean equals(Fraction f) {
        if (f == null) {
            return false;
        }
        if (getClass() != f.getClass()) {
            return false;
        }
        final Fraction other = (Fraction) f;
        if (f != f) {
            return false;
        }
        if (this.numerator != f.numerator) {
            return false;
        }
        if (this.denominator != f.denominator) {
            return false;
        }
        return true;
    }

    public void invert() {

        int numeratorKeep = this.numerator;

        if (numeratorKeep < 0) {
            this.numerator = this.denominator * -1;
            this.denominator = numeratorKeep * -1;

        } else {

            this.numerator = this.denominator;
            this.denominator = numeratorKeep;

        }

    }

}
