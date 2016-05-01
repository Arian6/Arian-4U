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
public class Android extends Lock {

    public  Android() {
    
        serialNumber = ++lastIdUsed;
        comboGenerator(3, 9);
        System.out.println("Your lock combination is: " + lockCombo);
    }

    public Android(int num1, int num2, int num3) {
        serialNumber = ++lastIdUsed;
        if (isValid(num1, 9) && isValid(num2, 9) && isValid(num3,9)) {
            lockCombo.add(num1);
            lockCombo.add(num2);
            lockCombo.add(num3);
           
            System.out.println("Your lock combination is: " + lockCombo);
        } else {
          
            System.out.println("Re-enter lock combo");
        }
       
    }
  
    public void setLockCombo(int num1, int num2, int num3 ) {
        getterCount = 0;
        
        changeLock(3);
        
        if (isValid(num1, 9) && isValid(num2, 9) && isValid(num3,9)) {
            lockCombo.add(num1);
            lockCombo.add(num2);
            lockCombo.add(num3);
            System.out.println("Your lock combination is: " + lockCombo);
            
        }else {
            System.out.println("Invalid combo lock");
        }             
    }
    
    
    public String type() {
        return "A";
    }

}
