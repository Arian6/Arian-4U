package edu.hdsb.gwss.arian.u3.queueAsmt;

/**
 * Lesson: 6.02 - Queue
 */
public interface QueueInterface {
    
    public int front();
    
    public int back();
    
    public void enqueue( int value );

    public int dequeue();

    public int size();
    
    public int capacity();

    public boolean isEmpty();
    
    public boolean isFull();

    public void makeEmpty();

}
