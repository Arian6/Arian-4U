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

    public static final int COMBO_MAX = 9;
    public static final int COMBO_LENGTH = 4;

    public MasterU() {
        super();
        this.comboGenerator(COMBO_LENGTH, COMBO_MAX);
    }

     protected void setCombo(int num1, int num2, int num3, int num4) {
        if (this instanceof MasterU) {
            super.setCombo(num1, num2, num3);
            if (isValid(num1, 9)) {
                this.lockCombo.add(num4);
            } else {
                System.out.println("Invalid lock combination");
            }
        }
    }

    public void unlock(int num1, int num2, int num3, int num4) {

        this.unlockTries++;
        if (unlockTries <= 3) {
            if (this.lockCombo.get(0).equals(num1) && this.lockCombo.get(1).equals(num2) && this.lockCombo.get(2).equals(num3) && this.lockCombo.get(3).equals(num4)) {
                System.out.println("The lock has been unlocked!");
                this.locked = false;
                this.unlockTries = 0;

            } else {
                System.out.println("Wrong Combination");
                this.locked = true;
            }
        } else {
            System.out.println("Out of tries!");
        }

    }

}
