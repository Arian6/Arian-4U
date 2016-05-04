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

        //TEST CASE 1 
        System.out.println("Base test");
        System.out.println();
        System.out.println(a.top());
        System.out.println(a.size());
        System.out.println(a.capacity());
        System.out.println(a.isEmpty());
        System.out.println(a.isFull());
        System.out.println(a.pop());
        System.out.println("----------------------------");
        System.out.println();

        //Test - push
        System.out.println("Push Test");
        System.out.println();
        System.out.println(a.top());
        System.out.println(a.size());
        System.out.println(a.capacity());
        System.out.println(a.isEmpty());
        System.out.println(a.isFull());
        a.push(1);
        System.out.println("----------------Push(1)---------------");
        System.out.println(a.top());
        System.out.println(a.size());
        System.out.println(a.capacity());
        System.out.println(a.isEmpty());
        System.out.println(a.isFull());
        System.out.println("----------------------------");
        System.out.println();
        
        //Test - pop off
        System.out.println("pop top");
        System.out.println();
        a.pop();
        System.out.println("----------------Pop---------------");
        System.out.println(a.top());
        System.out.println(a.size());
        System.out.println(a.capacity());
        System.out.println(a.isEmpty());
        System.out.println(a.isFull());
        System.out.println("----------------------------");
        System.out.println();

        //Test - fill stack
        System.out.println("fill stack");
        System.out.println();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
        System.out.println(a.top());
        System.out.println(a.size());
        System.out.println(a.capacity());
        System.out.println(a.isEmpty());
        System.out.println(a.isFull());
        System.out.println("----------------------------");
        System.out.println();
        
        //Test - fill stack after full
        System.out.println("fill stack after full");
        System.out.println();
        a.push(6);
        System.out.println("----------------Push(6)---------------");
        System.out.println(a.top());
        System.out.println(a.size());
        System.out.println(a.capacity());
        System.out.println(a.isEmpty());
        System.out.println(a.isFull());
        System.out.println("----------------------------");
        System.out.println();
        
        //Test - remove all
        System.out.println("remove all");
        System.out.println();
        a.makeEmpty();
        System.out.println(a.top());
        System.out.println(a.size());
        System.out.println(a.capacity());
        System.out.println(a.isEmpty());
        System.out.println(a.isFull());
        System.out.println("----------------------------");
        System.out.println();
        
        //Test - pop off at empty
        System.out.println("pop top while empty");
        System.out.println();
        a.pop();
        System.out.println("----------------Pop---------------");
        System.out.println(a.top());
        System.out.println(a.size());
        System.out.println(a.capacity());
        System.out.println(a.isEmpty());
        System.out.println(a.isFull());
        System.out.println("----------------------------");
        System.out.println();
        
    }

}
