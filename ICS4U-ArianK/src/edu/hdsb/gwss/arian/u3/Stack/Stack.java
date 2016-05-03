/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.Stack;

/**
 *
 * @author 1krasniqiari
 */
public class Stack implements StackInterface {

    private static final int DEFAULT_SIZE = 10;
    
    
    private int[] stack;
    private int top = -1;

    public int top() {
        if (top == -1) {
            return -1;
        } else {
            return top;
        }
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        } else {
            return this.top--;
        }
        
    }

    
    public void push(int value) {
        if(this.isFull()){
            
        }
    }

   
    public int size() {
        return top - 1;
    }

    
    public int capacity() {
        return stack.length - 1;
    }

   
    public boolean isEmpty() {
        if(this.top == -1) {
            return true;
        } else {
            return false;
        }
    }

    
    public boolean isFull() {
        if(this.top == this.capacity()) {
            return true;
        } else {
            return false;
        }
    }

    
    public void makeEmpty() {
        this.top = -1;
    }
    
    

    
}
