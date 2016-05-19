/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.closedHashTable;

/**
 *
 * @author ARIAN
 */
public class StudentClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student a = new Student(1, "hg", "hg");
        Student b = new Student(1, "hg", "hg");
        Student c = new Student(1, "hg", "hg");
        Student d = new Student(1, "hg", "hg");
        Student e = new Student(1, "hg", "hg");

        HashTable l = new HashTable(5);

        System.out.println(l.capacity());
        System.out.println(l.size());

        l.put(4, a);
        l.put(4, b);
        l.put(4, c);
        l.put(4, d);
        l.put(4, e);

//
        System.out.println(l.size());
        System.out.println(l.capacity());
//
//        System.out.println(l.loadFactor());
    }
}
