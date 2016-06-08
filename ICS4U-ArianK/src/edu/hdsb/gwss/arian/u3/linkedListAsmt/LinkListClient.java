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
        //LinkList a = new LinkList();

        LinkList ll = new LinkList();

        // EMPTY
        assert (ll.size() == 0);
        assert (ll.isEmpty());

        // REMOVE: EMPTY
        System.out.println("CASE 1: REMOVE NON EXISTING");
        ll.remove("ABC");

        // ADD @ FRONT; SIZE 1
        System.out.println("CASE 2: ADD AT FRONT / REMOVE ONLY ELEMENT");
        ll.addAtFront("ABC");
        System.out.println("DATA: " + ll.toString());
        ll.remove("ABC");
        assert (ll.size() == 0);
        assert (ll.isEmpty());

        // ADD @ END; SIZE 1
        System.out.println("CASE 3: ADD AT END / REMOVE ONLY ELEMENT");
        ll.addAtEnd("ABC");
        System.out.println("DATA: " + ll.toString());
        ll.remove("ABC");
        assert (ll.size() == 0);
        assert (ll.isEmpty());

        // ADD @ FRONT; SIZE 2
        System.out.println("CASE 4: ADD AT FRONT / REMOVE 2 ELEMENT");
        ll.addAtFront("ABC");
        ll.addAtFront("XYZ");
        System.out.println("DATA: " + ll.toString());
        assert (ll.size() == 2);
        ll.remove("XYZ");
        System.out.println("DATA: " + ll.toString());
        assert (ll.size() == 1);
        ll.remove("ABC");
        System.out.println("DATA: " + ll.toString());

        // ADD @ BACK; SIZE 2
        System.out.println("CASE 5: ADD AT END / REMOVE 2 ELEMENT");
        ll.addAtEnd("ABC");
        ll.addAtEnd("XYZ");
        System.out.println("DATA: " + ll.toString());
        assert (ll.size() == 2);
        ll.remove("XYZ");
        System.out.println("DATA: " + ll.toString());
        assert (ll.size() == 1);
        ll.remove("ABC");
        System.out.println("DATA: " + ll.toString());

        // REMOVE; MIDDLE
        System.out.println("CASE 6: REMOVE TWO ELEMENTS");
        ll.addAtFront("ABC");
        ll.addAtFront("123");
        ll.addAtFront("XYZ");
        System.out.println("DATA: " + ll.toString());
        assert (ll.size() == 3);
        ll.remove("123");
        System.out.println("DATA: " + ll.toString());
        assert (ll.size() == 2);
        ll.remove("XYZ");
        System.out.println("DATA: " + ll.toString());
        assert (ll.size() == 1);
        ll.remove("ABC");
        System.out.println("DATA: " + ll.toString());

        //EMPTY TEST
//        assert (a.isEmpty());
//        assert (a.head() == null);
//        assert (a.tail() == null);
//
//        //ADD SINGLE
//        a.addAtFront("a");
//        assert (!a.isEmpty());
//        assert (a.head().equals("a"));
//        assert (a.tail().equals("a"));
//        assert (a.size() == 1);
//
//        //ADD AT FRONT
//        a.addAtFront("b");
//        assert (!a.isEmpty());
//        assert (a.head().equals("b"));
//        assert (a.tail().equals("a"));
//        assert (a.size() == 2);
//
//        //ADD AT END
//        a.addAtEnd("c");
//        assert (!a.isEmpty());
//        assert (a.head().equals("b"));
//        assert (a.tail().equals("c"));
//        assert (a.size() == 3);
//
//        //To String
//        System.out.println(a.toString());
//
//        //Make Empty
//        a.makeEmpty();
//        assert (a.isEmpty());
//        System.out.println(a.toString());
//
//        //Add Multiple
//        a.addAtEnd("a");
//        a.addAtEnd("b");
//        a.addAtEnd("c");
//        a.addAtEnd("d");
//        a.addAtEnd("e");
//
//        assert (!a.isEmpty());
//        assert (a.head().equals("a"));
//        assert (a.tail().equals("e"));
//        assert (a.size() == 5);
//        System.out.println(a.toString());
//
//        //Remove Head
//        assert (a.head().equals("a"));
//        assert (a.size() == 5);
//
//        a.removeHead();
//
//        assert (!a.isEmpty());
//        assert (a.head().equals("b"));
//        assert (a.tail().equals("e"));
//        assert (a.size() == 4);
//        System.out.println(a.toString());
//
//        //Remove Tail
//        assert (a.tail().equals("e"));
//        assert (a.size() == 4);
//
//        a.removeTail();
//
//        assert (!a.isEmpty());
//        assert (a.head().equals("b"));
//        assert (a.tail().equals("d"));
//        assert (a.size() == 3);
//        System.out.println(a.toString());
//
//        //Remove 
//        assert (a.size() == 3);
//
//        a.remove("c");
//
//        assert (!a.isEmpty());
//        assert (a.head().equals("b"));
//        assert (a.tail().equals("d"));
//        assert (a.size() == 2);
//        System.out.println(a.toString());
    }

}
