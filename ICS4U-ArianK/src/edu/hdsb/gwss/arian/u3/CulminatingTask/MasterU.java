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

        super(4, 9);
    }

    public MasterU(int num1, int num2, int num3, int num4) {
        super();
        comboSetter4Digit(num1, num2, num3, num4);

    }

    public void setLockCombo(int num1, int num2, int num3, int num4) {
        getterCount = 0;
        changeLock(4);
        comboSetter4Digit(num1, num2, num3, num4);
    }

    public String type() {

        return "MU";
    }
}
