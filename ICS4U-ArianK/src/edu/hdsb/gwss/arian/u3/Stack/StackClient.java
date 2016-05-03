/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.Stack;

/**
 *
 * @author ARIAN
 */
public class StackClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack a = new Stack(5);
        
        System.out.println(a.top());
        a.push(5);
        a.push(5);
        a.push(5);
      a.push(5);
        a.push(5);
        a.push(5);
        a.push(5);
        
        
         System.out.println(a.top());
         
        
        
    }
    
}
