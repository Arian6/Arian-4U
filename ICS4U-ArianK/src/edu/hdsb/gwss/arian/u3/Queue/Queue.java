/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.Queue;

/**
 *
 * @author 1krasniqiari
 */
public class Queue implements QueueInterface {

    private static final int DEFAULT_SIZE = 25;

    private int[] queue;
    private int front = -1;
    private int back = -1;

    public Queue() {
        this.queue = new int[DEFAULT_SIZE];

    }

    public Queue(int capacity) {
        this.queue = new int[capacity];
    }

    @Override
    public int front() {
        if (this.front == -1) {
            return -1;
        } else {
            return this.queue[this.front];
        }

    }

    @Override
    public int back() {
        if (this.back == -1) {
            return -1;
        } else {
            return this.queue[this.back ];
        }

    }

    @Override
    public void enqueue(int value) {

        if (this.front == -1 && this.back == -1) {
            this.front++;
            this.back++;
        }
        if (!this.isFull()) {
             this.back = (back + 1) % this.queue.length;
            this.queue[back] = value;
            
            
        }
        //back ==  front + count - 1 % length
    }

    @Override
    public int dequeue() {
        int holder = 0;
        
        if (!this.isEmpty()) {

            holder = this.queue[front];
            this.queue[front] = 0;
            this.front = (this.front + 1) % this.queue.length;
        }
        
        return holder;

        //fronmt == front + 1 % length
    }

    @Override
    public int size() {

        if (this.back > this.front) {
            return (this.back - this.front) ;
        } else {
            return this.capacity() - this.front + this.back ;
        }

//        if(this.back - this.front < 0) {
//            return (this.back - this.front) * -1;
//        } else {
//        return this.back - this.front;
//        }
    }

    @Override
    public int capacity() {
        return this.queue.length ;
    }

    @Override
    public boolean isEmpty() {
        if (this.front == 0 && this.back == 0) {
            return false;
        } else if (this.front == this.back) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean isFull() {

//        if ((this.back - this.front) == -1 || (this.back - this.front) == (this.capacity() - 1)) {
//            return true;
//        }
//        return false;

        if (this.size() + 1== this.capacity()) {
                    return true;
                } else {
                    return false;
                }
    }

    @Override
    public void makeEmpty() {
        this.front = -1;
        this.back = -1;
    }

}
