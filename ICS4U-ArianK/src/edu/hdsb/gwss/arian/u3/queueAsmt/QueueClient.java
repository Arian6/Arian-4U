/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.queueAsmt;

/**
 *
 * @author ARIAN
 */
public class QueueClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Queue queue = new Queue(5);

        //EMPTY TESTS
        assert (queue.isEmpty());
        assert (!queue.isFull());
        assert (queue.front() == -1);
        assert (queue.back() == -1);
        assert (queue.capacity() == 5);

        //ADD 1
        queue.enqueue(1);

        assert (!queue.isEmpty());
        assert (queue.size() == 1);
        assert (!queue.isFull());
        assert (queue.front() == 1);
        assert (queue.back() == 1);
        assert (queue.capacity() == 5);

        //Fill Queue
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        assert (queue.size() == 5);
        assert (!queue.isEmpty());
        assert (queue.isFull());
        assert (queue.front() == 1);
        assert (queue.back() == 5);
        assert (queue.capacity() == 5);

        //Fill 1 more
        queue.enqueue(6);

        assert (queue.size() == 5);
        assert (!queue.isEmpty());
        assert (queue.isFull());
        assert (queue.front() == 1);
        assert (queue.back() == 5);
        assert (queue.capacity() == 5);

        //Dequeue
        queue.dequeue();

        assert (queue.size() == 4);
        assert (!queue.isEmpty());
        assert (!queue.isFull());
        assert (queue.front() == 2);
        assert (queue.back() == 5);
        assert (queue.capacity() == 5);

        //Make Empty
        queue.makeEmpty();
        assert (queue.size() == 0);
        assert (queue.isEmpty());
        assert (!queue.isFull());
        assert (queue.front() == -1);
        assert (queue.back() == -1);
        assert (queue.capacity() == 5);

        //dequeuq when empty
        queue.dequeue();

        assert (queue.size() == 0);
        assert (queue.isEmpty());
        assert (!queue.isFull());
        assert (queue.front() == -1);
        assert (queue.back() == -1);
        assert (queue.capacity() == 5);

    }

}
