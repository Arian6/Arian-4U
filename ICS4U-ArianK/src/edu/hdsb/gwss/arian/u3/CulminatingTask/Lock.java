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
public abstract class Lock {

    protected static int lastIdUsed = 0;

    protected int getterCount;
    protected int serialNumber;
    private boolean locked;
    protected ArrayList<Integer> lockCombo = new ArrayList<Integer>();

    abstract String type();

    
    public void changeLock(int digits) {

        for (int i = digits - 1; i >= 0; i--) {
            lockCombo.remove(i);

        }

    }

    public void comboGenerator(int digits, int highestPossible) {

        for (int i = 0; i < digits; i++) {
            lockCombo.add((int) (Math.random() * highestPossible));
        }
    }

    public boolean isValid(int x, int limit) {
        if (x < 0 || x > limit) {
            System.out.println("This number is invalid");
            return false;
        } else {
            return true;
        }

    }

    public static int getLastIdUsed() {
        return lastIdUsed;
    }

    public static void setLastIdUsed(int lastIdUsed) {
        Lock.lastIdUsed = lastIdUsed;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public ArrayList<Integer> getLockCombo() {
        getterCount++;
        if (getterCount > 1) {
            System.out.println("Cannot retrieve combo");

        } else {
            return lockCombo;
        }

        return null;
    }

}
