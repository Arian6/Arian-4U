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
public class Master extends Lock {

    public Master() {
        super(3,39);

    }

    public Master(int num1, int num2, int num3) {
       super();
       comboSetter3Digit(num1, num2, num3, 39);
    }
    
    public String type() {
        return "M";
    }

}