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
        serialNumber = ++lastIdUsed;
        comboGenerator(3, 39);
        System.out.println("Your lock combination is: " + lockCombo);

    }

    public Master(int num1, int num2, int num3) {

        serialNumber = ++lastIdUsed;
        if (isValid(num1, 39) && isValid(num2, 39) && isValid(num3, 39)) {
            lockCombo.add(num1);
            lockCombo.add(num2);
            lockCombo.add(num3);
            System.out.println("Your lock combination is: " + lockCombo);
        } else {
          
            System.out.println("Re-enter lock combo");
        }
    }
    
    public String type() {
        return "M";
    }

}
