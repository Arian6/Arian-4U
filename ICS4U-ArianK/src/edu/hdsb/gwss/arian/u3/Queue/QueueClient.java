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
        Queue a = new Queue(4);
         
        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(3);
        a.enqueue(4);
        //queue.enqueue("E");
        System.out.println(a.size());
        System.out.println(a.dequeue());
        a.enqueue(5);
        System.out.println(a.size());
        //queue.enqueue("F");
        System.out.println(a.dequeue());
        System.out.println(a.size());
    }
    
}
