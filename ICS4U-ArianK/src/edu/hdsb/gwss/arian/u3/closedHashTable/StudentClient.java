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
        Student b = new Student(2, "2", "hg");
        Student c = new Student(1, "3", "hg");
        Student d = new Student(4, "4", "hg");
        Student e = new Student(5, "5", "hg");
        Student h = new Student(6, "5", "hg");

        HashTable l = new HashTable(5);

        System.out.println(l.capacity());
        System.out.println(l.size());

        l.put(a.getKey(), a);
        l.put(b.getKey(), b);
        l.put(c.getKey(), c);
        l.put(d.getKey(), d);
        l.put(e.getKey(), e);

       // System.out.println(l.get(d.getKey()));
        assert (l.contains(a));
        assert (l.containsKey(a.getKey()));
        assert (l.containsKey(b.getKey()));
        assert (l.containsKey(1));
        assert (l.containsKey(d.getKey()));
        
        assert (l.contains(a));
        assert (l.contains(b));
        //assert (l.contains(c));
        assert (l.contains(d));
        assert (l.contains(e));

//
        System.out.println(l.size());
        System.out.println(l.capacity());

        l.remove(a.getKey());
        System.out.println(l.size());
        System.out.println(l.capacity());
//
//        System.out.println(l.loadFactor());
    }
}
