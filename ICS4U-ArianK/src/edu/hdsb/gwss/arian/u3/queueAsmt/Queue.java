/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.queueAsmt;

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

    public int front() {
        if (this.front == -1) {
            return -1;
        } else {
            return this.queue[this.front];
        }

    }

    public int back() {
        if (this.back == -1) {
            return -1;
        } else {
            return this.queue[this.back];
        }

    }

    @Override
    public void enqueue(int value) {

        if (!this.isFull()) {

            if (this.isEmpty()) {
                this.front++;
                this.back++;
                this.queue[this.back] = value;
            } else {
                this.back = (this.back + 1) % capacity();
                this.queue[this.back] = value;
            }

        }

    }

    @Override
    public int dequeue() {
        int holder = -1;

        if (!this.isEmpty()) {
            if (this.size() == 1) {
                holder = this.queue[front];
                this.makeEmpty();
            } else {
                holder = this.queue[front];
                this.queue[front] = 0;
                this.front = (this.front + 1) % this.capacity();
            }
        }

        return holder;

    }

    @Override
    public int size() {

        if (this.isEmpty()) {
            return 0;
        } else if (this.back == this.front) {
            return 1;
        } else if (this.back > this.front) {
            return ((this.back + 1) - this.front);
        } else {
            return (this.capacity() - this.front) + (this.back + 1);
        }

    }

    @Override
    public int capacity() {
        return this.queue.length;
    }

    @Override
    public boolean isEmpty() {
        if (this.front == -1 && this.back == -1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (this.size() == this.capacity()) {
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
