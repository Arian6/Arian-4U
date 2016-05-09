/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.Queue;

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

        //queue.enqueue("E");
//        System.out.println(1 % 5);
        Queue queue = new Queue(5);
//System.out.println(queue.front());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println(queue.size());
        System.out.println(queue.front());
        System.out.println(queue.back());
        System.out.println();

        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.front());
        System.out.println(queue.back());
        System.out.println();

        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.front());
        System.out.println(queue.back());
        System.out.println();
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.front());
        System.out.println(queue.back());
        System.out.println();
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.front());
        System.out.println(queue.back());
        System.out.println();
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.front());
        System.out.println(queue.back());
        System.out.println();
    }

}
