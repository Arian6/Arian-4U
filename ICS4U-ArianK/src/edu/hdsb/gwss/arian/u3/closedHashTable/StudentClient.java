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

        Student a = new Student(1, "1", "hg");
        Student b = new Student(1, "2", "hg");
        Student c = new Student(1, "3", "hg");
        Student d = new Student(1, "4", "hg");
        Student e = new Student(1, "5", "hg");

        HashTable l = new HashTable(5);

        System.out.println(l.capacity());
        System.out.println(l.size());

        l.put(a.getKey(), a);
        l.put(b.getKey(), b);
        l.put(c.getKey(), c);
        l.put(d.getKey(), d);
        l.put(e.getKey(), e);

        System.out.println(l.get(d.getKey()));

//
        System.out.println(l.size());
        System.out.println(l.capacity());
//
//        System.out.println(l.loadFactor());
    }
}
