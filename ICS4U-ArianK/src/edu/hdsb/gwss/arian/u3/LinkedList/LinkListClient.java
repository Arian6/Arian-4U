/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.LinkedList;

/**
 *
 * @author ARIAN
 */
public class LinkListClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkList a = new LinkList();

        System.out.println(a.head());
        System.out.println(a.tail());
        a.addAtFront("a");
        a.addAtFront("b");
        a.addAtFront("c");

        System.out.println(a.head());
        System.out.println(a.tail());

//        System.out.println(a.size());
//        a.removeTail();
//        System.out.println(a.size());
//         a.removeTail();
//        System.out.println(a.size());
//         a.removeTail();
//        System.out.println(a.size());
//         a.removeTail();
//        System.out.println(a.tail());
//        a.removeTail();
//        System.out.println(a.tail());
//         a.removeTail();
//        System.out.println(a.tail());
//         a.removeTail();
//       System.out.println(a.tail());
//        a.removeTail();
//       System.out.println(a.tail());
//        a.addAtFront("a");
//        a.addAtFront("b");
//        a.addAtFront("c");
//        System.out.println(a.size());
//        a.removeHead();
//        System.out.println(a.size());
//       // a.makeEmpty();
//        System.out.println(a.tail());
//        System.out.println(a.tail());
//
//        System.out.println(a.tail());
    }

}
