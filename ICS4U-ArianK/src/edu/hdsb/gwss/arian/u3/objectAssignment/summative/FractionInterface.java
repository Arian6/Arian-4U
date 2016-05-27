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
public interface FractionInterface {
    
    
    public int getNumerator();
    
     public double size();
     
     public Fraction Larger(Fraction f);
     
     public Fraction Larger(Fraction f, Fraction g);
     
     public Fraction times(Fraction f); 
     
      public Fraction times(Fraction f, Fraction g); 
    
    public void reduce();
    
    public void invert();
    
}
