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

    private static final int DEFAULT_SIZE = 25;

    private int[] stack;
    private int top = -1;

    public Stack() {
        this.stack = new int[DEFAULT_SIZE];
    }

    public Stack(int capacity) {
        this.stack = new int[capacity];
    }

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
            this.top = this.top - 1;
            return this.top;
        }

    }

    public void push(int value) {
        this.top++;
        if (this.isFull()) {

           
        } else {
       
            stack[top] = value;
            
            
        }

    }

    public int size() {
        return top;
    }

    public int capacity() {
        return stack.length + 1;
    }

    public boolean isEmpty() {
        if (this.top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        
        if (this.top == 5) {
            return true;
        } else {
        return false;
        }

    }

    public void makeEmpty() {
        this.top = -1;
    }

}
