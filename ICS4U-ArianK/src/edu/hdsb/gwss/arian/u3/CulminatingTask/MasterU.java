/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.CulminatingTask;

import java.util.ArrayList;



/**
 *
 * @author ARIAN
 */
public class MasterU extends Lock {

    public MasterU() {

        serialNumber = ++lastIdUsed;
        comboGenerator(4, 9);
        System.out.println("Your lock combination is: " + lockCombo);
    }

    public MasterU(int num1, int num2, int num3, int num4) {
        serialNumber = ++lastIdUsed;
        if (isValid(num1, 9) && isValid(num2, 9) && isValid(num3,9) && isValid(num4, 9)) {
            lockCombo.add(num1);
            lockCombo.add(num2);
            lockCombo.add(num3);
            lockCombo.add(num4);
            System.out.println("Your lock combination is: " + lockCombo);
        } else {
          
            System.out.println("Re-enter lock combo");
        }
    }

    
    public void setLockCombo(int num1, int num2, int num3, int num4 ) {
        getterCount = 0;
        
         changeLock(4);
        
        
        if (isValid(num1, 9) && isValid(num2, 9) && isValid(num3,9) && isValid(num4, 9)) {
            lockCombo.add(num1);
            lockCombo.add(num2);
            lockCombo.add(num3);
             lockCombo.add(num4);
             System.out.println("Your lock combination is: " + lockCombo);
            
        }else {
            System.out.println("Invalid combo lock");
        }             
    }
    
    
public String type() {
        
    return "MU";
    }
}
