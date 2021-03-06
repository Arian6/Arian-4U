package edu.hdsb.gwss.arian.u3.stackAsmt;

/**
 * Lesson: 6.01 - Stacks
 */
public interface StackInterface {

    public int top();

    public int pop();

    public void push(int value);

    public int size();

    public int capacity();

    public boolean isEmpty();

    public boolean isFull();

    public void makeEmpty();

}
