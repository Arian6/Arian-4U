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
public class BankAccountClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        BankAccount a = new BankAccount(100, 1234);
        //System.out.println(a.pinNumber);
        //a.balance = 1000000;
        System.out.println(a.toString());
    }
    
}
