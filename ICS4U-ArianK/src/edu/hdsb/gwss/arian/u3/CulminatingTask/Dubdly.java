/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.CulminatingTask;

/**
 *
 * @author ARIAN
 */
public class Dubdly extends Lock {

    public Dubdly() {
        super(3,59);
    }

    public Dubdly(int num1, int num2, int num3) {
   
        super();
       comboSetter3Digit(num1, num2, num3, 59);
    }
    
    public String type() {
        return "D";
    }
    
}