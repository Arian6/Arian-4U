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
public class Android extends Lock {

    public  Android() {
        super(3,9);
    }

    public Android(int num1, int num2, int num3) {
        super();
        comboSetter3Digit(num1, num2, num3, 9);
    }
  
    public void setLockCombo(int num1, int num2, int num3 ) {
        this.getterCount = 0;
        changeLock(3);
        comboSetter3Digit(num1, num2, num3, 9); 
    }
    
    
    public String type() {
        return "A";
    }

}