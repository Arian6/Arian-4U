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
        serialNumber = ++lastIdUsed;
        comboGenerator(3, 59);
        System.out.println("Your lock combination is: " + lockCombo);
    }

    public Dubdly(int num1, int num2, int num3) {
        serialNumber = ++lastIdUsed;
         if (isValid(num1, 59) && isValid(num2, 59) && isValid(num3, 59)) {
            lockCombo.add(num1);
            lockCombo.add(num2);
            lockCombo.add(num3);
            System.out.println("Your lock combination is: " + lockCombo);
        } else {
          
            System.out.println("Re-enter lock combo");
        }
    }
    
    public String type() {
        return "D";
    }
    
}
