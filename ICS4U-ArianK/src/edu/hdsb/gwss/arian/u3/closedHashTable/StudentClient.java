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

        int[] valuesAdded = new int[100];
        int nextSpot = 0;
        for (int i = 0; i < valuesAdded.length; i++) {
            valuesAdded[i] = -1;
        }

        HashTable ht = new HashTable(20);

        // EMPTY
        assert (ht.size() == 0);
        assert (ht.isEmpty());
        assert (ht.capacity() == 23);
        assert (ht.loadFactor() == 0.0);

        // HASH
        assert (ht.hash(0) == 0);
        assert (ht.hash(1) == 1);
        assert (ht.hash(ht.capacity()) == 0);
        assert (ht.hash(ht.capacity() - 1) == ht.capacity() - 1);
//
//        // PUT
        ht.put(0, new Student(0, "A", "B"));
        valuesAdded[nextSpot] = 0;
        nextSpot++;
        assert (!ht.isEmpty());
        assert (ht.size() == 1);
        assert (ht.containsKey(0));
        Student s = ht.get(0);
        assert (s.getKey() == 0);
        assert (ht.loadFactor() == (1.0 / (double) ht.capacity()) * 100);
//
        // PUT; SAME HASH VALUE
        ht.put(ht.capacity(), new Student(ht.capacity(), "A", "B"));
        valuesAdded[nextSpot] = ht.capacity();
        nextSpot++;
        assert (!ht.isEmpty());
        assert (ht.size() == 2);
        assert (ht.containsKey(ht.capacity()));
        s = ht.get(ht.capacity());
        assert (s.getKey() == ht.capacity());
        assert (ht.loadFactor() == (2.0 / (double) ht.capacity()) * 100);
//
//        // FILL WITH RANDOM NUMBERS TILL LOAD FACTOR REACHED
        int size = 2;
        for (; size < 17; size++) {
            int value = (int) (Math.random() * 100);
            ht.put(value, new Student(value, "A", "B"));
            valuesAdded[nextSpot] = value;
            nextSpot++;
            assert (ht.size() == size + 1);
            assert (ht.containsKey(value));
            s = ht.get(value);
            assert (s.getKey() == value);
            System.out.println("Load Factor: " + ht.loadFactor());
            System.out.println(size);
            System.out.println(ht.size());
        }

        // BEFORE RESIZE: 17/23 == Load Factor > 0.74
        assert (ht.size() == 17);
        assert (ht.loadFactor() < .75);
        assert (ht.capacity() == 23);
//
        // BEFORE RESIZE: 18/23 --> New Size: 18 / 0.25
        System.out.println("RESIZED");
        ht.put(666, new Student(666, "A", "B"));
        valuesAdded[nextSpot] = 666;
        nextSpot++;
        assert (ht.capacity() == 73);
        assert (ht.loadFactor() < 0.25);

        // MAKE SURE RESIZE WORKED; ALL VALUES ADDED CORRECTLY
        nextSpot = 0;
        int value;
        while (valuesAdded[nextSpot] > -1) {
            value = valuesAdded[nextSpot];
            assert (ht.containsKey(value));
            s = ht.get(value);
            assert (s.getKey() == value);
            nextSpot++;
        }

        // MAKE EMPTY
        ht.makeEmpty();
        // EMPTY
        assert (ht.size() == 0);
        assert (ht.isEmpty());
        assert (ht.capacity() == 73);
        assert (ht.loadFactor() == 0.0);
//        Student a = new Student(1, "1", "hg");
//        Student b = new Student(2, "2", "hg");
//        Student c = new Student(1, "3", "hg");
//        Student d = new Student(4, "4", "hg");
//        Student e = new Student(5, "5", "hg");
//        Student h = new Student(6, "5", "hg");
//
//        HashTable l = new HashTable(5);
//
//        System.out.println(l.capacity());
//        System.out.println(l.size());
//
//        l.put(a.getKey(), a);
//        l.put(b.getKey(), b);
//        l.put(c.getKey(), c);
//        l.put(d.getKey(), d);
//        l.put(e.getKey(), e);
//
//       // System.out.println(l.get(d.getKey()));
//        assert (l.contains(a));
//        assert (l.containsKey(a.getKey()));
//        assert (l.containsKey(b.getKey()));
//        assert (l.containsKey(1));
//        assert (l.containsKey(d.getKey()));
//        
//        assert (l.contains(a));
//        assert (l.contains(b));
//        //assert (l.contains(c));
//        assert (l.contains(d));
//        assert (l.contains(e));
//
////
//        System.out.println(l.size());
//        System.out.println(l.capacity());
//
//        l.remove(a.getKey());
//        System.out.println(l.size());
//        System.out.println(l.capacity());
////
////        System.out.println(l.loadFactor());
    }
}
