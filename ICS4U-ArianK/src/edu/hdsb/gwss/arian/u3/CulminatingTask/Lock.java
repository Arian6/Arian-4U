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
public abstract class Lock implements LockInterface {

    protected static int lastIdUsed = 0;

    protected int getterCount;
    protected int unlockTries;
    protected int serialNumber;
    protected boolean locked;
    protected ArrayList<Integer> lockCombo = new ArrayList<Integer>();

    public Lock() {
        this.serialNumber = ++lastIdUsed;
        this.getterCount = 0;
        this.unlockTries = 0;
        this.locked = false;
    }

    public void changeLock(int digits) {
        this.lockCombo.removeAll(lockCombo);

    }

    protected void comboGenerator(int digits, int highestPossible) {

        for (int i = 0; i < digits; i++) {
            this.lockCombo.add((int) (Math.random() * highestPossible));
        }
        System.out.println("Your lock combination is: " + this.lockCombo);
    }

    public void setCombo(int num1, int num2, int num3) {

        if(this instanceof Android) {
             this.getterCount = 0;
             this.unlockTries = 0;
             changeLock(3);
      
        if (isValid(num1, 9) && isValid(num2, 9) && isValid(num3, 9)) {
            this.lockCombo.add(num1);
            this.lockCombo.add(num2);
            this.lockCombo.add(num3);

            System.out.println("Your lock combination is: " + this.lockCombo);
        } else {

            System.out.println("Re-enter lock combo");
        }
        } else {
            System.out.println("Lock is not configurable");
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
