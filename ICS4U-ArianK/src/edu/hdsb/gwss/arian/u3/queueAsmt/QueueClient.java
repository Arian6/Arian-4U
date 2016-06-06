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

        Queue q = new Queue(10);

        // EMPTY QUEUE
        assert (q.size() == 0);
        assert (q.isEmpty() == true);
        assert (q.isFull() == false);
        System.out.println("CASE 1: DEQUEUE EMPTY");
        assert (q.dequeue() == -1);

        // ENQUEUE; NO WRAP AROUND
        System.out.println("=== FILL QUEUE ===");
        for (int i = 0; i < q.capacity(); i++) {
            assert (q.isFull() == false);
            q.enqueue(i);
            //  q.displayQueue();
            assert (q.isEmpty() == false);
            assert (q.size() == i + 1);
            assert (q.front() == 0);
            assert (q.back() == i);
        }

        //  DEQUEUE; NO WRAP AROUND
        System.out.println("=== EMPTY QUEUE ===");
        int value;
        for (int i = 0; i < q.capacity(); i++) {
            assert (q.back() == q.capacity() - 1);
            assert (q.front() == i);
            value = q.dequeue();
            //  q.displayQueue();
            if (i != q.capacity() - 1) {
                assert (q.front() == i + 1);
            }
            assert (q.size() == q.capacity() - i - 1);
        }

        // EMPTY QUEUE
        assert (q.front() == -1);
        assert (q.back() == -1);
        System.out.println("CASE 4: DEQUEUE EMPTY");
        assert (q.dequeue() == -1);
        assert (q.size() == 0);
        assert (q.isEmpty() == true);
        assert (q.isFull() == false);

        // ENQUEUE; FULL  
        System.out.println("=== FILL QUEUE ===");
        for (int i = 0; i < q.capacity(); i++) {
            assert (q.isFull() == false);
            q.enqueue(i);
            //   q.displayQueue();
            assert (q.isEmpty() == false);
            assert (q.size() == i + 1);
            assert (q.front() == 0);
            assert (q.back() == i);
        }

        System.out.println("=== EMPTY 1/2 QUEUE ===");
        //  DEQUEUE; HALF
        int half = q.capacity() / 2;
        for (int i = 0; i < half; i++) {
            assert (q.back() == q.capacity() - 1);
            assert (q.front() == i);
            value = q.dequeue();
            //  q.displayQueue();
            if (i != q.capacity() - 1) {
                assert (q.front() == i + 1);
            }
            assert (q.size() == q.capacity() - i - 1);
        }

        // ENQUEUE; HALF to FILL
        System.out.println("=== ENQUEUE 1/2 WRAP AROUND ===");
        System.out.println(q.size());
        for (int i = half; i < q.capacity(); i++) {
            assert (q.isFull() == false);
            q.enqueue(half + i);
            //  q.displayQueue();
            assert (q.isEmpty() == false);
            assert (q.size() == (i + 1));
        }

        // MAKE EMPTY
        assert (q.isFull() == true);
        q.makeEmpty();
        assert (q.size() == 0);
        assert (q.isEmpty() == true);

//        Queue queueDefault = new Queue();
//        //Default tests
//        assert (queueDefault.isEmpty());
//        assert (!queueDefault.isFull());
//        assert (queueDefault.front() == -1);
//        assert (queueDefault.back() == -1);
//        assert (queueDefault.capacity() == 25);
//
//        Queue queue = new Queue(5);
//
//        //EMPTY TESTS
//        assert (queue.isEmpty());
//        assert (!queue.isFull());
//        assert (queue.front() == -1);
//        assert (queue.back() == -1);
//        assert (queue.capacity() == 5);
//
//        //ADD 1
//        queue.enqueue(1);
//
//        assert (!queue.isEmpty());
//        assert (queue.size() == 1);
//        assert (!queue.isFull());
//        assert (queue.front() == 1);
//        assert (queue.back() == 1);
//        assert (queue.capacity() == 5);
//
//        //Fill Queue
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(5);
//
//        assert (queue.size() == 5);
//        assert (!queue.isEmpty());
//        assert (queue.isFull());
//        assert (queue.front() == 1);
//        assert (queue.back() == 5);
//        assert (queue.capacity() == 5);
//
//        //Fill 1 more
//        queue.enqueue(6);
//
//        assert (queue.size() == 5);
//        assert (!queue.isEmpty());
//        assert (queue.isFull());
//        assert (queue.front() == 1);
//        assert (queue.back() == 5);
//        assert (queue.capacity() == 5);
//
//        //Dequeue
//        queue.dequeue();
//
//        assert (queue.size() == 4);
//        assert (!queue.isEmpty());
//        assert (!queue.isFull());
//        assert (queue.front() == 2);
//        assert (queue.back() == 5);
//        assert (queue.capacity() == 5);
//
//        //Make Empty
//        queue.makeEmpty();
//        assert (queue.size() == 0);
//        assert (queue.isEmpty());
//        assert (!queue.isFull());
//        assert (queue.front() == -1);
//        assert (queue.back() == -1);
//        assert (queue.capacity() == 5);
//
//        //dequeuq when empty
//        queue.dequeue();
//
//        assert (queue.size() == 0);
//        assert (queue.isEmpty());
//        assert (!queue.isFull());
//        assert (queue.front() == -1);
//        assert (queue.back() == -1);
//        assert (queue.capacity() == 5);
    }

}
