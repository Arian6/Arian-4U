/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.object;

/**
 *
 * @author 1krasniqiari
 */
public class BankAccount {
    private double balance;
    private int pinNumber;

    public BankAccount(double balance, int pinNumber) {
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    //setters and getters
    //accessors
    //modifiers
    
    @Override
    public String toString() {
        return "BankAccount{" + "balance=" + balance + ", pinNumber=" + pinNumber + '}';
    }
    
    
}
