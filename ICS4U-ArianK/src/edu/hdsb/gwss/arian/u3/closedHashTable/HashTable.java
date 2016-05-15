/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.arian.u3.closedHashTable;

/**
 *
 * @author 1krasniqiari
 */
public class HashTable implements HashTableInterface {

    private Student[] hashTable;

    public HashTable() {

    }

    public HashTable(int capacity) {
        hashTable = new Student[capacity];

    }

    @Override
    public int size() {
        int size = 0;

        for (int i = 0; i < this.hashTable.length - 1; i++) {
            if (this.hashTable[i] != null) {
                size = size + 1;
            }
        }

        return size;
    }

    @Override
    public int capacity() {
        return this.hashTable.length;
    }

    @Override
    public double loadFactor() {

        return (this.size() / (double) this.capacity()) * 100;
    }

    @Override
    public void makeEmpty() {
        for (int i = 0; i < this.hashTable.length - 1; i++) {
            this.hashTable[i] = null;
        }

    }

    @Override
    public boolean isEmpty() {
        if (this.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void resize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student get(int key) {
        return this.hashTable[key];
    }

    @Override
    public Student remove(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void put(int key, Student value) {

        this.hashTable[key] = value;
    }

    @Override
    public boolean contains(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsKey(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hash(int key) {
        

       
    }

}
