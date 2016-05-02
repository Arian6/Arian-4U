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
abstract class Lock implements LockInterface{

    protected static int lastIdUsed = 0;

    protected int getterCount;
    protected int unlockTries;
    protected int serialNumber;
    private boolean locked;
    protected ArrayList<Integer> lockCombo = new ArrayList<Integer>();

   

    public Lock() {
        serialNumber = ++lastIdUsed;

    }

    public Lock(int digits, int highestPossible) {
        this();
        comboGenerator(digits, highestPossible);

    }

    public void changeLock(int digits) {

        for (int i = digits - 1; i >= 0; i--) {
            this.lockCombo.remove(i);

        }

    }

    public void comboGenerator(int digits, int highestPossible) {

        for (int i = 0; i < digits; i++) {
            this.lockCombo.add((int) (Math.random() * highestPossible));
        }
        System.out.println("Your lock combination is: " + this.lockCombo);
    }

    public void comboSetter3Digit(int num1, int num2, int num3, int highestPossible) {
        if (isValid(num1, highestPossible) && isValid(num2, highestPossible) && isValid(num3, highestPossible)) {
            this.lockCombo.add(num1);
            this.lockCombo.add(num2);
            this.lockCombo.add(num3);

            System.out.println("Your lock combination is: " + this.lockCombo);
        } else {

            System.out.println("Re-enter lock combo");
        }

    }

    public void comboSetter4Digit(int num1, int num2, int num3, int num4) {
        if (isValid(num1, 9) && isValid(num2, 9) && isValid(num3, 9) && isValid(num4, 9)) {
            this.lockCombo.add(num1);
            this.lockCombo.add(num2);
            this.lockCombo.add(num3);
            this.lockCombo.add(num4);

            System.out.println("Your lock combination is: " + this.lockCombo);
        } else {

            System.out.println("Re-enter lock combo");
        }

    }

    public void lock() {
        if (this.locked = false) {
            this.unlockTries = 0;
            this.locked = true;
        } else {
            System.out.println("Already locked!");
        }
    }

    public void unlock(int num1, int num2, int num3) {

        this.unlockTries++;
        if (this.unlockTries <= 3) {
            if (this.lockCombo.get(0).equals(num1) && this.lockCombo.get(1).equals(num2) && this.lockCombo.get(2).equals(num3)) {
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
    
    public void unlock(int num1, int num2, int num3, int num4) {

        this.unlockTries++;
        if (unlockTries < 3) {
            if (this.lockCombo.get(0).equals(num1) && this.lockCombo.get(1).equals(num2) && this.lockCombo.get(2).equals(num3)&& this.lockCombo.get(3).equals(num4)) {
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
            return null;

        } else {
            return lockCombo;
        }

    }

}
