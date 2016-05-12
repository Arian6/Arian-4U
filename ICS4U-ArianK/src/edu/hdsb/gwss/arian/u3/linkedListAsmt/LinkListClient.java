/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.linkedListAsmt;

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

        assert (a.isEmpty());
        assert (a.head() == null);
        assert (a.tail() == null);

        //MAKE ASSERTIONS
        a.addAtEnd("a");
        a.addAtEnd("b");
        a.addAtEnd("c");

        assert (!a.isEmpty());
        assert (a.head().equals("a"));
        assert (a.tail().equals("c"));
        assert (a.size() == 3);

        a.addAtFront("1");
        a.addAtFront("2");
        a.addAtFront("3");

        assert (a.head().equals("3"));
        assert (a.tail().equals("c"));
        assert (a.size() == 6);
        System.out.println(a.toString());
        a.makeEmpty();
        assert (a.isEmpty());
        assert (a.toString().equals(""));
        System.out.println(a.toString());
//        System.out.println(a.size());
//        System.out.println(a.head());
//        System.out.println(a.tail());

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
