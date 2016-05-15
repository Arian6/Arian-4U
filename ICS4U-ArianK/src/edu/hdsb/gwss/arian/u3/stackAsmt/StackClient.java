/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.stackAsmt;

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
        
        //Default tests
        System.out.println("Default test");
        System.out.println();
         Stack aDefault = new Stack();
        assert (aDefault.top() == -1);
        assert (aDefault.size() == 0);
        assert (aDefault.capacity() == 25);
        assert (aDefault.isEmpty());
        assert (!aDefault.isFull());
        assert (aDefault.pop() == -1);
          System.out.println("----------------------------");
        System.out.println();

          
        
        
        Stack a = new Stack(5);

        //TEST CASE 1 
        System.out.println("Base test");
        System.out.println();
        assert (a.top() == -1);
        assert (a.size() == 0);
        assert (a.capacity() == 5);
        assert (a.isEmpty());
        assert (!a.isFull());
        assert (a.pop() == -1);
        System.out.println("----------------------------");
        System.out.println();

        //Test - push
        System.out.println("Push Test");
        System.out.println();
        assert (a.top() == -1);
        assert (a.capacity() == 5);
        assert (a.isEmpty());
        assert (!a.isFull());

        a.push(1);
        System.out.println("----------------Push(1)---------------");
        assert (a.top() == 1);
        assert (a.size() == 1);
        assert (a.capacity() == 5);
        assert (!a.isEmpty());
        assert (!a.isFull());
        System.out.println("----------------------------");
        System.out.println();

        //Test - pop off
        System.out.println("pop top");
        System.out.println();
        a.pop();
        System.out.println("----------------Pop---------------");
        assert (a.top() == -1);
        assert (a.capacity() == 5);
        assert (a.isEmpty());
        assert (!a.isFull());
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
        assert (a.top() == 5);
        assert (a.size() == 5);
        assert (a.capacity() == 5);
        assert (!a.isEmpty());
        assert (a.isFull());
        System.out.println("----------------------------");
        System.out.println();

        //Test - fill stack after full
        System.out.println("fill stack after full");
        System.out.println();
        a.push(6);
        System.out.println("----------------Push(6)---------------");
        assert (a.top() == 5);
        assert (a.size() == 5);
        assert (a.capacity() == 5);
        assert (!a.isEmpty());
        assert (a.isFull());
        System.out.println("----------------------------");
        System.out.println();

        //Test - remove all
        System.out.println("remove all");
        System.out.println();
        a.makeEmpty();
        assert (a.top() == -1);
        assert (a.size() == 0);
        assert (a.capacity() == 5);
        assert (a.isEmpty());
        assert (!a.isFull());
        System.out.println("----------------------------");
        System.out.println();

        //Test - pop off at empty
        System.out.println("pop top while empty");
        System.out.println();
        a.pop();
        System.out.println("----------------Pop---------------");
        assert (a.top() == -1);
        assert (a.size() == 0);
        assert (a.capacity() == 5);
        assert (a.isEmpty());
        assert (!a.isFull());
        System.out.println("----------------------------");
        System.out.println();

    }

}
